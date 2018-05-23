package dk.comet.controllers;


import dk.comet.models.Questions;
import dk.comet.services.NationalityResponse;
import dk.comet.services.NationalityResponseService;
import dk.comet.services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {

    Questions questions = new Questions();

    @Autowired
    private StatisticsService statisticsService;

    @Autowired
    private NationalityResponse nationality;

    @Autowired
    private NationalityResponseService nationalityResponse;

    @RequestMapping(value={"/question/{country}"}, method = RequestMethod.GET)
    public ModelAndView question(@PathVariable("country") String country){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("country/"+country);
        return modelAndView;
    }

    @RequestMapping(value={"/question/{country}/nationality"}, method = RequestMethod.GET)
    public ModelAndView questionNation(@PathVariable("country") String country){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("nationality");
        return modelAndView;
    }

    @RequestMapping(value={"/question/{country}/nationality"}, method = RequestMethod.POST)
    public ModelAndView questionNation(@PathVariable("country") String country,@RequestParam String land){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(nationalityResponse.getNationalityResponseBasedOnCountry(land,country));
       // modelAndView.setViewName(nationality.getNationalityResponseBasedOnCountry(land,country));
        return modelAndView;
    }

/*
    @RequestMapping(value={"/question/{country}/{question}"}, method = RequestMethod.GET)
    public ModelAndView question(@PathVariable("country") String country, @PathVariable("question") String question){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("country/"+country);
       // questions = StatisticsService.showQuestion(Integer.parseInt(question));
       // modelAndView.addObject("Questions", questions);
        return modelAndView;
    }*/


}
