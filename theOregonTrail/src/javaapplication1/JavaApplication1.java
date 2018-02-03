/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import byui.cit260.OregonTrail.model.Wagon;

/**
 *
 * @author jonja
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Wagon wagonOne = new Wagon();
        
        wagonOne.setName("metal");
        wagonOne.setType("metal");
        
        String wagonOneName = wagonOne.getName();
        String wagonOneType = wagonOne.getType();
        
        System.out.println(wagonOne.toString());
    }
}