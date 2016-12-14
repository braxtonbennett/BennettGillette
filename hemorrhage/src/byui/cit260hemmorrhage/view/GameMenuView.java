/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.GameControl;
import byui.cit260.hemorrhage.control.MapControl;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Item;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Map;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Scene;
import byui.cit260.hemorrhage.model.WeaponItem;
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
                + "\n C - Move to New Map"
                + "\n L - Look Around"
                + "\n S - Search in location"
                + "\n A - Attack Enemy"
                + "\n X - Heal"
                + "\n I - View Inventory"
                + "\n G - View Glossary"
                + "\n K - Save Game"
                + "\n H - Help Menu"
                + "\n E - Exit Game"
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
           case "C":
               this:moveMap();
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
           case "K":
               this.saveGame();
               break; 
           case "X":
               this.viewHealMenu();
               break;
           case "H":
               this.viewHelpMenu();
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void viewMap() {
        this.console.println("\nThese are the maps of all 5 areas");
              Location[][] rexburg = Map.rexburg.getLocations();
              Location[][] lasVegas = Map.lasVegas.getLocations();
              Location[][] lA = Map.lA.getLocations();
              Location[][] newYork = Map.newYork.getLocations();
              Location[][] houston = Map.houston.getLocations();
              
              int rowNo = 0;
              int rowNum = -1;
              int columnNum = 0;
              
              this.console.println("\n                 All Maps");
             
              this.console.println("\n"
                      + "\n                 Rexburg Map");
              this.console.println("    1     2  ");
              for (Location[] row : rexburg) {
                  rowNo++;
                  rowNum++;
                  this.console.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = rexburg[rowNum][columnNo];
                  Scene scene = location.getScene();
                      this.console.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  this.console.print("|");
                  
              }
              this.console.println("\n----------------");
              
              rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              this.console.println("\n"
                      + "\n                 Las Vegas Map");
              this.console.println("    1     2  ");
              for (Location[] row : lasVegas) {
                  rowNo++;
                  rowNum++;
                  this.console.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = lasVegas[rowNum][columnNo];
                  Scene scene = location.getScene();
                      this.console.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  this.console.print("|");
                  
              }
              this.console.println("\n----------------");
              
               rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              this.console.println("\n"
                      + "\n                 LA Map");
              this.console.println("    1     2  ");
              for (Location[] row : lA) {
                  rowNo++;
                  rowNum++;
                  this.console.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = lA[rowNum][columnNo];
                  Scene scene = location.getScene();
                      this.console.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  this.console.print("|");
                  
              }
              this.console.println("\n----------------");
              
               rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              this.console.println("\n"
                      + "\n                 New York Map");
              this.console.println("    1     2  ");
              for (Location[] row : newYork) {
                  rowNo++;
                  rowNum++;
                  this.console.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = newYork[rowNum][columnNo];
                  Scene scene = location.getScene();
                      this.console.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  this.console.print("|");
                  
              }
              this.console.println("\n----------------");
              
              rowNo = 0;
              rowNum = -1;
              columnNum = 0;
              
              this.console.println("\n"
                      + "\n                 Houston Map");
              this.console.println("    1     2  ");
              for (Location[] row : houston) {
                  rowNo++;
                  rowNum++;
                  this.console.print("\n----------------"
                          + "\n"+ rowNo);
                  int columnNo = -1;
                  for (Location column : row) {
                      columnNo++;
                  Location location = houston[rowNum][columnNo];
                  Scene scene = location.getScene();
                      this.console.print("|  "+scene.getMapSymbol()+"  ");
                      
                  }
                  this.console.print("|");
                  
              }
              this.console.println("\n----------------");
              
              
              
              
        
    }

    private void moveLocation() {
       MoveView moveView = new MoveView();
       moveView.display();
    }

    private void lookAround() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        String mapName = mainCharacter.getMapNo();
        Location[][] map = MapControl.getMap(mapName);
        Location location = map[mainCharacter.getX()][mainCharacter.getY()];
        Scene scene = location.getScene();
        this.console.println(scene.getDescription());
    }

    private void searchLocation() {
        StringBuilder line;
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        int x = mainCharacter.getX();
        int y = mainCharacter.getY();
        String mapNo = mainCharacter.getMapNo();
        ArrayList<Item> itemsAtLocation = MapControl.searchLocation(x, y, mapNo);
        this.console.println("\n              Items at your Location");
        line = new StringBuilder("                                   ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"No at Loc.");
        this.console.println(line.toString());
        
        for (Item item:itemsAtLocation){
            line = new StringBuilder("                                   ");
            line.insert(0,item.getDescription());
            line.insert(23, item.getNoFound());
            this.console.println(line.toString());
            
               
        }
        
        
        this.console.println("\nThese Items have been added to your inventory.");
    }

    private void attackEnemy() {
       
        BattleView battleView = new BattleView();
        battleView.display();
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = Hemorrhage.getCurrentGame();
        Item[] items = game.getItem();
        HealthItem[] healthItems = game.getHealthItems();
        WeaponItem[] weapons = game.getWeapons();
        
        this.console.println("\n              Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"IN STOCK");
        this.console.println(line.toString());
        
        for (Item item: items){
            line = new StringBuilder("                                   ");
            line.insert(0,item.getDescription());
            line.insert(23, item.getQuantityInStock());
            this.console.println(line.toString());  
        }
        for (HealthItem healthItem: healthItems){
            line = new StringBuilder("                                   ");
            line.insert(0,healthItem.getDescription());
            line.insert(23, healthItem.getQuantityInStock());
            this.console.println(line.toString());  
        }
        for (WeaponItem weapon: weapons){
            line = new StringBuilder("                                   ");
            line.insert(0,weapon.getDescription());
            line.insert(23, weapon.getQuantityInStock());
            this.console.println(line.toString());  
        }
        
        
    }

    private void viewGlossary() {
        this.console.println("\n*** viewGlossary() called***");
    }

    private void viewHelpMenu() {
      GameHelpMenuView gameHelpMenuView = new GameHelpMenuView();
       
      gameHelpMenuView.display();
    }

    private void viewHealMenu() {
        
        HealingView healingView = new HealingView();
        healingView.display();
    }

    private void saveGame() {
        Game game = Hemorrhage.getCurrentGame();
        
        this.displayMessage =("\nPlease enter the file path for file where the game "
                + "\nis to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(Hemorrhage.getCurrentGame(), filePath);
        } catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void moveMap() {
        MoveMapView moveMapView = new MoveMapView();
        moveMapView.display();
    }
}
