/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.OnlineShop;

import java.math.BigDecimal;

/**
 *
 * @author lukasz
 */
public class Item {
    private BigDecimal price;
    private final String name;
    
    public Item (String name,BigDecimal price)
    {
        this.name=name;
        this.price=price;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return getName();
    }

    public boolean equals(Item item) {
        return name.equals(item.name);
    }
    
}
