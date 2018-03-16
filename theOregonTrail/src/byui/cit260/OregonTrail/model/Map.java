/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.Serializable;

public class Map implements Serializable{
    //Class variables. For this class I'm hesitant about the data type. I think 
    //Instead of a row count it could be a location attribute and use the class
    // Point instead of an int. I need guidance from the teacher for this one.
    
    private int rowCount;
    private int currentRow; 
    private int columnCount; 
    private int currentColum;
    private Location locations[][];

    public Map(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.currentRow = 0;
        this.columnCount = columnCount;
        this.currentColum = 0;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentColum() {
        return currentColum;
    }

    public void setCurrentColum(int currentColum) {
        this.currentColum = currentColum;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", currentRow=" + currentRow + ", columnCount=" + columnCount + ", currentColum=" + currentColum + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.rowCount;
        hash = 29 * hash + this.currentRow;
        hash = 29 * hash + this.columnCount;
        hash = 29 * hash + this.currentColum;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentColum != other.currentColum) {
            return false;
        }
        return true;
    }
}
