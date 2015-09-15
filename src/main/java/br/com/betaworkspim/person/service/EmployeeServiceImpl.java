/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.person.service;

import br.com.betaworkspim.person.dao.IEmployeeDAO;
import java.util.List;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andreivaz
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService{
    
    @Autowired
    private IEmployeeDAO employeeDAO;
    
    @Override
    public List getEmployeesList() throws DataException {
        return employeeDAO.getEmployeeList();
    }
    
    
    
    public IEmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    
}
