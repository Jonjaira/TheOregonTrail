/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.view;

import java.io.PrintWriter;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class ErrorView {
    private static PrintWriter console = JavaApplication1.getOutFile();
    private static PrintWriter log = JavaApplication1.getLogFile();
    
    public static void display(String className, String errorMessaage){
        console.println(
        "\n--- Error ------------------------------------------------"
        + "\n" + errorMessaage
        + "\n--------------------------------------------------------");
        
        log.printf("%n%ns", className + " - ", errorMessaage);
    }
    
}
