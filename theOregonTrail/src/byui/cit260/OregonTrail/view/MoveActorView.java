/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

/**
 *
 * @author jonja
 */
public class MoveActorView extends View {
    public MoveActorView(){
        super("Please enter the ROW and COLUMN where to move");
    }
    
    private String[] getInputs() {
        String[] inputs = new String[2];
        
        inputs[0] = getInput();
        
        inputs[1] = getInput();
        
        return inputs;
    } 
    
    @Override
    public boolean doAction(String inputs) {
        return true;
    }
}
