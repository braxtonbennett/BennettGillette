/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.GameControl;
import byui.cit260.hemorrhage.model.Player;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name";
        
        this.displayBanner();
    }
    
    private void displayBanner() {
       
        System.out.println(
                "\n**********************************************************"
                        + "\n"
                        + "\n This game is Hemmorrhage!"
                        + "\nIn this game you live in a postapocalyptic world "
                        + "\nthat is now inhabited with ZOMBIES!!! OOHHHH SCARY!"
                        + "\nGood luck you're gonna need it!"
                        + "\n"
                        + "\n**********************************************************");

    }

    public void displayStartProgramView() {
       
        boolean done = false;
       do {
          
           String playersName = this.getPlayersName();
           if (playersName.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(playersName);
           
       } while(!done);
    }

    private String getPlayersName() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.promptMessage);
          
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

    private boolean doAction(String playersName) {
       
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name:"
                    + "The name must be greater than one charater in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player==null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n======================================="
                + "\nWelcome to the Game " + player.getName()
                + "\nHave fun Killing Zombies"
                + "\n=======================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

}
