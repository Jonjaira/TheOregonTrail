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
public class HelpMenuView {
    
    public void displayHelpMenuView() {
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

        System.out.println("\nG - What is the goal of the game? ");
        System.out.println("M - How to move");
        System.out.println("E - Estimate the number of resources");
        System.out.println("H - Harvest resources");
        System.out.println("D - Delivering resources to warehouse");
        System.out.println("Q - Quit");

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
            case "G":
                System.out.println("\nThe goal of the game is to take your"
                        + "company to oregon.");
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
