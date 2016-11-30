/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

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
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void displayObjectives() {
        System.out.println("\nThe objective of the game is to find the four ingredients."
                + "\n Return them to the Professor and create the cure");
    }

    private void displayCharacterStats() {
        System.out.println("\n************************************************"
                + "\n************************************************"
                + "\n Display Character Stats Called" 
                + "\n************************************************"
                + "\n************************************************");
    
}
}
