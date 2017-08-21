/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.OnlineShop;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

/**
 *
 * @author lukasz
 */
public class Basket {
    
    Map<Item, Integer> orderedItems = new HashMap<>();
    BigDecimal sum;
    
    
    public void addItems(Item item){
        addItems(item,1);
    
    }
    
    public void addItems(Item item, int quantity){
        
        if(quantity<=0){
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        if(orderedItems.containsKey(item)){
            quantity = orderedItems.get(item) + quantity;
        }
        
        orderedItems.put(item, quantity);
    }
    
    public void removeItem( Item item){
        removeItem(item, 1);
    }
    
    public void removeItem( Item item, int quantity){
        if(quantity<=0){
           throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        quantity = orderedItems.get(item) - quantity;
        if(quantity==0){
            orderedItems.remove(item);
        }
        else if(quantity<0){
            throw new IllegalStateException(String.format("There is no that many items to remove~"));
        }
        else{
            orderedItems.put(item, quantity);
        }
    }
    
    public void showContents(){
        System.out.println(orderedItems.toString());
    }
    
    public BigDecimal calculateTotalValue(){
//        orderedItems.forEach((Item k,Integer v) -> sum = sum.add(k.getKey().getPrice().multiply(BigDecimal.valueOf(k.getValue()))));
        
        orderedItems
                .entrySet()
                .stream()
                .forEach(entry -> sum = sum.add(entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue()))));
                
//        orderedItems.forEach();
//                seats.entrySet().forEach(entry -> sectionMap.put(entry.getKey(), new Section(entry.getValue())));
        return sum;
    }
    public boolean isEmpty() {
       return orderedItems.isEmpty();
    }
    public void clear() {
        orderedItems.clear();
    }
}
