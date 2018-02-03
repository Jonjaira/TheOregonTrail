/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rimor
 */
public class Trading1 implements Serializable{
    
    private String itemTraded;
    private String itemObtained;

    public Trading1() {
    }
    
    

    public String getItemTraded() {
        return itemTraded;
    }

    public void setItemTraded(String itemTraded) {
        this.itemTraded = itemTraded;
    }

    public String getItemObtained() {
        return itemObtained;
    }

    public void setItemObtained(String itemObtained) {
        this.itemObtained = itemObtained;
    }

    @Override
    public String toString() {
        return "Trading1{" + "itemTraded=" + itemTraded + ", itemObtained=" + itemObtained + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.itemTraded);
        hash = 97 * hash + Objects.hashCode(this.itemObtained);
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
        final Trading1 other = (Trading1) obj;
        if (!Objects.equals(this.itemTraded, other.itemTraded)) {
            return false;
        }
        if (!Objects.equals(this.itemObtained, other.itemObtained)) {
            return false;
        }
        return true;
    }
    
    
    
}
