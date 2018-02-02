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
 * @author Hansel castro
 */
public class LocationScene implements Serializable {
    
    private String name;
    private String activityType;

    public LocationScene() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.activityType);
        return hash;
    }

    @Override
    public String toString() {
        return "LocationScene{" + "name=" + name + ", activityType=" + activityType + '}';
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
        final LocationScene other = (LocationScene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.activityType, other.activityType)) {
            return false;
        }
        return true;
    }
    
    
    
}
