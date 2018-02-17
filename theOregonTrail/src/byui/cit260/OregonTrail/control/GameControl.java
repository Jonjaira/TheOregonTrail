/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

/**
 *
 * @author jonja
 */
public class GameControl {
    
    public static double calcTotalAvailable( double allowance) {

        if (allowance == 600 || allowance == 800 || allowance == 1000){
            return allowance - allowance * .1;
        }
            return -1;
    }
}