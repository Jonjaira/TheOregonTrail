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
            +"\nL - Sort Shopping Cart by Item Amount"
            +"\nA - Allowance Available"
            +"\nE - Exit"
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
                sortShoppingCartByItemAmount();
                break;
            case "A":
                this.console.println("Available Allowance: " + JavaApplication1.getPlayer().getCharacter().getAllowance());
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                "Invalid Menu Item");
        }
     
        return false;
    }

    private void purchaseItem(Item item) throws StoreControlException {
        double remainingAllowance;
        PurchaseView purchaseView = new PurchaseView();

        this.console.println("You selected " + item.getName());
        purchaseView.display();
        
        remainingAllowance = StoreControl.buyItems(JavaApplication1.getPlayer().getAllowance(), item);
        
        if(remainingAllowance != -1){
                JavaApplication1.getPlayer().setAllowance(remainingAllowance);

                this.console.println("Available Allowance after purchase: " + JavaApplication1.getPlayer().getAllowance());
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
    
    public void sortShoppingCartByItemAmount (){
        
    }
    
    private void bubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
        }
    }
  
    private void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}