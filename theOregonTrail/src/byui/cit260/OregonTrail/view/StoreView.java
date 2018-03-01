/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.StoreControl;
import java.util.Scanner;
import byui.cit260.OregonTrail.model.Item;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class StoreView {
     void displayStoreView() {
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        do {            
            inputs = this.getInputs();
            
            if (inputs.length < 1) {
                return;
            }
            
            inputs[0] = inputs[0].toUpperCase();
            
            if (inputs[0].equals("Q")) {
                return;
            }
            
            endOfView = doAction(inputs);
            
        } while (endOfView != true);
    }

  private String[] getInputs() {
        String[] inputs = new String[1];
        Scanner input = new Scanner(System.in);

        System.out.println("\n 1- " + Item.Ammunition.getName() + " ------ " + Item.Ammunition.getPrice());
        System.out.println(" 2- " + Item.AmmunitionBox.getName() + " -- " + Item.AmmunitionBox.getPrice());
        System.out.println(" 3- " + Item.Axle.getName() + " ------------ " + Item.Axle.getPrice());
        System.out.println(" 4- " + Item.Clothing.getName() + " -------- " + Item.Clothing.getPrice());
        System.out.println(" 5- " + Item.FirstAidKit.getName() + " --- " + Item.FirstAidKit.getPrice()); 
        System.out.println(" 6- " + Item.Food.getName()+ " ------------ " + Item.Food.getPrice());
        System.out.println(" 7- " + Item.Oxen.getName()+ " ------------ " + Item.Oxen.getPrice());
        System.out.println(" 8- " + Item.StarterPackage.getName() + " - " + Item.StarterPackage.getPrice());
        System.out.println(" 9- " + Item.Tongue.getName()+ " ---------- " + Item.Tongue.getPrice());
        System.out.println("10- " + Item.Tools.getName() + " ----------- " + Item.Tools.getPrice());
        System.out.println("11- " + Item.metalWheel.getName()+ " ----- " + Item.metalWheel.getPrice());
        System.out.println("12- " + Item.woodWheel.getName() + " ------ " + Item.woodWheel.getPrice()); 
        System.out.println("E - Exit");
        System.out.println("\nAllowance Available: " + JavaApplication1.getPlayer().getCharacter().getAllowance());
        
        boolean valid = false;
        
        while (valid == false) {            
            System.out.println("Enter your choice: ");
            String userInput = input.nextLine().trim();
            
            if (userInput.isEmpty()) {
                System.out.println("You must enter a non-blank value");
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
        String menuItem = inputs[0];
        
        menuItem = menuItem.toUpperCase();
        
        switch(menuItem)
        {
            case "1":
                purchaseItem(Item.Ammunition);
                break;
            case "2":
                purchaseItem(Item.AmmunitionBox);
                break;
            case "3":
                purchaseItem(Item.Axle);
                break;
            case "4":
                purchaseItem(Item.Clothing);
                break;
            case "5":
                purchaseItem(Item.FirstAidKit);
                break;
            case "6":
                purchaseItem(Item.Food);
                break;
            case "7":
                purchaseItem(Item.Oxen);
                break;
            case "8":
                purchaseItem(Item.StarterPackage);
                break;
            case "9":
                purchaseItem(Item.Tongue);
                break;
            case "10":
                purchaseItem(Item.Tools);
                break;
            case "11":
                purchaseItem(Item.metalWheel);
                break;
            case "12":
                purchaseItem(Item.woodWheel);
                break;    
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        
        return false;
    }

    private void purchaseItem(Item item) {
        PurchaseView purchaseView = new PurchaseView();
        purchaseView.displayPurchaseView();
        double remainingAllowance;
        
        remainingAllowance = StoreControl.buyItem(JavaApplication1.getPlayer().getCharacter().getAllowance(), item);
        if(remainingAllowance != -1){
               JavaApplication1.getPlayer().getCharacter().setAllowance(remainingAllowance);
        }
     
    }
}
