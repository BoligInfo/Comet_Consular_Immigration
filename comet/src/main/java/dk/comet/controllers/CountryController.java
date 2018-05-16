package dk.comet.controllers;


import dk.comet.models.Questions;
import dk.comet.services.statisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {

    Questions questions = new Questions();

    @Autowired
    private dk.comet.services.statisticsService statisticsService;

    @RequestMapping(value={"/{country}/{question}"}, method = RequestMethod.GET)
    public ModelAndView index(@PathVariable("country") String country, @PathVariable("question") String question){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("country/"+country);
        questions = statisticsService.showQuestion(Integer.parseInt(question));
        modelAndView.addObject("Questions", questions);
        return modelAndView;
    }


}
