/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.person.dao;

import br.com.betaworkspim.person.model.Employee;
import java.util.List;
import org.hibernate.exception.DataException;

/**
 *
 * @author andreivaz
 */
public interface IEmployeeDAO {
    
    List getEmployeeList() throws DataException;
    Employee getEmployee(Employee employee) throws DataException;
    void addEmployee(Employee employee) throws DataException;
    void deleteEmployee(Employee employee) throws DataException;
    void mergeEmployee (Employee employee) throws DataException;
    
        
}
