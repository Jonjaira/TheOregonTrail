/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.StoreControl;
import byui.cit260.OregonTrail.model.Item;
import byui.cit260.OregonTrail.model.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class StoreView extends View {
     public StoreView() {
 
      super("   _______________  ____  ______\n" +
            "  / ___/_  __/ __ \\/ __ \\/ ____/\n" +
            "  \\__ \\ / / / / / / /_/ / __/   \n" +
            " ___/ // / / /_/ / _, _/ /___   \n" +
            "/____//_/  \\____/_/ |_/_____/   "
            + "\n\n 1- " + Item.Ammunition.getName() + " ------ " + Item.Ammunition.getPrice()
            +"\n 2- " + Item.AmmunitionBox.getName() + " -- " + Item.AmmunitionBox.getPrice()
            +"\n 3- " + Item.Axle.getName() + " ------------ " + Item.Axle.getPrice()
            +"\n 4- " + Item.Clothing.getName() + " -------- " + Item.Clothing.getPrice()
            +"\n 5- " + Item.FirstAidKit.getName() + " --- " + Item.FirstAidKit.getPrice()
            +"\n 6- " + Item.Food.getName()+ " ------------ " + Item.Food.getPrice()
            +"\n 7- " + Item.Oxen.getName()+ " ------------ " + Item.Oxen.getPrice()
            +"\n 8- " + Item.StarterPackage.getName() + " - " + Item.StarterPackage.getPrice()
            +"\n 9- " + Item.Tongue.getName()+ " ---------- " + Item.Tongue.getPrice()
            +"\n10- " + Item.Tools.getName() + " ----------- " + Item.Tools.getPrice()
            +"\n11- " + Item.metalWheel.getName()+ " ----- " + Item.metalWheel.getPrice()
            +"\n12- " + Item.woodWheel.getName() + " ------ " + Item.woodWheel.getPrice()
            +"\nV - View Shopping Cart"
            +"\nE - Exit"
            +"\nAllowance Available: " + JavaApplication1.getPlayer().getCharacter().getAllowance()
            +"\n\nPlease select your option: ");
}
        
  @Override  
  public boolean doAction(String inputs) {
        String menuItem = inputs;
        
        menuItem = menuItem.toUpperCase();
        
        switch(menuItem)
        {
            case "1":
                purchaseItem(Item.Ammunition);
                break;
            case "2":
                purchaseItem(Item.AmmunitionBox);
                break;
            case "3":
                purchaseItem(Item.Axle);
                break;
            case "4":
                purchaseItem(Item.Clothing);
                break;
            case "5":
                purchaseItem(Item.FirstAidKit);
                break;
            case "6":
                purchaseItem(Item.Food);
                break;
            case "7":
                purchaseItem(Item.Oxen);
                break;
            case "8":
                purchaseItem(Item.StarterPackage);
                break;
            case "9":
                purchaseItem(Item.Tongue);
                break;
            case "10":
                purchaseItem(Item.Tools);
                break;
            case "11":
                purchaseItem(Item.metalWheel);
                break;
            case "12":
                purchaseItem(Item.woodWheel);
                break;
            case "V":
                viewShoppingCart();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
     
        return false;
    }

    private void purchaseItem(Item item) {
        double remainingAllowance;
        PurchaseView purchaseView = new PurchaseView();

        System.out.println("You selected " + item.getName());
        purchaseView.display();
        
        remainingAllowance = StoreControl.buyItems(JavaApplication1.getPlayer().getCharacter().getAllowance(), item);
        
        if(remainingAllowance != -1){
               JavaApplication1.getPlayer().getCharacter().setAllowance(remainingAllowance);
        }
    }
    
    private void viewShoppingCart() {
        int[] itemsQuantities = new int[Item.values().length];
        double[] totals = new double[Item.values().length];
        ArrayList<Item> items = Store.getShoppingCart();
        
        for (Item item : items) {
            for (int i = 0; i < Item.values().length; i++) {
                if (item == Item.values()[i]) {
                    itemsQuantities[i]++;
                    totals[i] += Item.values()[i].getPrice();
                    break;
                }
            }
        }
        
        System.out.print("\n\n Shopping Cart\n\n");
        System.out.println("Qty     Item            Cost      Total");
        
        for (int i = 0; i < Item.values().length; i++) {
            if (itemsQuantities[i] != 0) {
                System.out.printf("%3s     %-15s %-5f %-5f\n",
                                  itemsQuantities[i],
                                  Item.values()[i].getName(),
                                  Item.values()[i].getPrice(),
                                  totals[i]);
            }
        }
    }
}