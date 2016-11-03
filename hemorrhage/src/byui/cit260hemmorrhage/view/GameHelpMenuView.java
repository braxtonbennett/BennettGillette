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
public class GameHelpMenuView {
    private String gameHelpMenu;
    
    public GameHelpMenuView() {
        this.gameHelpMenu = "\n**************************************************"
                + "\nGame Help Menu"
                + "\n**************************************************"
                + "\n|O - Objectives"
                + "\n|S - Character Stats"
                + "\n|E - Exit Help Menu"
                + "\n**************************************************";
    }
     
    
    public void displayGameHelpMenu() {
        boolean done =  false;
        do {
            String gameHelpMenuOption = this.getGameHelpMenuOption();
            if (gameHelpMenuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(gameHelpMenuOption);
            
            }
        while (!done);
    }
    
    private String getGameHelpMenuOption() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.gameHelpMenu);
          
          value = keyboard.nextLine();
          value = value.trim();
          
          if (value.length() < 1) {
              System.out.println("\nInvalid value: value cannot be blank");
              continue;
              
          }
          
          break;
      }
      
      return value;
        
    }
    
    private boolean doAction(String choice) {
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
