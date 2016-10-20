/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hemorrhage;

import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Item;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Map;
import byui.cit260.hemorrhage.model.Pack;
import byui.cit260.hemorrhage.model.Scene;
import byui.cit260.hemorrhage.model.WeaponItem;


/**
 *
 * @author Douglas
 */
public class Hemorrhage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("Charlie");
        playerOne.setBestTime(2.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        gameOne.setTotalTime(2.55);
        gameOne.setNoPeople(5);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Character suzie = new Character();
        suzie.setName("Suzie");
        suzie.setDescription("skinny girl with dark blach hair");
        suzie.setMapCoordinateX(2);
        suzie.setMapCoordinateY(3);
        suzie.setAtkPower(35);
        suzie.setHealth(100);
        suzie.setDefPower(10);
        
        String characterInfo = suzie.toString();
        System.out.println(characterInfo);
        
        Item itemOne = new Item();
        itemOne.setName("Poison");
        itemOne.setQuantityInStock(1);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        HealthItem bread = new HealthItem();
        bread.setName("Bread");
        bread.setQuantityInStock(5);
        bread.setHealthPoints(30);
        
        String healthItemInfo = bread.toString();
        System.out.println(healthItemInfo);
        
        WeaponItem knife = new WeaponItem();
        knife.setDamage(30);
        knife.setName("Knife");
        knife.setQuantityInStock(1);
        
        String weaponItemInfo = knife.toString();
        System.out.println(weaponItemInfo);
        
        Pack packOne = new Pack();
        packOne.setNoSlots(5);
        
        String packInfo = packOne.toString();
        System.out.println(packInfo);
        
        Map mapOne = new Map();
        mapOne.setRowCount(5);
        mapOne.setColumnCount(3);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        locationOne.setRow(3);
        locationOne.setColumn(4);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        Scene sceneOne = new Scene();
        sceneOne.setDescription("House");
        sceneOne.setBlockedDirections(4);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        
    }
    
}