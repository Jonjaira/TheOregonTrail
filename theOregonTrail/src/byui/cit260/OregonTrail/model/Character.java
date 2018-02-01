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
    Banquer("John", "Banquer", "Repair Ability: Low", "Animal AbilityHigh: Low", "Road Ability: Low","Strenght: Low"),
    Carpenter("Dave", "Carpenter", "Repair Ability: High", "Animal Ability: Low"," Road Ability: Medium", "Strenght: High"),
    Farmer("Steve", "Farmer", "Repair Ability: High", "Animal Ability: High", "Road Ability: High", "Strenght: High");
    
    private String name;
    private String type;
    private String repairAbility;
    private String animalAbility;
    private String roadAbility;
    private String strenght;
    
Character(String name, String type, String repairAbility, String animalAbility,
          String roadAbility, String strenght){
this.name = name;
this.type = type;
this.repairAbility = repairAbility;
this.animalAbility = animalAbility;
this.roadAbility = roadAbility;
this.strenght = strenght;
}

    public String getName() {
        return name;
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
