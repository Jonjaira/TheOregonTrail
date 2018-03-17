/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

/**
 *
 * @author rimor
 */
public class WorkingMenuView extends View{

    public WorkingMenuView() {
    
    
    super("\nS - Score table"
        +"\nT - Types of tools"
        +"\nW - Type of work you want to do"
        +"\nQ - Quit");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        
    }    
    
    @Override  
  public boolean doAction(String inputs) {
        String menuWorkgin = inputs;
        
        menuWorkgin = menuWorkgin.toUpperCase();
        
        switch(menuWorkgin)
        {
            case "S":
                System.out.println("\nJOB                 |  Point"
                        + "\n___________________________"
                        + "\nDishwashing         |     10" 
                        + "\nBroken window       |     10" 
                        + "\nBroken pipe         |     20" 
                        + "\nChange wheels       |     30");
                break;
            case "T":
                System.out.println("\nHammer"
                        + "\nScrewdriver"
                        + "\nWrench" 
                        + "\nSponge and soap" 
                        + "\nCut glass" 
                        + "\nSaw");
                break;
            case "W":
                System.out.println("\nWash the dishes all night after the "
                        + "town party");
                System.out.println("\nChange the broken glass of the Local "
                        + "store");
                System.out.println("\nChange a shower tube");
                System.out.println("\nThe village carriage has a broken wheel.");
                break;   
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu Work.");
        }
     
        return false;
    }
    
}
