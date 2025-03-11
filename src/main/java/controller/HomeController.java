package controller;

import model.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan()
public class HomeController {

    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/home/index";
    }

    @GetMapping("/home/index")
    public String index(){
        return "home/index";
    }

    @GetMapping("/about/about")
    public String about(){
        return "about/about";
    }

    @GetMapping("/animals/lion")
    public String lionPage(Model model) {
        Lion lion = new Lion();
        model.addAttribute("lion", lion);
        return "animals/lion";
    }

    @GetMapping("/animals/dolphin")
    public String dolphinPage(Model model) {
        Dolphin dolphin = new Dolphin();
        model.addAttribute("dolphin", dolphin);
        return "animals/dolphin";
    }

    @GetMapping("/animals/moose")
    public String moosePage(Model model) {
        Moose moose = new Moose();
        model.addAttribute("moose", moose);
        return "animals/moose";
    }

    @GetMapping("/animals/crab")
    public String crabPage(Model model) {
        Crab crab = new Crab();
        model.addAttribute("crab", crab);
        return "animals/crab";
    }

    @GetMapping("/animals/bear")
    public String bearPage(Model model) {
        Bear bear = new Bear();
        model.addAttribute("bear", bear);
        return "animals/bear";
    }
}
