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
public class NationalityController {

    @RequestMapping(value={"/nationality.html"}, method = RequestMethod.GET)
    public ModelAndView forgotPassword(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("nationality");
        return modelAndView;
    }

}
