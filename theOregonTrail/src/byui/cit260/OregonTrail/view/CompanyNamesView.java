/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import byui.cit260.OregonTrail.control.GameControl;

/**
 *
 * @author jonja
 */
public class CompanyNamesView extends View {
    public CompanyNamesView (){
        super ("Please enter a name for a company member:");
    }
    
    @Override
        public boolean doAction(String value) {
            GameControl.setActor(value);
        return true;
    }
}

