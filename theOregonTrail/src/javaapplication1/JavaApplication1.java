/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import byui.cit260.OregonTrail.model.Game;
import byui.cit260.OregonTrail.model.Player;
import byui.cit260.OregonTrail.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jonja
 */
public class JavaApplication1 {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JavaApplication1.logFile = logFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JavaApplication1.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        JavaApplication1.inFile = inFile;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
        
        JavaApplication1.inFile = new BufferedReader(new InputStreamReader(System.in));
        JavaApplication1.outFile = new PrintWriter(System.out, true); 
        JavaApplication1.logFile = new PrintWriter("logFile.txt");
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
    }catch (Throwable e){
        System.out.println("Exception: " + e.toString()+
                          "\nCause: " + e.getCause() +
                          "\nMessage: " + e.getMessage());
        e.printStackTrace();
    }
        
    finally {
            try {
                if(JavaApplication1.inFile != null)
                   JavaApplication1.inFile.close();
                if(JavaApplication1.outFile != null)
                   JavaApplication1.outFile.close();
                if(JavaApplication1.logFile != null)
                    JavaApplication1.logFile.close();
            } catch (IOException ex) {
                System.out.println("An error occurred while closing the files");
            }
            JavaApplication1.outFile.close();
        }    
    }
    
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        JavaApplication1.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player){
        JavaApplication1.player = player;
    }
}