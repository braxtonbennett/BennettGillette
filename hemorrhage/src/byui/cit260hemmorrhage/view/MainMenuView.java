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
public class MainMenuView extends View{
   
    
    private String menu;

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Main Menu"
                + "\n----------------------------------------------------------"
                + "\nN - Create New Game"
                + "\nC - Continue Saved Game"
                + "\nQ - Quick Start"
                + "\nH - Help Menu"
                + "\nE - Exit Game"
                + "\n----------------------------------------------------------");
    }
    
    

    @Override
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
       gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame() called ***");
    }

    private void quickStartGame() {
        System.out.println("\n*** quickStartGame() called ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       
       helpMenuView.display();
    }
    
    
}
