/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.tests;

import br.com.betaworkspim.person.dao.EmployeeDAOImpl;
import br.com.betaworkspim.person.model.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrei.duartevaz
 */
public class EmployeeDAOTest {
    
    EmployeeDAOImpl employeeDao = new EmployeeDAOImpl();  
    
    @Test
    public void addEmployeeTest() {
        Employee e = new Employee();
        e.setAddress("Endereco 1");
        e.setBirthDate(null);
        e.setCpf("111111111111");
        e.setEmail("andrei@email.com");
        e.setName("Andrei");
        e.setRg("11111111111");
        e.setTelephone("1112222222");
        employeeDao.addEmployee(e);
        assertEquals(e, employeeDao.getEmployee(e));
    }
    
   
    
}

