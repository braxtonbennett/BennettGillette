/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.MapControl;
import java.util.Scanner;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Item;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Map;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Scene;
import hemorrhage.Hemorrhage;
import java.awt.Point;
import java.util.ArrayList;
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
                + "\n E - Exit"
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
        System.out.println("\nThese are the maps of all 5 areas");
              Location[][] rexburg = Map.rexburg.getLocations();
              Location[][] lasVegas = Map.lasVegas.getLocations();
              Location[][] lA = Map.lA.getLocations();
              Location[][] newYork = Map.newYork.getLocations();
              Location[][] houston = Map.houston.getLocations();
              
              int rowNo = 0;
              int rowNum = -1;
              int columnNum = 0;
              
              System.out.println("\n                 All Maps");
             
              System.out.println("\n"
                      + "\n                 Rexburg Map");
              System.out.println("    1     2  ");
              for (Location[] row : rexburg) {
                  rowNo++;
                  rowNum++;
                  System.out.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = rexburg[rowNum][columnNo];
                  Scene scene = location.getScene();
                      System.out.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  System.out.print("|");
                  
              }
              System.out.println("\n----------------");
              
              rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              System.out.println("\n"
                      + "\n                 Las Vegas Map");
              System.out.println("    1     2  ");
              for (Location[] row : lasVegas) {
                  rowNo++;
                  rowNum++;
                  System.out.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = lasVegas[rowNum][columnNo];
                  Scene scene = location.getScene();
                      System.out.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  System.out.print("|");
                  
              }
              System.out.println("\n----------------");
              
               rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              System.out.println("\n"
                      + "\n                 LA Map");
              System.out.println("    1     2  ");
              for (Location[] row : lA) {
                  rowNo++;
                  rowNum++;
                  System.out.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = lA[rowNum][columnNo];
                  Scene scene = location.getScene();
                      System.out.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  System.out.print("|");
                  
              }
              System.out.println("\n----------------");
              
               rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              System.out.println("\n"
                      + "\n                 New York Map");
              System.out.println("    1     2  ");
              for (Location[] row : newYork) {
                  rowNo++;
                  rowNum++;
                  System.out.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = newYork[rowNum][columnNo];
                  Scene scene = location.getScene();
                      System.out.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  System.out.print("|");
                  
              }
              System.out.println("\n----------------");
              
              rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              
              System.out.println("\n"
                      + "\n                 Houston Map");
              System.out.println("    1     2  ");
              for (Location[] row : houston) {
                  rowNo++;
                  rowNum++;
                  System.out.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = houston[rowNum][columnNo];
                  Scene scene = location.getScene();
                      System.out.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  System.out.print("|");
                  
              }
              System.out.println("\n----------------");
              
              
              
              
        
    }

    private void moveLocation() {
       MoveView moveView = new MoveView();
       moveView.display();
    }

    private void lookAround() {
        System.out.println("\n*** lookAround() called***");
    }

    private void searchLocation() {
        StringBuilder line;
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        Point characterLocation = mainCharacter.getCoordinates();
        Long mapNo = mainCharacter.getMapNo();
        ArrayList<Item> itemsAtLocation = MapControl.searchLocation(characterLocation, mapNo);
        System.out.println("\n              Items at your Location");
        line = new StringBuilder("                                   ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"IN STOCK");
        System.out.println(line.toString());
        
        for (Item item:itemsAtLocation){
            line = new StringBuilder("                                   ");
            line.insert(0,item.getDescription());
            line.insert(23, item.getQuantityInStock());
            System.out.println(line.toString());
            
               
        }
        
        
        System.out.println("\n*** searchLocation() called***");
    }

    private void attackEnemy() {
       
        BattleView battleView = new BattleView();
        battleView.display();
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = Hemorrhage.getCurrentGame();
        Item[] items = game.getItem();
        
        System.out.println("\n              Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"IN STOCK");
        System.out.println(line.toString());
        
        for (Item item: items){
            line = new StringBuilder("                                   ");
            line.insert(0,item.getDescription());
            line.insert(23, item.getQuantityInStock());
            System.out.println(line.toString());
            
            
        }
        
        
        
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
