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
public class CompanyCharacterTypeView extends View {
    public CompanyCharacterTypeView (){
        super (" 1- " + Character.Man.getType()
               + "\n 2- " + Character.Woman.getType()
               + "\n 3- " + Character.Boy.getType()
               + "\n 4- " + Character.Girl.getType()
               + "\n\nEnter the member character type: ");
    }
    
    @Override
        public boolean doAction(String value) {
        String characterChoice = value;
        
        switch(characterChoice)
        {
            case "1":
                GameControl.setCharacter(Character.Man);
                break;
            case "2":
                GameControl.setCharacter(Character.Woman);
                break;
            case "3":
                GameControl.setCharacter(Character.Boy);
                break;
            case "4":
                GameControl.setCharacter(Character.Girl);
                break;
            default:
                return false;
        }
        return true;
    }
}

