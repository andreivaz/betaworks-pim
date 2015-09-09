/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.product.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 *
 * @author andreivaz
 */
@Entity
public class Supplier implements Serializable{
    
    @Id
    private Integer supplierId;
    private String name;
    @CNPJ
    private String CNPJ;

    public Supplier() {
    }
    
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    
}
