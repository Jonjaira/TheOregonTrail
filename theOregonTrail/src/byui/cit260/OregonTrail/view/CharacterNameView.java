/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;
import byui.cit260.OregonTrail.model.Player;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class CharacterNameView extends View {
        public CharacterNameView() {
    super ("Enter character name: ");
    }

    @Override
    public boolean doAction(String value) {
        JavaApplication1.getPlayer().getCharacter().setName(value);
               
        this.console.println("\n================================================= ");
        this.console.print("Welcome to the game " + JavaApplication1.getPlayer().getCharacter().getName());
        this.console.println(" the " + JavaApplication1.getPlayer().getCharacter().getType());
        this.console.println("We hope you have a lot of fun!");
        this.console.println("================================================= ");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
        return true;
    }
    
    
}
