/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.*;
import java.util.*;

/**
 *
 * @author jonja
 */
public class Store implements Serializable{
    
    //Since this class has the attribute "shopping cart" and that should have
    //different data type objects and it will change its size, it needed to
    //be an array list.
    
    private static ArrayList<Item> shoppingCart = new ArrayList<Item>();
    private int total;

    public Store() {
    }
    
    public static ArrayList<Item> getShoppingCart() {
        return Store.shoppingCart;
    }

    public static void setShoppingCart(ArrayList<Item> shoppingCart) {
        Store.shoppingCart = shoppingCart;
    }

    public static void addMultipleItemsToShoppingCart(Item[] item){
        for (Item items : item) {
            Store.shoppingCart.add(items);
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Store{" + "shoppingCart=" + shoppingCart + ", total=" + total + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(Store.shoppingCart);
        hash = 97 * hash + this.total;
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
        final Store other = (Store) obj;
        if (this.total != other.total) {
            return false;
        }
        if (!Objects.equals(Store.shoppingCart, Store.shoppingCart)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
