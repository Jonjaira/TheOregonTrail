/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

/**
 *
 * @author jonja
 */
public enum Character {
    
    //All the characters in the game will have the same characteristics always.
    //For that reason they are set as an enum.
    
    Banquer  ("Banquer",   "Low",    "Low",    "Low",    "Low",   900.00),
    Carpenter("Carpenter", "Mid",    "Mid",    "Mid",    "Mid",   720.00),
    Farmer   ("Farmer",    "High",   "High",   "High",   "High",  540.00),
    Man      ("Man",       "Medium", "Medium", "Medium", "High",    0.00),
    Woman    ("Woman",     "Low",    "High",   "Low",    "Medium",  0.00),
    Boy      ("Boy",       "Low",    "Low",    "Low",    "Low",     0.00),
    Girl     ("Girl",      "Low",    "Low",    "Low",    "Low",     0.00),
    ;
    
    private final String type;
    private final String repairAbility;
    private final String animalAbility;
    private final String roadAbility;
    private final String strenght;
    private final double allowance;
    
Character(String type, String repairAbility, String animalAbility,
          String roadAbility, String strenght, double allowance){
    this.type = type;
    this.repairAbility = repairAbility;
    this.animalAbility = animalAbility;
    this.roadAbility = roadAbility;
    this.strenght = strenght;
    this.allowance = allowance;
}
    
    public String getType() {
        return type;
    }

    public String getRepairAbility() {
        return repairAbility;
    }

    public String getAnimalAbility() {
        return animalAbility;
    }

    public String getRoadAbility() {
        return roadAbility;
    }

    public String getStrenght() {
        return strenght;
    }
   
    public double getAllowance() {
        return this.allowance;
    }

    @Override
    public String toString() {
        return "Character{" +
                "type=" + this.type +
                ", repairAbility=" + this.repairAbility +
                ", animalAbility=" + this.animalAbility +
                ", roadAbility=" + this.roadAbility +
                ", strenght=" + this.strenght + 
                ", allowance=" + String.valueOf(this.allowance) +
                '}';
    }
}
