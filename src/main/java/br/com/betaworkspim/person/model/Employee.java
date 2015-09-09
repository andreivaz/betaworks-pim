/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.person.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author andreivaz
 */
@Entity
public class Employee implements Serializable{
    
    @Id
    @GeneratedValue
    private Integer employeeId;
    @OneToOne(mappedBy = "employeeID")
    private Username userId;
    @OneToOne(mappedBy = "employeeID")
    private EmployeeStatus employeeStatusId;
    
    private String  name;
    private String  rg;
    private String  cpf;
    @Temporal(TemporalType.DATE)
    private Date    birthDate;
    private String  address;
    private String  telephone;
    private String  email;

    public Employee() {
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Username getUserId() {
        return userId;
    }

    public void setUserId(Username userId) {
        this.userId = userId;
    }

    public EmployeeStatus getEmployeeStatusId() {
        return employeeStatusId;
    }

    public void setEmployeeStatusId(EmployeeStatus employeeStatusId) {
        this.employeeStatusId = employeeStatusId;
    }
    
}
