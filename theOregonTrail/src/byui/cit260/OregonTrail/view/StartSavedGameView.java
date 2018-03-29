/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;
import byui.cit260.OregonTrail.exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonja
 */
public class StartSavedGameView extends View {

    public StartSavedGameView() {
        super ("\nEnter the file name to load game: ");
    }
    
    @Override
    public boolean doAction(String value) {
        try {
            GameControl.loadGame(value);
        } catch (GameControlException | IOException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StartSavedGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
}
