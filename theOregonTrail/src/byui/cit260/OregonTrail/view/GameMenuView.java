/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.model.Game;
import byui.cit260.OregonTrail.model.Location;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class GameMenuView extends View {

    public GameMenuView() {
    super ("\nV - View Map"
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
            case "M":
                movePlayer();
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
}