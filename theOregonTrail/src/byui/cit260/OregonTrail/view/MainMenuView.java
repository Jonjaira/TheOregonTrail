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
public class MainMenuView extends View {

    public MainMenuView() {
    super ("\nN - Start new game"
    + "\nR - Restart existing game"
    +"\nH - Get help on how to play the game"
    +"\nS - Show the store"
    +"\nM - Show the Game Menu"
    +"\nE - Exit"
    +"\n\nEnter Selection Below: ");
    }
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        
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
            case "S":
                openStore();
                break;
            case "M":
                showGameMenu();
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
        helpMenuView.display();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void startNewGame() {
        GameControl.createNewGame(JavaApplication1.getPlayer());
    }

    private void openStore() {
        StoreView storeView = new StoreView();
        storeView.display();
        
        System.out.println("Remaining Allowance: " + JavaApplication1.getPlayer().getCharacter().getAllowance());
    }
    
    private void showGameMenu() {
        if (JavaApplication1.getCurrentGame() == null) {
            System.out.println("\n\n\n!!! No New Game Has Started Yet!!!");
        }
        else {
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
        }
    }
}
