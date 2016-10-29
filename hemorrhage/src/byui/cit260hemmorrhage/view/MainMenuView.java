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
 * @author Douglas
 */
public class MainMenuView {
    
    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Main Menu"
                + "\n----------------------------------------------------------"
                + "\nN - Create New Game"
                + "\nC - Continue Saved Game"
                + "\nQ - Quick Start"
                + "\nH - Help Menu"
                + "\nE - Exit Game"
                + "\n----------------------------------------------------------";
    }
    
    
    void displayMainMenuView() {
       Boolean done = false;
       do {
           
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("E"))
               return;
           
           done = this.doAction(menuOption);
           
       } while(!done);
    }
    
    private String getMenuOption() {
      
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.menu);
          
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
    
    public boolean doAction(String choice) {
       choice = choice.toUpperCase();
       
       switch (choice) {
           case "N":
               this.startNewGame();
               break;
           case "C":
               this.startExistingGame();
               break;
           case "Q":
               this:quickStartGame();
               break;
           case "H":
               this.displayHelpMenu();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(Hemorrhage.getPlayer());
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame() called ***");
    }

    private void quickStartGame() {
        System.out.println("\n*** quickStartGame() called ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       
       helpMenuView.displayHelpMenu();
    }
    
    
}
