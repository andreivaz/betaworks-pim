/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.product.model;

import br.com.betaworkspim.person.model.Customer;
import br.com.betaworkspim.person.model.Employee;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author andreivaz
 */
@Entity
public class Sale implements Serializable{
    
    @Id
    @GeneratedValue
    private Integer saleId;
    @ManyToMany
    private Product productId;
    @ManyToMany
    private Employee employeeId;
    @ManyToMany
    private Customer customerId;
    
    @Temporal(TemporalType.DATE)
    private Date saleDate;

    public Sale() {
    }
    
    public Integer getSaleId() {
        return saleId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }
    
    public void setsaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

}
