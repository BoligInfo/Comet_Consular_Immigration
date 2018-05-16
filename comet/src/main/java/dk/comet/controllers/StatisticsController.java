package dk.comet.controllers;

import dk.comet.models.Statistics;
import dk.comet.repositories.StatisticsRepository;
import dk.comet.services.statisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StatisticsController {

    @Autowired
    private StatisticsRepository statisticsRepository;

    @Autowired
    private statisticsService statisticsService;

    @RequestMapping(value = {"/statistics.html"}, method = RequestMethod.GET)
    public ModelAndView forbidden() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("statistics");
        Statistics stats = statisticsService.opsætning(50);
        modelAndView.addObject("entity",stats);
        return modelAndView;
    }
}