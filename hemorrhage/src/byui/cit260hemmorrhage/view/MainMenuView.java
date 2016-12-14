/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CharacterControl;
import byui.cit260.hemorrhage.control.GameControl;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Character;
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
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(Hemorrhage.getPlayer());
       
       ChampMenuView champMenu = new ChampMenuView();
       champMenu.display();
    }

    private void startExistingGame() {
        this.displayMessage =("\n\nEnter the file where the game is saved");
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        } catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void quickStartGame() {
       GameControl.createNewGame(Hemorrhage.getPlayer());
       Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        Character character = characterList[3];
        this.console.println("/n You have chosen "+ character.getName() +" as your character");
        CharacterControl.chooseCharacter(3);
        GameMenuView gameMenu = new GameMenuView();
        
        gameMenu.display();
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       
       helpMenuView.display();
    }
    
    
}
