/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import java.util.Scanner;
import byui.cit260.hemorrhage.model.Character;
/**
 *
 * @author Douglas
 */
public class GameMenuView extends View{
    
       

    private String gameMenu;
    public GameMenuView() {
        super("\n-----------------------------------------------------"
                + "\n             Game Menu"
                + "\n-----------------------------------------------------"
                + "\n V - View Map"
                + "\n M - Move Location"
                + "\n L - Look Around"
                + "\n S - Search in location"
                + "\n A - Attack Enemy"
                + "\n X - Heal"
                + "\n I - View Inventory"
                + "\n G - View Glossary"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------");
    }

    
  
        
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
       
       switch (choice) {
           case "V":
               this.viewMap();
               break;
           case "M":
               this.moveLocation();
               break;
           case "L":
               this:lookAround();
               break;
           case "S":
               this.searchLocation();
               break;
           case "A":
               this.attackEnemy();
               break;
           case "I":
               this.viewInventory();
               break;
           case "G":
               this.viewGlossary();
               break;
            case "X":
               this.viewHealMenu();
               break;
           case "H":
               this.viewHelpMenu();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void viewMap() {
        System.out.println("\nThese are the maps of all 5 areas"
               + "\n---------------------------------"
               + "\n            Map 1 Bunker"
               + "\n---------------------------------"
               + "\n|      1,2       |       2,2    |"
               + "\n---------------------------------"
               + "\n|      1,1       |       2,1    |"
               + "\n---------------------------------"
               + "\n"
               + "\n---------------------------------"
               + "\n            Map 2 Vegas"
               + "\n---------------------------------"
               + "\n|      1,3       |       2,3    |"
               + "\n---------------------------------"
               + "\n|      1,2       |       2,2    |"
               + "\n---------------------------------"
               + "\n|      1,1       |       2,1    |"
               + "\n---------------------------------"
               + "\n"
               + "\n---------------------------------"
               + "\n          Map 3 New York"
               + "\n---------------------------------"
               + "\n|      1,3       |       2,3    |"
               + "\n---------------------------------"
               + "\n|      1,2       |       2,2    |"
               + "\n---------------------------------"
               + "\n|      1,1       |       2,1    |"
               + "\n---------------------------------"
               + "\n"
               + "\n---------------------------------"
               + "\n          Map 4 Houston"
               + "\n---------------------------------"
               + "\n|      1,3       |       2,3    |"
               + "\n---------------------------------"
               + "\n|      1,2       |       2,2    |"
               + "\n---------------------------------"
               + "\n|      1,1       |       2,1    |"
               + "\n---------------------------------"
               + "\n"
               + "\n---------------------------------"
               + "\n         Map 5 Los Angeles"
               + "\n---------------------------------"
               + "\n|      1,3       |       2,3    |"
               + "\n---------------------------------"
               + "\n|      1,2       |       2,2    |"
               + "\n---------------------------------"
               + "\n|      1,1       |       2,1    |"
               + "\n---------------------------------");
        
    }

    private void moveLocation() {
       System.out.println("\n*** moveLocation() called***");
    }

    private void lookAround() {
        System.out.println("\n*** lookAround() called***");
    }

    private void searchLocation() {
        System.out.println("\n*** searchLocation() called***");
    }

    private void attackEnemy() {
       
        BattleView battleView = new BattleView();
        battleView.display();
    }

    private void viewInventory() {
        System.out.println("\n*** viewInventory() called***");
    }

    private void viewGlossary() {
        System.out.println("\n*** viewGlossary() called***");
    }

    private void viewHelpMenu() {
      GameHelpMenuView gameHelpMenuView = new GameHelpMenuView();
       
      gameHelpMenuView.display();
    }

    private void viewHealMenu() {
        
        HealingView healingView = new HealingView();
        healingView.display();
    }
}
