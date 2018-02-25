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
 * @author Diego Custode
 */
public class DamagesControlTest {
    
    public DamagesControlTest() {
    }

    /**
     * Test of calcPercentOfDamages method, of class DamagesControl.
     */
    @Test
    public void testCalcPercentOfDamages() {
        // Test 1
        System.out.println("calcPercentOfDamages");
        double km = 1257;
        int crossOfRiver = 1;
        int storm = 2;
        double expResult = 75.9;
        double result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);

        //Test 2
        System.out.println("calcPercentOfDamages");
        km = 2500;
        crossOfRiver = 3;
        storm = 2;
        expResult = -1;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);
        
        //Test 3
        System.out.println("calcPercentOfDamages");
        km = 80;
        crossOfRiver = -1;
        storm = 0;
        expResult = -1;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);
        
        //Test 4
        System.out.println("calcPercentOfDamages");
        km = 750;
        crossOfRiver = 3;
        storm = -1;
        expResult = -1;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);
        
        //Test 5
        System.out.println("calcPercentOfDamages");
        km = 25;
        crossOfRiver = 3;
        storm = 1;
        expResult = 45.7;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);
        
        //Test 6
        System.out.println("calcPercentOfDamages");
        km = 423;
        crossOfRiver = 0;
        storm = 3;
        expResult = 57.1;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);
        
        //Test 7
        System.out.println("calcPercentOfDamages");
        km = 2000;
        crossOfRiver = 1;
        storm = 0;
        expResult = 67.1;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);
        
        //Test 8
        System.out.println("calcPercentOfDamages");
        km = 1850;
        crossOfRiver = 3;
        storm = 1;
        expResult = 97.9;
        result = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
        assertEquals(expResult, result, 0.1);

    }
    
}
