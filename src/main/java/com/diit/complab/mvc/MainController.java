package com.diit.complab.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    @Qualifier("daoStub") //TODO убрать заглушку, юзать dao
    private EmployeeDao employeeDao;

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
        List<Employee> all = employeeDao.getAll();
        model.addAttribute(all);
        return "jsonView";
    }
}