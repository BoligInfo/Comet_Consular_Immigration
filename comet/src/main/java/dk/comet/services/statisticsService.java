package dk.comet.services;

import dk.comet.models.Questions;
import dk.comet.models.Statistics;

public interface StatisticsService {

    void saveStatistics(Statistics statistics);
    Statistics opsætning(int amount);

    void inputquestion(Questions questions);

    Questions showQuestion(int question);
}
