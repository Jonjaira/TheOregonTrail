/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author jonja
 */
public class Actor implements Serializable {
    private final String name;
    private final Character character;

    public Actor(String name, Character character) {
        this.name = name;
        this.character = character;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + name +
                ", character=" + character + '}';
    }
}
