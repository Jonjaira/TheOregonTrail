/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrail.model.Player;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class GameControl {
    
    public static double calcTotalAvailable( double allowance) {

        if (allowance == 600 || allowance == 800 || allowance == 1000){
            return allowance - allowance * .1;
        }
            return -1;
    }

    /*
     *  savePlayer(name): Player
        BEGIN
        if name is null OR length of name is < 1 THEN
            RETURN null
        ENDIF
    
        player = new Player object
        save the name in the player object
        save the player in the main class of the project
        RETURN player
        END
     */
    public static Player savePlayer(String playersName) {
        if (playersName.isEmpty() || (playersName.length() < 1)) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        JavaApplication1.setPlayer(player);
        
        return new Player();
    }
    
    public static void createNewGame(Player player){
        System.out.println("*** createNewGame() called ***");
    }
}