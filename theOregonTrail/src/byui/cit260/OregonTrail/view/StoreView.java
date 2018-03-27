/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.StoreControl;
import byui.cit260.OregonTrail.exceptions.StoreControlException;
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
            +"\nL - Sort List Price"
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
                try
                { 
                    purchaseItem(Item.Ammunition);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }
                break;
            case "2":
                try
                {
                purchaseItem(Item.AmmunitionBox);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }
                break;
            case "3":
                try
                {
                purchaseItem(Item.Axle);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }    
                break;
            case "4":
                try
                {    
                purchaseItem(Item.Clothing);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }
                break;
            case "5":
                try
                {
                purchaseItem(Item.FirstAidKit);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }    
                break;           
            case "6":
                try
                {
                purchaseItem(Item.Food);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }   
                break;
            case "7":
                try
                {
                purchaseItem(Item.Oxen);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }    
                break;
            case "8":
                try
                {
                purchaseItem(Item.StarterPackage);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }  
                break;
            case "9":
                try
                {    
                purchaseItem(Item.Tongue);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }  
                break;
            case "10":
                try
                {
                purchaseItem(Item.Tools);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }  
                break;
            case "11":
                try
                {
                purchaseItem(Item.metalWheel);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }  
                break;
            case "12":
                try
                {    
                purchaseItem(Item.woodWheel);
                }
                catch (StoreControlException e)
                {
                    this.console.println(e.getMessage());
                    return false;
                }  
                break;
            case "V":
               
                viewShoppingCart();
                
                break;
            case "L":
               
                sortListItemPrice();
               
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                "Invalid Menu Item");
        }
     
        return true;
    }

    private void purchaseItem(Item item) throws StoreControlException {
        double remainingAllowance;
        PurchaseView purchaseView = new PurchaseView();

        this.console.println("You selected " + item.getName());
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
        
        this.console.print("\n\n Shopping Cart\n\n");
        this.console.println("Qty     Item            Cost      Total");
        
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
    
    public void sortListItemPrice (){
//        double[] list = new double[Item.values().length];
//        double[] upDownList = new double[Item.values().length];
        
        for (int i = 0; i<Item.values().length ; i++)
        {
        this.console.print("\n i=" +i+"\n ");
//            int index = i;
//            for (int j = i+1; j<Item.values().length; j++ ){
            for (int j = 0; j<Item.values().length && i != j; j++ ){
        this.console.print("\n J " +j+" I = "+ i);
                if (Item.values()[j].getPrice() < Item.values()[i].getPrice()){
                this.console.print("\n j=i+1" +Item.values()[j].getPrice()+" < "+ Item.values()[i].getPrice());
//                            index = j;
        //                System.out.print("\n"+Item.values()[index].getName()+" "+Item.values()[index].getPrice());
                    Item upDownList = Item.values()[i];
                                     this.console.print("\n"+upDownList);
                    Item.values()[i] = Item.values()[j];
                                     this.console.print("\n"+Item.values()[i]);
                    Item.values()[j] = upDownList;
                                     this.console.print("\n"+Item.values()[j]+"\n");
                this.console.print("\n"+ i +"  "+ Item.values()[i]+" "+Item.values()[j]/*+ Item.values()[i].getName()+"  "+Item.values()[i].getPrice()*/);
                }
                
                }
//            System.out.println("\n"+Item.values()[i].getPrice());
            for (Item value : Item.values()) {
                this.console.print("\n" + value.getName() + "  " + value.getPrice());
            }
        }
        
//        for (Item item : Item.values()) {
//            System.out.print("\n" + item.getName()+"  "+item.getPrice());
//                
//                }
        
    }
    
}