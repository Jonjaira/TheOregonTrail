/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrail.model.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonja
 */
public class StoreControlTest {
    
    public StoreControlTest() {
    }

    /**
     * Test of buyItem method, of class StoreControl.
     */
    @Test
    public void testBuyItem() {
        // Test case 1
        System.out.println("buyItem");
        double totalAvailable = 720;
        Item item = Item.metalWheel;
        StoreControl.setQuantity(2);
        double expResult = 698.8;
        double result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test case 2
        System.out.println("buyItem");
        totalAvailable = -600;
        item = Item.metalWheel;
        StoreControl.setQuantity(2);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 3
        System.out.println("buyItem");
        totalAvailable = 1000;
        item = Item.metalWheel;
        StoreControl.setQuantity(2);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 4
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.woodWheel;
        StoreControl.setQuantity(2);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 5
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.StarterPackage;
        StoreControl.setQuantity(2);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
 
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.metalWheel;
        StoreControl.setQuantity(-5);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 6
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.metalWheel;
        StoreControl.setQuantity(30);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 7
        System.out.println("buyItem");
        totalAvailable = 1000;
        item = Item.metalWheel;
        StoreControl.setQuantity(2);
        expResult = -1;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 8
        System.out.println("buyItem");
        totalAvailable = 0;
        item = Item.metalWheel;
        StoreControl.setQuantity(2);
        expResult = -21.2;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0001);
        
        //Test Case 9
        System.out.println("buyItem");
        totalAvailable = 900;
        item = Item.metalWheel;
        StoreControl.setQuantity(2);
        expResult = 878.8;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);  
        
        //Test Case 10
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.Food;
        StoreControl.setQuantity(2);
        expResult = 719.576;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);        
        
        //Test Case 11
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.Tools;
        StoreControl.setQuantity(2);
        expResult = -128;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);        
        
        //Test Case 12
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.metalWheel;
        StoreControl.setQuantity(1);
        expResult = 709.4;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);        
        
        //Test Case 13
        System.out.println("buyItem");
        totalAvailable = 720;
        item = Item.metalWheel;
        StoreControl.setQuantity(20);
        expResult = 508;
        result = StoreControl.buyItem(totalAvailable, item);
        assertEquals(expResult, result, 0.0);        
        
        
    }
    
    
    
}
