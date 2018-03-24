/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.DamagesControl;
import byui.cit260.OregonTrial.exceptions.DamagesControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rimor
 */
public class StatusWagonView extends View{

    public StatusWagonView() {
        super ("\n In order to check the status of your Wagon, we need to know how "
                + "\n many kilometers to travel and how many natural events have "
                + "\n you gone through?");
    }
    
    

    @Override
    public boolean doAction(String inputs) {
        String strKm = inputs;
        double km = Double.parseDouble(strKm);
        int crossOfRiver = 2 ;
        int storm = 1;
        
        try {
            double calcPercentOfDamages = DamagesControl.calcPercentOfDamages(km, crossOfRiver, storm);
            System.out.println("The status of your Wagon is : "+ calcPercentOfDamages + "%");
        } catch (DamagesControlException ex) {
            Logger.getLogger(StatusWagonView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//        GameControl.setActor(value);
//        throw new UnsupportedOperationException("Not supported yet.");
    return true;
    }
    
}
