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
                 + "\n[C} Cargo Carl---[V]View Stats"
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
               this: chooseCharacter(2);
               break;
           case "S":
               this: chooseCharacter(0);
               break;
           case "C":
               this: chooseCharacter(1);
               break;
           case "B":
               this: chooseCharacter(3);
               break;
           case "Q":
               this: displayCharacter(2);
               break;
           case "W":
               this: displayCharacter(0);
               break;
           case "V":
               this: displayCharacter(1);
               break;
           case "R":;
               this: displayCharacter(3);
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }
      private void displayCharacter(int index) {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        Character character = characterList[index];
          System.out.println("\n"+ character.getName() +"'s Stats:"
                + "\n*************************************"
                + "\n Attack Power: "+character.getAtkPower()
                + "\n Health Power: "+character.getHealth()
                + "\n Pack Size: "+character.getPack()
                + "\n*************************************");
    }

    private void chooseCharacter(int index) {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        Character character = characterList[index];
        System.out.println("/n You have chosen "+ character.getName() +" as your character");
        CharacterControl.chooseCharacter(index);
        GameMenuView gameMenu = new GameMenuView();
        
        gameMenu.display();
    }
    
}
