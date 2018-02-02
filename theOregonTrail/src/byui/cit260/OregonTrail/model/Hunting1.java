/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author rimor
 */
public class Hunting1 implements Serializable{
    private int bullets;

    public Hunting1() {
    }
    
    

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public String toString() {
        return "Hunting1{" + "bullets=" + bullets + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.bullets;
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
        final Hunting1 other = (Hunting1) obj;
        if (this.bullets != other.bullets) {
            return false;
        }
        return true;
    }
    
    
    
}
