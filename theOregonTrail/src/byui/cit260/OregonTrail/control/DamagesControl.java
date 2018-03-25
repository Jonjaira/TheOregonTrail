/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrial.exceptions.DamagesControlException;

/**
 *
 * @author Diego Cutode
 */
public class DamagesControl {
    
    public static double calcPercentOfDamages (double km, int crossOfRiver, int storm) throws DamagesControlException{
        
        if (km <0 || km >2000){
//            return -1;
        throw new DamagesControlException("Is too much Km");
        }

        if (crossOfRiver < 0 ){
//            return -1;
        throw new DamagesControlException("You enter a negative value, Try again");
         }
        
        if (storm < 0 ){
//	return -1;
        throw new DamagesControlException("You enter a negative value, Try again");
        }
	
        double firstDamage = (km / 35);
	double secondDamage = crossOfRiver * 10;
	double thirdDamege = storm * 15;
	
	double damage =(firstDamage + secondDamage + thirdDamege);
	
	return damage;

    }
    
   /* 
    public static double[] sortListItemPrice (double[] list){
        
        for (int i = 0; i<list.length -1; i++)
        {
            int index = 1;
            for (int j = i+1; j<list.length; j++ )
                if (list[j]<=list[index])
                    index = j;
            double smallerNuber = list[index];
            list[index] = list[i];
            list[i] = smallerNuber;
        }
        return list;
    }*/
}
