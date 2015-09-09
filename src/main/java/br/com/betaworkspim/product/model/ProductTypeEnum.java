/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.product.model;

/**
 *
 * @author andreivaz
 */
public enum ProductTypeEnum {
    
    SHOE(1),
    SNEAKERS(2),
    SOCKS(3),
    CASUALSHOE(4),
    BELT(5);
    
    public int typeValue;

    private ProductTypeEnum(int value) {
        typeValue = value;
    }
    
}
