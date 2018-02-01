/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import byui.cit260.OregonTrail.model.Player;
import byui.cit260.OregonTrail.model.Character;

/**
 *
 * @author jonja
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Player playerOne = new Player();
        
        playerOne.setName("Bu");
        playerOne.setScore(3000);
        
        String playerOneName = playerOne.getName();
        double playerOneScore = playerOne.getScore();
        
        Character.Farmer.getName();
        Character.Farmer.getType();    
        Character.Farmer.getRepairAbility();
        Character.Farmer.getAnimalAbility();
        Character.Farmer.getRoadAbility();
        Character.Farmer.getStrenght();
       
       
       
       
       System.out.println(playerOne.toString());
       
        System.out.println(Character.Farmer.getName());
        System.out.println(Character.Farmer.getType());
        System.out.println(Character.Farmer.getRepairAbility());
        System.out.println(Character.Farmer.getAnimalAbility());
        System.out.println(Character.Farmer.getRoadAbility());
        System.out.println(Character.Farmer.getStrenght());

    }
    
}
