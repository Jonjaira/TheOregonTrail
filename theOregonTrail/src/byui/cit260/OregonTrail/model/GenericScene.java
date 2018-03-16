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
public class GenericScene extends Scene implements Serializable {
    
    private String terrainColor;
    private String terrainType;
    private String skyColor;

    public GenericScene() {
    }

    public String getTerrainColor() {
        return terrainColor;
    }

    public void setTerrainColor(String terrainColor) {
        this.terrainColor = terrainColor;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public String getSkyColor() {
        return skyColor;
    }

    public void setSkyColor(String skyColor) {
        this.skyColor = skyColor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.terrainColor);
        hash = 53 * hash + Objects.hashCode(this.terrainType);
        hash = 53 * hash + Objects.hashCode(this.skyColor);
        return hash;
    }

    @Override
    public String toString() {
        return "GenericScene1{" + "terrainColor=" + terrainColor + ", terrainType=" + terrainType + ", skyColor=" + skyColor + '}';
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
        final GenericScene other = (GenericScene) obj;
        if (!Objects.equals(this.terrainColor, other.terrainColor)) {
            return false;
        }
        if (!Objects.equals(this.terrainType, other.terrainType)) {
            return false;
        }
        if (!Objects.equals(this.skyColor, other.skyColor)) {
            return false;
        }
        return true;
    }
    
    
    
}
