/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;
import byui.cit260.OregonTrail.model.Character;

/**
 *
 * @author jonja
 */
public class StartProgramView extends View {
    
    public StartProgramView(){
        
    super (   "====================================================================================================\n\n"
            + "   ___    ____    _____    ____    ___    _   _     _____   ____       _      ___   _     \n"
            + "  / _ \\  |  _ \\  | ____|  / ___|  / _ \\  | \\ | |   |_   _| |  _ \\     / \\    |_ _| | |    \n"
            + " | | | | | |_) | |  _|   | |  _  | | | | |  \\| |     | |   | |_) |   / _ \\    | |  | |    \n"
            + " | |_| | |  _ <  | |___  | |_| | | |_| | | |\\  |     | |   |  _ <   / ___ \\   | |  | |___ \n"
            + "  \\___/  |_| \\_\\ |_____|  \\____|  \\___/  |_| \\_|     |_|   |_| \\_\\ /_/   \\_\\ |___| |_____|"
            + "\n\nWelcome to the Oregon trail! The estrategy game where you will put your survival skills to test!"
            + "\nYou will try to successfully get your company across the country through the oregon trail."
            + "\nYou will plan the trip, face many challenges, you will have to provide for your people,"
            + "\nmake decisions, hunt, work, and see all sorts of wonderful creatures and scenery on the way. "
            + "\nBut be careful and minfdul of your company because they will get hungry,they will get tired, "
            + "\nthey will get sick, and you must get everyone safe and healthy to Oregon!"
            + "\n\nWe hope you have lots of fun in your journey!"   
            + "\n===================================================================================================="
        
        +"\n\n 1- " + Character.Banquer.getType()
        +"\n 2- " + Character.Carpenter.getType()
        +"\n 3- " + Character.Farmer.getType()
        +"\n\nEnter your character choice: ");
        
    }
    @Override
    public boolean doAction(String inputs) {
        String characterChoice = inputs;
        Character character = Character.Banquer;
        
        switch(characterChoice)
        {
            case "1":
                character = Character.Banquer;
                break;
            case "2":
                character = Character.Carpenter;
                break;
            case "3":
                character = Character.Farmer;
                break;
            default:
                
               
                break;
        }
        
        GameControl.savePlayer(character);
        
        CharacterNameView characterNameView = new CharacterNameView();
        characterNameView.display();
         
        return true;
    }
}
