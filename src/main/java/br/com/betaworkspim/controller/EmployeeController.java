/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.controller;

import br.com.betaworkspim.person.service.IEmployeeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andreivaz
 */
@Controller
public class EmployeeController {
    
    private IEmployeeService employeeService;

    @RequestMapping("/employees")
    public String employessList(){
        return "views/employee/employees";
    }
    
    
    public ModelAndView getEmployeesList(){
        ModelAndView model = new ModelAndView("employeesList");
        model.addObject("employeesList", employeeService.getEmployeesList());
        return model;
    }
    
    
    
    public IEmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    
    
}
