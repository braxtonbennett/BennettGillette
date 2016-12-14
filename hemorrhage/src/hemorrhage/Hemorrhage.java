/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hemorrhage;


import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260hemmorrhage.view.StartProgramView;
import byui.cit260.hemorrhage.model.WeaponItem;
import byui.cit260.hemorrhage.model.Character;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas
 */
public class Hemorrhage {

    private static Game currentGame = null;
    private static Player player = null;
    
   private static PrintWriter outFile = null;
   private static BufferedReader inFile = null;
   private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
          StartProgramView startProgramView = null;  
       
       try {
           Hemorrhage.inFile = new BufferedReader(new InputStreamReader(System.in));
           Hemorrhage.outFile = new PrintWriter(System.out, true);
           
           String filePath = "log.txt";
           Hemorrhage.logFile = new PrintWriter(filePath);
           
           startProgramView = new StartProgramView();
           startProgramView.display();
       } catch (Throwable te) { 
           System.out.println(te.getMessage());
           te.printStackTrace();
           startProgramView.display();
       } 
       finally  {
           try {
               if (Hemorrhage.inFile !=null)
               Hemorrhage.inFile.close();
               
               if (Hemorrhage.outFile !=null)
               Hemorrhage.outFile.close();
               
               if (Hemorrhage.logFile !=null)
               Hemorrhage.logFile.close();
               
           } catch (IOException ex) {
               System.out.println("Error Closing Files");
               return;
           }
           
       }
       
       
       
       
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hemorrhage.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Hemorrhage.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hemorrhage.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Hemorrhage.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Hemorrhage.logFile = logFile;
    }
    
}
