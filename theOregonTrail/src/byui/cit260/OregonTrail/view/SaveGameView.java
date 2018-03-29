/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;
import byui.cit260.OregonTrail.exceptions.GameControlException;
import java.io.IOException;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class SaveGameView extends View{
     public SaveGameView(){
     super ("\nEnter the file name: ");
    }

    @Override
    public boolean doAction(String value) {
        try {
            GameControl.saveGame(JavaApplication1.getCurrentGame(), value);
        } catch (GameControlException | IOException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return false;
        }
        this.console.println("Game saved succesfully");

        return true;
    }
    
 
}
