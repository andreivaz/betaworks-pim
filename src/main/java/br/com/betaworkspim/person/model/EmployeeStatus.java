/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.person.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author andreivaz
 */
@Entity
public class EmployeeStatus implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer employeeStatusId;
    @OneToOne
    private Employee employeeId;
    
    private Double  salary;
    private String  position;
    private Integer permission;
    private Double  bonus;

    public EmployeeStatus() {
    }
    

    public Integer getEmployeeStatusId() {
        return employeeStatusId;
    }

    public void setEmployeeStatusId(Integer employeeStatusId) {
        this.employeeStatusId = employeeStatusId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }
    
}
