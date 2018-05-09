package dk.comet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *  @author Jens Bäckvall
 *
 */
@Controller
public class NeedsController {

    @RequestMapping(value={"/us_needs.html"}, method = RequestMethod.GET)
    public ModelAndView forgotPassword(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("us_needs");
        return modelAndView;
    }

}
