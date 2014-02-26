package com.diit.complab.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
    private EmployeeDao employeeDao;

    @Autowired
    @Qualifier("daoStub") //TODO убрать заглушку, юзать dao
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
            return "index";
    }

    @RequestMapping(value = "form.html", method = RequestMethod.GET)
    public String printForm(ModelMap model) {
        return "form";
    }

    @RequestMapping(value = "get.json", method = RequestMethod.GET)
    public String getModel(ModelMap model) {
        List<Employee> list = employeeDao.getAll();
        model.addAttribute(list);
        return "jsonView";
    }

    @RequestMapping(value = "getById.json", method = RequestMethod.GET)
    public String getModelById(@RequestParam int id, ModelMap model) {
        Employee employee = employeeDao.getById(id);
        model.addAttribute(employee);
        return "jsonView";
    }
}