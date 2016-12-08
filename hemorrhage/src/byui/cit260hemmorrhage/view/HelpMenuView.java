/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
class HelpMenuView extends View{
    
    private String helpMenu;
    
    public HelpMenuView() {
        super("\n**************************************************"
                + "\nHelp Menu"
                + "\n**************************************************"
                + "\n|O - Objectives"
                + "\n|C - Developer Credits"
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
           case "C":
               this:displayCredits();
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void displayObjectives() {
        this.console.println("\nThe objective of the game is to find the four ingredients."
                + "\n Return them to the Professor and create the cure"
                + " \nand save the world from Zombies!"
                + "\nOh, and try not to die in the process.");
    }

    private void displayCredits() {
        this.console.println("\n************************************************"
                + "\n************************************************"
                + "\nCreators:"
                + "\n Braxton Bennett"
                + "\n Jason Navarro"
                + "\n Doug Gillette"
                + "\n************************************************"
                + "\n************************************************");
    }
}
