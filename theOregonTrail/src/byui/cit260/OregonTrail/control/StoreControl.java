/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;
import byui.cit260.OregonTrail.model.Item;

/**
 *
 * @author jonja
 */
public class StoreControl {
    
    public static double buyItem( double totalAvailable, Item item, int quantity){

        if (totalAvailable < 0 || totalAvailable > 900){
            return -1;
        }

        if (quantity <0 || quantity > 20){
            return -1;
        }
        
        if (item.getPrice() < 0.20 || item.getPrice() > 400)
            return -1;

        double salesTax = 1.06;
        double remainderAvailable;

        remainderAvailable = totalAvailable - ((item.getPrice() * quantity) *salesTax);
                return remainderAvailable;
    }
    
}
