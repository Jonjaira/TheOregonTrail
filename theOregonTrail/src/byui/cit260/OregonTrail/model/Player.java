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
 * @author jonja
 */
public class Player implements Serializable{
    //Class Variables
    
    private Character character;
    private double score;
    private Game game;
    private Company company;
    private Inventory inventory;
    private Location currentLocation;

    public Player() {
        this.company = new Company();
        this.score = 0;
        this.currentLocation = new Location(0, 0, true);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Company getCompany() {
        return company;
    }
    
    public Inventory getInventory() {
        return this.inventory;
    }
    
    public Character getCharacter() {
        return this.character;
    }
    
    public void setCharacter(Character character) {
        this.character = character;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(Location newLocation) {
        this.currentLocation = newLocation;
    }

      @Override
    public String toString() {
        return "Player{" + "name=" + this.character.getName() + ", score=" + score + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.character.getName());
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.score) ^ (Double.doubleToLongBits(this.score) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.score) != Double.doubleToLongBits(other.score)) {
            return false;
        }
        if (!Objects.equals(this.character.getName(), other.character.getName())) {
            return false;
        }
        return true;
    }

    public void setCharacter(java.lang.Character character) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
