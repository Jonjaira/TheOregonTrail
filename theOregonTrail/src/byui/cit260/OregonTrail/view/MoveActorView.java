/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.MapControl;
import byui.cit260.OregonTrail.exceptions.MapControlException;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class MoveActorView extends View {
    public MoveActorView(){
    }
    
    @Override 
    public void display() {
        int row = 0;
        int col = 0;
        
        this.displayMessage = "Enter ROW: ";
        try {
            row = Integer.parseInt(this.getInput());
        }
        catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),
                "Non-numeric values not allowed!\n");
        }
        
        this.displayMessage = "Enter COLUMN: ";
        try {
            col = Integer.parseInt(this.getInput());
        }
        catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),
                "Non-numeric values not allowed!\n");
        }
        
        try {
            this.doMoveAction(row, col);
        }
        catch (MapControlException ex) {
            this.console.print("Actor could not be moved" + ex.getMessage());
        }
    } 
    
    @Override
    public boolean doAction(String string) {
        return true;
    }
    
    public void doMoveAction(int row, int col) 
        throws MapControlException {
        MapControl.moveActor(JavaApplication1.getCurrentGame().getPlayer(), row, col);
    }
}
