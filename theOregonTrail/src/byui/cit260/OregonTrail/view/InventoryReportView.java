/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class InventoryReportView {
    public void InventoryReportView(String filePath) throws IOException{
        try (PrintWriter out = new PrintWriter(filePath)) {
            int[] itemsQuantities = new int[Item.values().length];
            ArrayList<Item> items = JavaApplication1.getPlayer().getInventory().getInventoryItems();

            for (Item item : items) {
                for (int i = 0; i < Item.values().length; i++) {
                    if (item == Item.values()[i]) {
                        itemsQuantities[i]++;
                        break;
                    }
                }
            }

            out.println("\n\n    Invntory Repoert");
            out.printf("%n%-10s%-8s%s", "Quantity", "Price", "Description");
            out.printf("%n%-10s%-8s%s", "--------", "-----", "-----");

            for (int i = 0; i < Item.values().length; i++) {
                if (itemsQuantities[i] != 0) {
                    out.printf("%n%8s%7.2f  %s",
                               itemsQuantities[i],
                               Item.values()[i].getPrice(),
                               Item.values()[i].getDescription());
                }
            }
        } catch (IOException e) {
            throw e;
        }
        
        System.out.println("File saved successfully.");
    }
}
