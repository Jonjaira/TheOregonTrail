/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.exceptions.GameControlException;
import byui.cit260.OregonTrail.model.Game;
import byui.cit260.OregonTrail.model.Location;
import java.io.IOException;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class GameMenuView extends View {

    public GameMenuView() {
    super ("\nV - View Map"
    +"\nS - Save the game"
    +"\nM - Move player"
    +"\nR - Inventory report"
    +"\nQ - Quit"
    +"\n\nEnter Selection Below: ");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        
        menuItem = menuItem.toUpperCase();
        
        switch(menuItem)
        {
            case "V":
                displayMap();
                break;
            case "S":
                saveGame();
                break;
            case "M":
                movePlayer();
                break;
            case "R":
                try {
                    inventoryReport();
                } catch (GameControlException | IOException ex) {
                    this.console.print("File could not be created!" + ex.getMessage());
                }
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                "Invalid Menu Item");
        }
        
        return true;
 
    }    

    private void displayMap() {
        Game game = JavaApplication1.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();
        Location location;
        
        this.console.println("\n\n\n  The Land Where You Will Travel");
        //                     0     1     2     3     4
        //                  +-----+-----+-----+-----+-----+
        //                0 |     |     |     |     |     |
        //                  +-----+-----+-----+-----+-----+
        //                1 |     |     |     |     |     |
        //                  +-----+-----+-----+-----+-----+
        //                2 |     |     |     |     |     |
        //                  +-----+-----+-----+-----+-----+
        //                3 |     |     |     |     |     |
        //                  +-----+-----+-----+-----+-----+
        //                4 |     |     |     |     |     |
        //                  +-----+-----+-----+-----+-----+
        this.console.println("                                 ");
        this.console.println("     0     1     2     3     4   ");
        this.console.println("  +-----+-----+-----+-----+-----+");
        
        for (int rowIndex = 0; rowIndex < game.getMap().getRowCount(); rowIndex++) {
            System.out.print(rowIndex + " ");
            
            for (int colIndex = 0; colIndex < game.getMap().getColumnCount(); colIndex++) {
                location = locations[rowIndex][colIndex];
                
                if (location.getVisited()) {
                    this.console.print("| " + location.getName() + " ");
                }
                else {
                    this.console.print("| ??? ");
                }
            }
            
            this.console.println("|");
            this.console.println("  +-----+-----+-----+-----+-----+");
        }
    }
    
    private void movePlayer() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void inventoryReport() throws GameControlException, IOException {
        InventoryReportView inventoryReportView = new InventoryReportView();
        
        this.console.println("\nEnter file path\n");
            
        try {
            //Get the value entered from the keyboard
            String filePath = this.keyboard.readLine();
            inventoryReportView.InventoryReportView(filePath);
        } catch (IOException ex) {
            throw ex;
        }
            
    }
}