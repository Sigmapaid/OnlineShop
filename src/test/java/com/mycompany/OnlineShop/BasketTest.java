/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.OnlineShop;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lukasz
 */
public class BasketTest {
    
    public BasketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Basket instance;
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    @Test
//    public void testAddItems_Item() {
//        System.out.println("addItems");
//        Item item = null;
//        Basket instance = new Basket();
//        instance.addItems(item);
////        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddItems_Item_int() {
//        System.out.println("addItems");
//        Item item = null;
//        int quantity = 0;
//        Basket instance = new Basket();
//        instance.addItems(item, quantity);
////        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRemoveItem_Item() {
//        System.out.println("removeItem");
//        Item item = null;
//        Basket instance = new Basket();
//        instance.removeItem(item);
////        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRemoveItem_Item_int() {
//        System.out.println("removeItem");
//        Item item = null;
//        int quantity = 0;
//        Basket instance = new Basket();
//        instance.removeItem(item, quantity);
////        fail("The test case is a prototype.");
//    }

//    @Test
//    public void testShowContents() {
//        System.out.println("showContents");
//        Basket instance = new Basket();
//        instance.showContents();
////        fail("The test case is a prototype.");
//    }

    @Test
    public void testCalculateTotalValue() {
        System.out.println("calculateTotalValue");
        Basket instance = new Basket();
        Item keyboard = new Item("keyboard", new BigDecimal(35));
        instance.addItems(keyboard);
        Item mouse = new Item("mouse", new BigDecimal(10.50));
        instance.addItems(mouse);
        BigDecimal expResult = new BigDecimal(45.50);
        BigDecimal result = instance.calculateTotalValue();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

//    @Test
//    public void testIsEmpty() {
//        System.out.println("isEmpty");
//        Basket instance = new Basket();
//        boolean expResult = true;
//        boolean result = instance.isEmpty();
//        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
//    }

//    @Test
//    public void testClear() {
//        System.out.println("clear");
//        Basket instance = new Basket();
//        instance.clear();
////        fail("The test case is a prototype.");
//    }
    
}
