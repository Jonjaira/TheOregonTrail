/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author jonja
 */
public class HelpMenuView extends View{
    
    public HelpMenuView(){
    super("\nG - What is the goal of the game? "
        +"\nM - How to move"
        +"\nE - Estimate the number of resources"
        +"\nH - Harvest resources"
        +"\nD - Delivering resources to warehouse"
        +"\nQ - Quit");  
    }

    @Override 
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        
        menuItem = menuItem.toUpperCase();
        
        switch(menuItem)
        {
            case "G":
                System.out.println("\nThe goal of the game is to take your"
                        + " company to oregon.");
                break;
            case "M":
                System.out.println("\nTo move just press the arrow keys.");
                break;
            case "E":
                System.out.println("\nGives the estimate number of resources"
                        + "left for your company.");
                break;
            case "H":
                System.out.println("\nAllows to harvest for resources you may"
                        + "need.");
                break;
            case "D":
                System.out.println("\nAllows you to take resources to the"
                        + "warehouse.");
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        
        return false;
    }
}
