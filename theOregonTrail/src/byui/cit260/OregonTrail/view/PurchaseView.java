/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.StoreControl;
import java.util.Scanner;

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
        int quantity = Integer.parseInt(inputs);
        StoreControl.setQuantity(quantity);
        
        return true;
          }
}