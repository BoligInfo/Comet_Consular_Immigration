package dk.comet.services;

import dk.comet.models.Questions;
import dk.comet.models.Statistics;
import dk.comet.repositories.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("statisticsImpl")
public class statisticsImpl implements statisticsService{

    @Autowired
    private StatisticsRepository statisticsRepository;

    @Override
    public void saveStatistics(Statistics statistics) {
    statisticsRepository.save(statistics);
    }

    @Override
    public Statistics opsætning(int amount) {
        Statistics information = new Statistics();
        information.setAmount(amount);
        saveStatistics(information);
        return information;
    }

    @Override
    public void inputquestion(Questions questions) {
        System.out.println(questions.getQuestion() + " " + questions.getAnswer());
    }

    @Override
    public Questions showQuestion(int question) {
        Questions questions = new Questions();
        if(question == 1) {
            questions.setQuestion("Welcome to USA");
        } else if (question == 2) {
            questions.setQuestion("Welcome to England");
        }
        else {
            questions.setQuestion("We dont have any answer for that");
        }

        return questions;
    }
}
