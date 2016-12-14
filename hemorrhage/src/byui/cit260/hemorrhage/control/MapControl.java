/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Item;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Map;
import byui.cit260.hemorrhage.model.Scene;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.WeaponItem;
import hemorrhage.Hemorrhage;
import java.awt.Point;
import java.util.ArrayList;


/**
 *
 * @author Douglas
 */
public class MapControl {

    
    public static Location[][] createRexburg() {
        Location[][] locations = Map.rexburg.getLocations();
        assignScenesToRexburg(locations);
        return locations;
        
    }
    
    public static void createNewYork() {
        Location[][] locations = Map.newYork.getLocations();
        assignScenesToNewYork(locations);
        
        
    }
     public static void createLA() {
        Location[][] locations = Map.lA.getLocations();
        assignScenesToLA(locations);
        
        
    }
    
    public static void createLasVegas() {
        Location[][] locations = Map.lasVegas.getLocations();
        assignScenesToLasVegas(locations);    
        
    }
    public static void createHouston() {
        Location[][] locations = Map.houston.getLocations();
        assignScenesToHouston(locations);
        
    }

    private static void assignScenesToRexburg(Location[][] locations) {
        locations[0][0].setScene(Scene.rexburg1);
        locations[0][1].setScene(Scene.rexburg2);
        locations[1][0].setScene(Scene.rexburg3);
        locations[1][1].setScene(Scene.rexburg4);
    }

    private static void assignScenesToNewYork(Location[][] locations) {
        locations[0][0].setScene(Scene.newYork1);
        locations[0][1].setScene(Scene.newYork2);
        locations[1][0].setScene(Scene.newYork3);
        locations[1][1].setScene(Scene.newYork4);
        locations[2][0].setScene(Scene.newYork5);
        locations[2][1].setScene(Scene.newYork6);
    }

    private static void assignScenesToLA(Location[][] locations) {
        locations[0][0].setScene(Scene.lA1);
        locations[0][1].setScene(Scene.lA2);
        locations[1][0].setScene(Scene.lA3);
        locations[1][1].setScene(Scene.lA4);
        locations[2][0].setScene(Scene.lA5);
        locations[2][1].setScene(Scene.lA6);
    }

    private static void assignScenesToLasVegas(Location[][] locations) {
        locations[0][0].setScene(Scene.lasVegas1);
        locations[0][1].setScene(Scene.lasVegas2);
        locations[1][0].setScene(Scene.lasVegas3);
        locations[1][1].setScene(Scene.lasVegas4);
        locations[2][0].setScene(Scene.lasVegas5);
        locations[2][1].setScene(Scene.lasVegas6);
    }

    private static void assignScenesToHouston(Location[][] locations) {
        locations[0][0].setScene(Scene.houston1);
        locations[0][1].setScene(Scene.houston2);
        locations[1][0].setScene(Scene.houston3);
        locations[1][1].setScene(Scene.houston4);
        locations[2][0].setScene(Scene.houston5);
        locations[2][1].setScene(Scene.houston6);
    }
    public static void moveCharactersToStart(){
        System.out.println("moveCharactersToStart() called");
    }

    public static ArrayList<Item> searchLocation(int x, int y, String characterMapNo){
        
        ArrayList<Item> itemsAtLocation = new ArrayList<>();
        Game game = Hemorrhage.getCurrentGame();
        Item[] items = game.getItem();
        for (Item item: items){
            int itemX = item.getX();
            int itemY = item.getY();
            String mapNo = item.getMapNo();
            if(mapNo.equals(characterMapNo) && itemX == x && itemY == y){
                itemsAtLocation.add(item);
                item.setQuantityInStock(item.getNoFound());
            }
        }
            WeaponItem[] weapons = game.getWeapons();
        for (WeaponItem weapon: weapons){
            int weaponX = weapon.getX();
            int weaponY = weapon.getY();
            String weaponMapNo = weapon.getMapNo();
            if(weaponMapNo.equals(characterMapNo) && weaponX == x && weaponY == y){
                itemsAtLocation.add(weapon);
                weapon.setQuantityInStock(weapon.getNoFound());
            }
    }
        HealthItem[] healths = game.getHealthItems();
        for (HealthItem health: healths){
            int healthX = health.getX();
            int healthY = health.getY();
            String weaponMapNo = health.getMapNo();
            if(weaponMapNo.equals(characterMapNo) && healthX == x && healthY == y){
                itemsAtLocation.add(health);
                 health.setQuantityInStock(health.getNoFound());
            }
    }
        return itemsAtLocation;
    
    }
    public static ArrayList<Character> charactersAtLocation(int x, int y, String characterMapNo){
       
        ArrayList<Character> characterList = new ArrayList<>();
        Game game = Hemorrhage.getCurrentGame();
        Character[] characters = game.getZombieList();
        for (Character character: characters){
            int itemX = character.getX();
            int itemY = character.getY();
            String mapNo = character.getMapNo();
            if(mapNo.equals(characterMapNo) && itemX == x && itemY == y){
                characterList.add(character);
            }
    }
        return characterList;
    }
    
    public static Location[][] getMap(String mapNo){
        
        Location[][] map = null;
        switch (mapNo) {
           case "rexburg":
               map = Map.rexburg.getLocations();
               
               break;
           case "newYork":
               map = Map.newYork.getLocations();
               
               break;
           case "lA":
               map = Map.lA.getLocations();
               
               break;
           case "lasVegas":
               map = Map.lasVegas.getLocations();
               
               break;
           case "houston":
               map = Map.houston.getLocations();
               
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return map;
    }
    public static Scene moveMap(String MapName){
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        mainCharacter.setX(0);
        mainCharacter.setY(0);
        mainCharacter.setMapNo(MapName);
        Location[][] map = getMap(MapName);
        Location location = map[0][0];
        Scene scene = location.getScene();
        return scene;
    }
    
   
   
    
}
