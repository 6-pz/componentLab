package com.diit.complab.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
            model.addAttribute("message", "Hello world!");
            return "index";
    }

    @RequestMapping(value = "form.html", method = RequestMethod.GET)
    public String printForm(ModelMap model) {
        return "form";
    }

    @RequestMapping(value = "get.json", method = RequestMethod.GET)
    public String getModel(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        model.addAttribute("message2", "Hello world!");
        model.addAttribute("message3", "Hello world!");
        return "jsonView";
    }

}