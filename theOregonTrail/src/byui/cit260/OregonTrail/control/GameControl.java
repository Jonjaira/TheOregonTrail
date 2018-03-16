/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrail.model.Player;
import byui.cit260.OregonTrail.model.Character;
import byui.cit260.OregonTrail.model.Game;
import byui.cit260.OregonTrail.model.Map;
import byui.cit260.OregonTrail.view.CompanyNamesView;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class GameControl {
    
    private static String actor;
    
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
    public static Player savePlayer(Character character) {
        Player player = new Player();
        player.setCharacter(character);
        
        JavaApplication1.setPlayer(player);
        
        return new Player();
    }
    
    public static int createNewGame(Player player){
    /*if (player == null)
    return -1
    game = create a new Game object
    Save a reference to the Player object in the game
    Save a reference to the game in the main class
    
    actors = createActors()
    Save the list of actors in the Game object
    Assign an actor to the player
    
    items = createItems()
    Save the list of items in the game
    
    map = createMap(noOfRows, noOfColumns, items)
    IF map == null THEN
      RETURN -1
    ENDIF
    
    Assign the map to the game
    RETURN 1 // indicates success
    }*/
        CompanyNamesView companyNamesView = new CompanyNamesView();
        String[] actors = new String[4];

        if (player == null)
            return -1;
        
        Game game = new Game();
        game.setPlayer(player);
        JavaApplication1.setCurrentGame(game);

        for (int i = 0; i < 4; i++) {
            companyNamesView.display();

            actors[i] = actor;

            System.out.println("\nA new member \"" + actors[i] + "\" has been added to the company");
        }

        JavaApplication1.getCurrentGame().getPlayer().getCompany().setPeople(actors);


        
        return 1;
    }
    
    public static void setActor(String personage){
        actor = personage;
    }
}