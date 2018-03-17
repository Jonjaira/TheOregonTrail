/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;
import byui.cit260.OregonTrail.model.Item;
import byui.cit260.OregonTrail.model.Store;
import java.util.ArrayList;

/**
 *
 * @author jonja
 */
public class StoreControl {
    
    private static int quantity;
   
    public static double buyItems( double totalAvailable, Item item){

        if (totalAvailable < 0 || totalAvailable > 900){
            return -1;
                    }

        if (StoreControl.quantity <0 || StoreControl.quantity > 20){
            System.out.println("You can't buy more than 20 or less than 0");
            return -1;
                    
        }
        
        if (item.getPrice() < 0.20 || item.getPrice() > 400)
            return -1;

        double salesTax = 1.06;
        double remainderAvailable;

        remainderAvailable = totalAvailable - ((item.getPrice() * StoreControl.quantity) *salesTax);
        
        addPurchasedItemsToShoppingCart(item, quantity);
        
        return remainderAvailable;
    }
    
        public static int getQuantity() {
        return StoreControl.quantity;
    }
    
    public static void setQuantity(int quantity) {
        StoreControl.quantity = quantity;
    }
    
    private static void addPurchasedItemsToShoppingCart(Item item, int quantity) {
        Item[] purchasedItems = new Item[quantity];
        
        for (int i = 0; i < quantity; i++) {
            purchasedItems[i] = item;
        }
        
        Store.addMultipleItemsToShoppingCart(purchasedItems);
    }
}
