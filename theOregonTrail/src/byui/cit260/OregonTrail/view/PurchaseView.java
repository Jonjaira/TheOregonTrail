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
public class PurchaseView {
    void displayPurchaseView(){
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        do {            
            inputs = this.getInputs();
            
            if (inputs.length < 1) {
                return;
            }

            endOfView = doAction(inputs);
            
        } while (endOfView != true);
    }
    
     private String[] getInputs() {
        String[] inputs = new String[1];
        Scanner input = new Scanner(System.in);


        
        boolean valid = false;
        
        while (valid == false) {            
            System.out.println("Enter amount: ");
            String userInput = input.nextLine().trim();
            
            if (userInput.isEmpty()) {
                System.out.println("You must enter a non-blank value");
            }
            else if ((Integer.parseInt(userInput) < 0) || (Integer.parseInt(userInput) > 20) ){
            System.out.println("You can't buy more than 20 or less than 0");           
            }
            else
                    
            {
                inputs[0] = userInput;
                valid = true;
            }
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        int quantity = Integer.parseInt(inputs[0]);
        StoreControl.setQuantity(quantity);
        
        return true;
    }
}
