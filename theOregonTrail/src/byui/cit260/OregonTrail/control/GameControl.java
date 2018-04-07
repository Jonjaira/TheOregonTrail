/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrail.exceptions.GameControlException;
import byui.cit260.OregonTrail.exceptions.MapControlException;
import byui.cit260.OregonTrail.model.Actor;
import byui.cit260.OregonTrail.model.Player;
import byui.cit260.OregonTrail.model.Character;
import byui.cit260.OregonTrail.model.Game;
import byui.cit260.OregonTrail.model.Store;
import byui.cit260.OregonTrail.view.CompanyCharacterTypeView;
import byui.cit260.OregonTrail.view.CompanyNamesView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class GameControl {
    
    private static String actor;
    private static Character character;
    
    public static void saveGame(Game game, String filePath)
        throws GameControlException, IOException {
        
        if (null == game) {
            throw new GameControlException("Invalid Game");
        }
        
        if (null == filePath) {
            throw new GameControlException("Invalid File Name");
        }
        
        try (FileOutputStream  outFile = new FileOutputStream (filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream (outFile)) {
            objectOutputStream.writeObject(game);
            objectOutputStream.close();
        }
        catch (IOException ex) {
            throw ex;
        }
    }
    
    public static void loadGame(String fileName) 
        throws GameControlException, IOException, ClassNotFoundException {
                
        if (null == fileName) {
            throw new GameControlException("Invalid File Name");
        }
        
        try (FileInputStream inFile = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(inFile);) {
            Game loadedGame = (Game)objectInputStream.readObject();
            JavaApplication1.setCurrentGame(loadedGame);
            JavaApplication1.setPlayer(loadedGame.getPlayer());
        }
        catch (IOException ex) {
            throw ex;
        }
    }
    
    public static double calcTotalAvailable( double allowance)
        throws GameControlException {

        if (allowance == 600 || allowance == 800 || allowance == 1000){
            return allowance - allowance * .1;
        }
            throw new GameControlException("Invalid Allowance");
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
        JavaApplication1.getPlayer().setAllowance(player.getCharacter().getAllowance());
        
        return new Player();
    }
    
    public static void createNewGame(Player player)
        throws GameControlException, MapControlException{
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
        CompanyCharacterTypeView companyCharacterTypeView = new CompanyCharacterTypeView();
        Actor[] actors = new Actor[4];

        if (player == null)
            throw new GameControlException("Player is null");
        
        Game game = new Game();
        game.setPlayer(player);
        game.setStatus("Started");
        JavaApplication1.setCurrentGame(game);

        for (int i = 0; i < 4; i++) {
            companyNamesView.display();
            companyCharacterTypeView.display();
                    
            actors[i] = new Actor(actor, character);

            System.out.println("\nA new member \"" + actor +
                               "\" of type \"" + character.getType() +
                               "\" has been added to the company");
        }

        JavaApplication1.getCurrentGame().getPlayer().getCompany().addPeopleToCompany(actors);
        
        JavaApplication1.getCurrentGame().setMap(MapControl.createMap(5, 5));
        
        JavaApplication1.getCurrentGame().getPlayer().setCurrentLocation(game.getMap().getLocation(0, 0));
        JavaApplication1.getCurrentGame().getPlayer().getCurrentLocation().setVisited(true);
        
        JavaApplication1.getCurrentGame().getPlayer().getInventory().setInventoryItems(Store.getShoppingCart());
    }
    
    public static void setActor(String personage){
        actor = personage;
    }

    public static void setCharacter(Character character) {
        GameControl.character = character;
    }
}