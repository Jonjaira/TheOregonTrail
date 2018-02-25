/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;
import java.util.Scanner;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
class MainMenuView {

    void displayMainMenuView() {
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

        System.out.println("\nN - Start new game");
        System.out.println("R - Restart existing game");
        System.out.println("H - Get help on how to play the game");
        System.out.println("E - Exit");
        
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
            case "N":
                 startNewGame();
                break;
            case "R":
                 restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        
        return false;
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void startNewGame() {
        GameControl.createNewGame(JavaApplication1.getPlayer());
    }
    
}
