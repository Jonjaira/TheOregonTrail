/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author jonja
 */
public abstract class View implements ViewInterface {
    protected  String displayMessage;
    
    public View(){ 
}
    public View(String message){
        this.displayMessage = message ;
    }
    
     @Override 
     public void display() {
        boolean done = false;
                
        do {
            //Prompt for anf get players name
            String value = this.getInput();
                        
            if (value.toUpperCase().equals("Q")) 
                return;
            done = this.doAction(value);
            
        } while (!done);
    }
     
    @Override
     public String getInput() {
        
        Scanner keyboard = new Scanner (System.in);
        boolean valid = false;
        String value = null;
        
        //While valid name has not been retrieved 
        while (!valid){
            
            System.out.println("\n" + this.displayMessage);
            
            //Get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length()<1){ //Blank value entered
                System.out.println("\n*** You must enter a value***");
                continue;
            }
            
            break;
        }
        
        return value; //Return the name
     }
}
        