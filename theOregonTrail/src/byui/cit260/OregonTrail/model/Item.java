/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.*;

/** 
 *
 * @author jonja
 */
public enum Item {
    
    //This class is an enum because all of its components are fix and won't be
    //changing throughout the game.
    
    metalWheel("Metal wheel. Will last longer, but will be heavier. Can be used with both metal and wood wagons", 10.0),
    woodWheel ("Wood wheel. Lighter but breaks easier than the metal wheel. Can be only used with a wood wagon", -10.0),
    Oxen("Healthy, strong Oxen", 20.0),
    Food("Delicious, nutritious meals", 0.20),
    Clothing("You will need appropiate attire", 10.0),
    AmmunitionBox("Best value if you buy a box", 5.0),
    Ammunition("For your hunting necessities", 1.0),
    Axle("Better to be prepared in case of damage", 10.0),
    Tongue("Adittional tongues are recomended as precaution", 10.0),
    FirstAidKit("Restores health to a 100%", 40.0),
    Tools("Need to work to provide for your company? You will need tools", 400.0),
    StarterPackage("Don't complicate your life thinking on what you need. This package has the basics", 600.0);
    
    private String description;
    private double price;
   
    
    Item (String description, double price){
        this.description = description;
        this.price = price;
}

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", price=" + price + '}';
    }

}