package dk.comet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *  @author Steen Petersen
 *
 */
@Controller
public class LandingPageController {

    @RequestMapping(value={"index"}, method = RequestMethod.GET)
    public ModelAndView forgotPassword(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

}