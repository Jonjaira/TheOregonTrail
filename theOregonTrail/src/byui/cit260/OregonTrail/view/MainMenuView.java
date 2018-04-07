/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;
import byui.cit260.OregonTrail.exceptions.GameControlException;
import byui.cit260.OregonTrail.exceptions.MapControlException;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class MainMenuView extends View {

    public MainMenuView() {
    super ("\nN - Start new game"
    + "\nL - Load Game"
    + "\nR - Restart existing game"
    +"\nH - Get help on how to play the game"
    +"\nS - Show the store"
    +"\nM - Show the Game Menu"
    +"\nW - Work Options"
    +"\nT - Status Wagon"
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
                try {
                    startNewGame();
                } catch (MapControlException | GameControlException e) {
                    this.console.println(e.getMessage());
                    return false;
                }
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
            case "W":
                workOptions();
            case "T":
                statusWagon();
                break;
            case "L":
                loadGame();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                "Invalid Menu Item");
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

    private void startNewGame()
        throws GameControlException, MapControlException{
        GameControl.createNewGame(JavaApplication1.getPlayer());
    }
    
    private void openStore() {
        StoreView storeView = new StoreView();
        storeView.display();
        
        this.console.println("Remaining Allowance: " + JavaApplication1.getPlayer().getCharacter().getAllowance());
    }
    
    private void showGameMenu() {
        if (JavaApplication1.getCurrentGame() == null) {            
            ErrorView.display(this.getClass().getName(),
                "\n\n\n!!! No New Game Has Started Yet!!!");
        }
        else {
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
        }
    }    

    private void workOptions() {
        WorkingMenuView workingMenuView = new WorkingMenuView();
        workingMenuView.display();
    }

    private void statusWagon() {
        StatusWagonView statusWagonView = new StatusWagonView();
        statusWagonView.display();
    }
    
    private void loadGame() {
        StartSavedGameView startSavedGameView = new StartSavedGameView();
        startSavedGameView.display();
    }
}
