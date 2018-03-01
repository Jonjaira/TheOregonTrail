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
    
    Banquer("John", "Banquer", "Repair Ability: Low", "Animal AbilityHigh: Low", "Road Ability: Low","Strenght: Low", 900.00),
    Carpenter("Dave", "Carpenter", "Repair Ability: High", "Animal Ability: Low"," Road Ability: Medium", "Strenght: High", 720.00),
    Farmer("Steve", "Farmer", "Repair Ability: High", "Animal Ability: High", "Road Ability: High", "Strenght: High", 540.00);
    
    private String name;
    private String type;
    private String repairAbility;
    private String animalAbility;
    private String roadAbility;
    private String strenght;
    private double allowance;
    
Character(String name, String type, String repairAbility, String animalAbility,
          String roadAbility, String strenght, double allowance){
this.name = name;
this.type = type;
this.repairAbility = repairAbility;
this.animalAbility = animalAbility;
this.roadAbility = roadAbility;
this.strenght = strenght;
this.allowance = allowance;
}

    public String getName() {
        return name;
    }

    public double getAllowance() {
        return this.allowance;
    }
    
    public void setAllowance(double allowance) {
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

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", type=" + type + ", repairAbility=" + repairAbility + ", animalAbility=" + animalAbility + ", roadAbility=" + roadAbility + ", strenght=" + strenght + '}';
    }
    
}
