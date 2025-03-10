package controller;

import model.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan()
public class HomeController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/lion")
    public String lionPage(Model model) {
        Lion lion = new Lion();
        model.addAttribute("lion", lion);
        return "lion";
    }

    @GetMapping("/dolphin")
    public String dolphinPage(Model model) {
        Dolphin dolphin = new Dolphin();
        model.addAttribute("dolphin", dolphin);
        return "dolphin";
    }

    @GetMapping("/moose")
    public String moosePage(Model model) {
        Moose moose = new Moose();
        model.addAttribute("moose", moose);
        return "moose";
    }

    @GetMapping("/crab")
    public String crabPage(Model model) {
        Crab crab = new Crab();
        model.addAttribute("crab", crab);
        return "crab";
    }

    @GetMapping("/bear")
    public String bearPage(Model model) {
        Bear bear = new Bear();
        model.addAttribute("bear", bear);
        return "bear";
    }
}
