/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonja
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calcTotalAvailable method, of class GameControl.
     */
    @Test
    public void testCalcTotalAvailable() {
        //Test Case 1
        System.out.println("calcTotalAvailable");
        double allowance = 600;
        double expResult = 540;
        double result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 2
        System.out.println("calcTotalAvailable");
        allowance = 800;
        expResult = 720;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 3
        System.out.println("calcTotalAvailable");
        allowance = 1000;
        expResult = 900;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 4
        System.out.println("calcTotalAvailable");
        allowance = -600;
        expResult = -1;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 5
        System.out.println("calcTotalAvailable");
        allowance = 450;
        expResult = -1;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 6
        System.out.println("calcTotalAvailable");
        allowance = 700;
        expResult = -1;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 7
        System.out.println("calcTotalAvailable");
        allowance = 1200;
        expResult = -1;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 8
        System.out.println("calcTotalAvailable");
        allowance = 600;
        expResult = 540;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
        //Test case 9
        System.out.println("calcTotalAvailable");
        allowance = 1000;
        expResult = 900;
        result = GameControl.calcTotalAvailable(allowance);
        assertEquals(expResult, result, 0.0);
        
       }
    
}
