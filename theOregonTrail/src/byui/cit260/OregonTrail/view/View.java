/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public abstract class View implements ViewInterface {
    private String message;
    protected final BufferedReader keyboard = JavaApplication1.getInFile();
    protected final PrintWriter console = JavaApplication1.getOutFile();
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
        
        
        boolean valid = false;
        String selection = null;
        try{
        //While valid name has not been retrieved 
        while (!valid){
            
            this.console.println("\n" + this.displayMessage);
            
            //Get the value entered from the keyboard
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if(selection.length()<1){ //Blank value entered
                System.out.println("\n*** You must enter a value***");
                continue;
            }
            
            break;
        }
        } catch (IOException e){
            this.console.println("Error reading input: " + e.getMessage());
        }
        return selection; //Return the name
     }
}
        