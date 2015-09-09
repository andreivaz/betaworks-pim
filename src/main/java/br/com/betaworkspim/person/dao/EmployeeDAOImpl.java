/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.person.dao;

import br.com.betaworkspim.person.model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.exception.DataException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andreivaz
 */
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO{
    
    @PersistenceContext
    private EntityManager manager;
    
    
    @Override
    public List getEmployeeList() throws DataException{
        List employees = new ArrayList();
        try {
            employees = manager.createQuery("select e from Employee e").getResultList();
            return employees;
        } catch (Exception e) {
            System.out.println("Error getting getEmployeeList: "+e);
        }
        return null;
    }

    @Override
    public Employee getEmployee(Employee employee) throws DataException {
        try {
            employee = manager.find(Employee.class, employee);
            return employee;
        } catch (Exception e) {
            System.out.println("Error getting getEmployee: "+e);
        }
        return null;
    }

    @Override
    public void addEmployee(Employee employee) throws DataException {
        try {
            manager.persist(employee);
        } catch (Exception e) {
            System.out.println("Error getting addEmployee: "+e);
        }
    }

    @Override
    public void deleteEmployee(Employee employee) throws DataException {
        try {
            manager.remove(employee);
        } catch (Exception e) {
            System.out.println("Error getting deleteEmployee: "+e);
        }
    }

    @Override
    public void mergeEmployee(Employee employee) throws DataException {
        try {
            manager.merge(employee);
        } catch (Exception e) {
            System.out.println("Error getting mergeEmployee: "+e);
        }
    }
    
}
