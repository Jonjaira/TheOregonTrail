/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author jonja
 */
public class Company implements Serializable {
    //This class is set as an array because its components will be always five
    //but the names might change.
    
    private ArrayList<Actor> people;

    public Company() {
        this.people = new ArrayList<>();
    }

    public void addPersonToCompany(Actor person){
        this.people.add(person);
    }   

    public void addPeopleToCompany(Actor[] people){
        this.people.addAll(Arrays.asList(people));
    }
    
    @Override
    public String toString() {
        return "Company{" + "people=" + String.join(", ", people.toString()) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.people);
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
        final Company other = (Company) obj;
        if (!Objects.equals(this.people, other.people)) {
            return false;
        }
        return true;
    }
}