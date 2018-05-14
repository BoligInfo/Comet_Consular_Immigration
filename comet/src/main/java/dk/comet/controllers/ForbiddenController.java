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
public class ForbiddenController {

    @RequestMapping(value={"/the_forbidden.html"}, method = RequestMethod.GET)
    public ModelAndView forbidden(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("the_forbidden");
        return modelAndView;
    }

}
