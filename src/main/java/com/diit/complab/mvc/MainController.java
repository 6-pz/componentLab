package com.diit.complab.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {
    private EmployeeDao employeeDao;

    @Autowired
    @Qualifier("dao") //TODO убрать заглушку, юзать dao
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    @RequestMapping(value = "addEmp.json", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    private void addEmployee(@RequestBody Employee employee) {
        employeeDao.add(employee);
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
        List<Employee> employee = employeeDao.getAll();
        model.addAttribute(employee);
        return "jsonView";
    }
}
