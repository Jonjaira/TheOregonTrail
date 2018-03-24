/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrial.exceptions;

/**
 *
 * @author rimor
 */
public class DamagesControlException extends Exception{

    public DamagesControlException() {
    }

    public DamagesControlException(String string) {
        super(string);
    }

    public DamagesControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DamagesControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DamagesControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
