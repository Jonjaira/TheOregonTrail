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
public class Working implements Serializable{
    
    private String tools;

    public Working() {
    }
    
    
    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    
    
    @Override
    public String toString() {
        return "Working1{" + "tools=" + tools + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.tools);
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
        final Working other = (Working) obj;
        if (!Objects.equals(this.tools, other.tools)) {
            return false;
        }
        return true;
    }
      
  
    
}
