/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.StoreControl;

/**
 *
 * @author jonja
 */
public class PurchaseView extends View {
       public PurchaseView(){
       super("Please enter the desired amount to purchase");
       }
       
    @Override
    public boolean doAction(String inputs) {
        int quantity = 0;
        
        try {
            quantity = Integer.parseInt(inputs);
        }
        catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),
                "Non-numeric values not allowed!\n");
            return false;
        }
        
        StoreControl.setQuantity(quantity);
        
        return true;
    }
}