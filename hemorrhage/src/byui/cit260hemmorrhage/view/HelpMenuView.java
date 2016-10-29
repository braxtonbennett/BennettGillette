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
class HelpMenuView {
    
    private String helpMenu;
    
    public HelpMenuView() {
        this.helpMenu = "\n**************************************************"
                + "\nHelp Menu"
                + "\n**************************************************"
                + "\n|O - Objectives"
                + "\n|C - Developer Credits"
                + "\n|E - Exit Help Menu"
                + "\n**************************************************";
    }
     
    
    public void displayHelpMenu() {
        boolean done =  false;
        do {
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(helpMenuOption);
            
            }
        while (!done);
    }
    
    private String getHelpMenuOption() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.helpMenu);
          
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
           case "C":
               this:displayCredits();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void displayObjectives() {
        System.out.println("\nThe objective of the game is to find the four ingredients."
                + "\n Return them to the Professor and create the cure"
                + " \nand save the world from Zombies!"
                + "\nOh, and try not to die in the process.");
    }

    private void displayCredits() {
        System.out.println("\n************************************************"
                + "\n************************************************"
                + "\nCreators:"
                + "\n Braxton Bennett"
                + "\n Jason Navarro"
                + "\n Doug Gillette"
                + "\n************************************************"
                + "\n************************************************");
    }
}
