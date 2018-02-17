/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import byui.cit260.OregonTrail.model.Wagon;
import byui.cit260.OregonTrail.model.Map;
import byui.cit260.OregonTrail.model.Store;
import byui.cit260.OregonTrail.model.Inventory;
import byui.cit260.OregonTrail.model.Item;
import byui.cit260.OregonTrail.model.Company;


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
        
        Map mapOne = new Map ();
        mapOne.setRowCount(10);
        mapOne.setColumnCount(10);
        mapOne.setCurrentColum(2);
        mapOne.setCurrentRow(3);
        
        int mapOneRowCount = mapOne.getRowCount();
        int mapOneCurrentRow = mapOne.getCurrentRow();
        int mapOneColumnCount = mapOne.getColumnCount();
        int mapOneCurrentColumn = mapOne.getCurrentColum();
        
        System.out.println(mapOne.toString());
        
       
        Store storeOne = new Store ();
        
       
        storeOne.setTotal(100);
        
        

      
    }
}