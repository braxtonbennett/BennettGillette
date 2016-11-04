/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.GameControl;
import hemorrhage.Hemorrhage;
import java.util.Scanner;


/**
 *
 * @author Braxton
 */
class ChampMenuView {
    
    private String champMenu;

    public ChampMenuView() {
         this.champMenu = "\n****************************************"
                 + "\nChoose your Champion..."
                 +"\n************************************************"
                 + "\n[L] Lumber Jack Larry---[Q]View Stats"
                 + "\n[S] Super-fast Suzie---[W]View Stats"
                 + "\n[I} Innovator Doc Brown---[E]View Stats"
                 + "\n[B] Basic Bob---[R]View Stats"
                 + "\n***********************************************";
        
    }
        public void displayChampMenu() {
        boolean done =  false;
        do {
            String champMenuOption = this.getChampMenuOption();
            if (champMenuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(champMenuOption);
            
            }
        while (!done);
    }
      private String getChampMenuOption() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.champMenu);
          
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
           case "L":
               this: chooseLarry();
               break;
           case "S":
               this: chooseSuzie();
               break;
           case "I":
               this: chooseDoc();
               break;
           case "B":
               this: chooseBob();
               break;
           case "Q":
               this: displayLarry();
               break;
           case "W":
               this: displaySuzie();
               break;
           case "E":
               this: displayDoc();
               break;
           case "R":;
               this: displayBob();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }
      private void displayLarry() {
        System.out.println("\nLarry's Stats:"
                + "\n*************************************"
                + "\n Attack Power: 15 "
                + "\n Health Power: 30"
                + "\n*************************************");
    }
      private void displaySuzie() {
        System.out.println("\nSuzie's Stats:"
               + "\n*************************************"
                + "\n Attack Power: 7"
                + "\n Health Power: 35"
                + "\n*************************************");
    }
      private void displayDoc() {
        System.out.println("\nDoc's Stats:"
                + "\n*************************************"
                + "\n Attack Power: 15"
                + "\n Health Power: 25"
                + "\n*************************************");
    }
      private void displayBob() {
        System.out.println("\nBob's Stats:"
                + "\n*************************************"
                + "\n Attack Power: 10"
                + "\n Health Power: 10"
                + "\n*************************************");
    }

    private void chooseBob() {
        System.out.println("/n The chooseBob() function has been called.");
        GameControl.createNewGame(Hemorrhage.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void chooseDoc() {
        System.out.println("/n The chooseDoc() function has been called.");
        GameControl.createNewGame(Hemorrhage.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    
        
    }

    private void chooseSuzie() {
        System.out.println("/n The chooseSuzie() function has been called.");
        GameControl.createNewGame(Hemorrhage.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    
    }

    private void chooseLarry() {
        System.out.println("/n The chooseLarry() function has been called.");
        GameControl.createNewGame(Hemorrhage.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    
       
    }
    
}
