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
public class Activity implements Serializable {
    private String description;
    private double ponitsAwarded;

    public Activity() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPonitsAwarded() {
        return ponitsAwarded;
    }

    public void setPonitsAwarded(double ponitsAwarded) {
        this.ponitsAwarded = ponitsAwarded;
    }

    @Override
    public String toString() {
        return "Activity1{" + "description=" + description + ", ponitsAwarded=" + ponitsAwarded + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.ponitsAwarded) ^ (Double.doubleToLongBits(this.ponitsAwarded) >>> 32));
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
        final Activity other = (Activity) obj;
        if (Double.doubleToLongBits(this.ponitsAwarded) != Double.doubleToLongBits(other.ponitsAwarded)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
