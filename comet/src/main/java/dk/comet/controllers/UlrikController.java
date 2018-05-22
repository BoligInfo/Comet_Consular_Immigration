package dk.comet.controllers;


import dk.comet.prototyping.PageTraveller;
import dk.comet.prototyping.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UlrikController {

    PageTraveller pt = new PageTraveller();
    Question q;

    @GetMapping("ulrik")
    public String ulrik(@RequestParam(name = "page", required = false, defaultValue = "0") String page, Model model) {

        int p = Integer.parseInt(page);
        q = pt.goToPage(p);

        model.addAttribute("title", q.getTitle());
        model.addAttribute("text", q.getText());
        model.addAttribute("paths", q.getPaths());

        return "ulrik";
    }



/*
    @GetMapping("/ulrik")
    public String ulrik(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "ulrik";
    }

*/
/*
  //  @RequestMapping(value ={"ulrik"}, method = RequestMethod.GET)
    public ModelAndView ulrik() {
        ModelAndView view = new ModelAndView();
        view.setViewName("ulrik");
        return view;
    }
*/

}
