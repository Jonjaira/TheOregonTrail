/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author jonja
 */
public class Company implements Serializable {
    //This class is set as an array because its components will be always five
    //but the names might change.
    
    private String[] people = new String[4];

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" + "people=" + Arrays.toString(people) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Arrays.deepHashCode(this.people);
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
        if (!Arrays.deepEquals(this.people, other.people)) {
            return false;
        }
        return true;
    }
    
    

    public String[] getPeople() {
        return people;
    }

    public void setPeople(String[] people) {
        this.people = people;
    }
    
}
