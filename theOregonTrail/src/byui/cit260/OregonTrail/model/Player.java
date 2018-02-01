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
    private String name;
    private double score;
    private Game game;

    public Player() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

      @Override
    public String toString() {
        return "Player{" + "name=" + name + ", score=" + score + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
