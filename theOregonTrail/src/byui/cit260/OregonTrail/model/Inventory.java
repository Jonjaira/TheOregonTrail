/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author jonja
 */
public class Inventory implements Serializable {
    //The data type I chose is an array list because the Items contained in the
    //inventory will be changing throughout the game. 
    
    private ArrayList<Item> inventory = new ArrayList<Item>();

    public Inventory() {
    }
     

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void addItemToInventory(Item item){
        this.inventory.add(item);
    }

    public void addMultipleItemsToInventory(Item[] item){
        this.inventory.addAll(Arrays.asList(item));
    }

    public Item getItemFromInventory(Item item){
        int indexOfelement = this.inventory.indexOf(item);
        
        if (-1 != indexOfelement) {
            item = this.inventory.get(indexOfelement);
        }
        else {
            return null;
        }
        
        return item; 
    }
    
    @Override
    public String toString() {
        return "Inventory{" + "inventory=" + inventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.inventory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }
}
