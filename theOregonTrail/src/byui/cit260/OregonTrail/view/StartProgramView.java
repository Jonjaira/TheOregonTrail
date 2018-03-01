/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;
import byui.cit260.OregonTrail.model.Character;
import byui.cit260.OregonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author jonja
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    
    /**
     *   displayStartProgramView() {
     *       endOfView = false
     *       DO
     *           inputs = getInputs()
     *           IF no inputs were entered OR the first input is Q
     *               RETURN
     *           ENDIF
     *           endOfView = doAction(inputs)
     *       WHILE endOfView != true
     *   }
     */
    public void displayStartProgramView(){
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        do {            
            inputs = this.getInputs();
            
            if (inputs.length < 1) {
                return;
            }
            
            inputs[0] = inputs[0].toUpperCase();
            
            if (inputs[0].equals("Q")) {
                return;
            }
            
            endOfView = doAction(inputs);
            
        } while (endOfView != true);
    }

    /*
     *getInputs(): String[] {
        inputs = new String array one element long
        Display a description of the view

        valid = false
        WHILE valid == false (no input value has been enterd)

            Display the prompt message
            Get the value entered from the keyboard
            Trim off leading and trailing blanks from the value
    
            IF length of the value < 1 then
                Display "You must enter a non-blank value”
                Continue (move to the top of the loop and repeat)
            ENDIF
    
            Assign the value to the fist position in the inputs array
    
            valid = true (ends the loop)
        ENDWHILE

        RETURN inputs 
     */
    private String[] getInputs() {
        String[] inputs = new String[1];
        Scanner input = new Scanner(System.in);

        System.out.println("You will try to successfully get your company "
                           + "across the country through the oregon trail.");
        
        System.out.println("\n 1- " + Character.Banquer.getName());
        System.out.println(" 2- " + Character.Carpenter.getName());
        System.out.println(" 3- " + Character.Farmer.getName());
        
        boolean valid = false;
        
        while (valid == false) {            
            System.out.println("\nEnter your character choice: ");
            String userInput = input.nextLine().trim();
            
            if (userInput.isEmpty()) {
                System.out.println("You must enter a non-blank value");
            }
            else if ((!userInput.equals("1")) && (!userInput.equals("2"))  && (!userInput.equals("3"))) {
               System.out.println("Invalid choice, please choose a character.");
            }
                
            else
            {
                inputs[0] = userInput;
                valid = true;
            }
        }
        
        return inputs;
    }

    /*
     *  playersName = get the first value in the inputs array
        player = savePlayer(playersName)
    
        IF player == null
             display “Could not create the player. “ +
            “Enter a different name.”
            RETURN false
        ENDIF
    
        DISPLAY "================================================= "
         + "Welcome to the game " + playersName
         + "We hope you have a lot of fun!”
         + "================================================= "
    
        mainMenuView = Create a new MainMenuView object
        mainMenuView.displayMainMenuView()
    
        RETURN true 
     */
    private boolean doAction(String[] inputs) {
        String characterChoice = inputs[0];
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
        
        Player player = GameControl.savePlayer(character);
        
        System.out.println("\n================================================= ");
        System.out.println("Welcome to the game " + character.getName());
        System.out.println("We hope you have a lot of fun!");
        System.out.println("================================================= ");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        
        return true;
    }
}
