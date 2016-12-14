/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CharacterControl;
import byui.cit260.hemorrhage.control.GameControl;
import byui.cit260.hemorrhage.control.MapControl;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Scene;
import hemorrhage.Hemorrhage;
import java.util.Scanner;


/**
 *
 * @author Braxton
 */
class ChampMenuView extends View {
    
    private String champMenu;

    public ChampMenuView() {
         super("\n****************************************"
                 + "\nChoose your Champion..."
                 +"\n************************************************"
                 + "\n[L] Lumber Jack Larry---[Q]View Stats"
                 + "\n[S] Super-fast Suzie---[W]View Stats"
                 + "\n[C} Cargo Carl---[V]View Stats"
                 + "\n[B] Basic Bob---[R]View Stats"
                 + "\n***********************************************");
        
    }
    
      @Override
       public boolean doAction(String choice) {
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
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }
      private void displayCharacter(int index) {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        Character character = characterList[index];
          this.console.println("\n"+ character.getName() +"'s Stats:"
                + "\n*************************************"
                + "\n Attack Power: "+character.getAtkPower()
                + "\n Health Power: "+character.getHealth()
                + "\n*************************************");
    }

    private void chooseCharacter(int index) {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        Character character = characterList[index];
        CharacterControl.chooseCharacter(index);
        Character mainCharacter = player.getCharacter();
        String mapName = mainCharacter.getMapNo();
        Location[][] map = MapControl.getMap(mapName);
        Location location = map[mainCharacter.getX()][mainCharacter.getY()];
        Scene scene = location.getScene();
        
        this.console.println("/n You have chosen "+ character.getName() +" as your character");
        this.console.println(scene.getDescription());
        GameMenuView gameMenu = new GameMenuView();
        
        gameMenu.display();
    }
    
}
