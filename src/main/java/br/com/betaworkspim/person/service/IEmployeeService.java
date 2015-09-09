/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.person.service;

import java.util.List;
import org.hibernate.exception.DataException;

/**
 *
 * @author andreivaz
 */
public interface IEmployeeService {
    
    List getEmployeesList() throws DataException;
}
