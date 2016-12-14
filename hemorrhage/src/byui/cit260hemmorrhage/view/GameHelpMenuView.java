/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.GameControl;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Player;
import hemorrhage.Hemorrhage;
import java.awt.Point;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author jnava
 */
public class GameHelpMenuView extends View{
    private String gameHelpMenu;
    
    public GameHelpMenuView() {
        super("\n**************************************************"
                + "\nGame Help Menu"
                + "\n**************************************************"
                + "\n|O - Objectives"
                + "\n|S - Character Stats"
                + "\n|P - Print Chracter List"
                + "\n|E - Exit Help Menu"
                + "\n**************************************************");
    }
     
    
    @Override
    public boolean doAction(String choice) {
           choice = choice.toUpperCase();
       
       switch (choice) {
           case "O":
               this.displayObjectives();
               break;
           case "S":
               this:displayCharacterStats();
               break;
           case "P":
                this.displayMessage =("\nPlease enter the file path for file where the list+"
                + "\nis to be printed.");
                String filePath = this.getInput();
                Game game = Hemorrhage.getCurrentGame();
                Character[] characters = game.getCharacter();
               this:printChracterList(characters, filePath);
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void displayObjectives() {
        this.console.println("\nThe objective of the game is to find the four ingredients."
                + "\n Return them to the Professor and create the cure");
    }

    private void displayCharacterStats() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character character = player.getCharacter();
        this.console.println("\n"+ character.getName() +"'s Stats:"
                + "\n*************************************"
                + "\n Attack Power: "+character.getAtkPower()
                + "\n Health Power: "+character.getHealth()
                + "\n*************************************");
    
}

    private void printChracterList(Character[] characters, String filePath) {
          
        boolean value = false;
       
        try (PrintWriter out = new PrintWriter(filePath)){
            
            out.println("\n\n               Character List                  ");
            out.printf("%n%-20s%10s","Name","Location");
            out.printf("%n%-20s%10s","--------------","---------");
            
            for(Character character: characters){
            out.printf("%n%-20s%7s",character.getName(),"("+character.getX()+","+character.getY()+")");
            }
        } catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        if (value == true){
            this.console.println("The report has been printed to "+filePath);
        }
    }
}
