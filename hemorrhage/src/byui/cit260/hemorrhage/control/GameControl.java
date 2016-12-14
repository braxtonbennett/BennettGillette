/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import byui.cit260.hemorrhage.exceptions.GameControlException;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Item;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.WeaponItem;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Map;
import hemorrhage.Hemorrhage;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Hemorrhage.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        Hemorrhage.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Item[] itemList = GameControl.createItemList();
        game.setItem(itemList);
        
        WeaponItem[] weapons = GameControl.createWeapons();
        game.setWeapons(weapons);
        
        HealthItem[] healthItems = GameControl.createHealthItems();
        game.setHealthItems(healthItems);
        
        //Inventory[] packList = GameControl.createInventoryList();
        //game.setInventory(packList);
        
        Character[] characterList = GameControl.createCharacterList();
        game.setCharacter(characterList);
        
        Character[] zombieList = GameControl.createZombieList();
        game.setZombieList(zombieList);
        
        
        MapControl.createLasVegas();
        MapControl.createHouston();
        MapControl.createLA();
        MapControl.createRexburg();
        MapControl.createNewYork();
        MapControl.moveCharactersToStart();
     }

    private static Item[] createItemList() {
        Item[] itemList = 
                new Item[4];
        
        Item calihari = new Item();
        calihari.setDescription("CALIHARI");
        calihari.setQuantityInStock(0);
        calihari.setX(0);
        calihari.setY(1);
        calihari.setMapNo("newYork");
        calihari.setNoFound(1);
        itemList[0] = calihari;
        
        Item brahmi = new Item();
        brahmi.setDescription("BRAHMI");
        brahmi.setQuantityInStock(0);
        brahmi.setX(0);
        brahmi.setY(1);
        brahmi.setMapNo("lA");
        brahmi.setNoFound(1);
        itemList[1] = brahmi;
        
        Item henna = new Item();
        henna.setDescription("HENNA");
        henna.setQuantityInStock(0);
        henna.setX(0);
        henna.setY(1);
        henna.setMapNo("houston");
        henna.setNoFound(1);
        itemList[2] = henna;
        
        Item harida = new Item();
        harida.setDescription("HARIDA");
        harida.setQuantityInStock(0);
        harida.setX(0);
        harida.setY(1);
        harida.setMapNo("lasVegas");
        itemList[3] = brahmi;
        return itemList;
    }
    private static Character[] createZombieList() {
        Character[] zombieList =
                new Character[8];
        Character zombieBossNY = new Character();
        zombieBossNY.setName("Da Boss");
        zombieBossNY.setAtkPower(30);
        zombieBossNY.setHealth(80);
        zombieBossNY.setDescription("He Da Boss of New York");
        zombieBossNY.setX(2);
        zombieBossNY.setY(1);
        zombieBossNY.setMapNo("newYork");
        zombieList[0] = zombieBossNY;
        
        Character zombieBossLA = new Character();
        zombieBossLA.setName("Da Boss");
        zombieBossLA.setAtkPower(30);
        zombieBossLA.setHealth(80);
        zombieBossLA.setDescription("He Da Boss of LA");
        zombieBossLA.setX(2);
        zombieBossLA.setY(1);
        zombieBossLA.setMapNo("lA");
        zombieList[1] = zombieBossLA;
        
        Character zombieBossH = new Character();
        zombieBossH.setName("Da Boss");
        zombieBossH.setAtkPower(30);
        zombieBossH.setHealth(80);
        zombieBossH.setDescription("He Da Boss of Houston");
        zombieBossH.setX(2);
        zombieBossH.setY(1);
        zombieBossH.setMapNo("houston");
        zombieList[2] = zombieBossH;
        
        Character zombieBossLV = new Character();
        zombieBossLV.setName("Da Boss");
        zombieBossLV.setAtkPower(30);
        zombieBossLV.setHealth(80);
        zombieBossLV.setDescription("He Da Boss of Vegas");
        zombieBossLV.setX(2);
        zombieBossLV.setY(1);
        zombieBossLV.setMapNo("lasVegas");
        zombieList[3] = zombieBossLV;
        
        Character zombieNY = new Character();
        zombieNY.setName("Zombie");
        zombieNY.setAtkPower(30);
        zombieNY.setHealth(80);
        zombieNY.setDescription("Just a Zombie");
        zombieNY.setX(1);
        zombieNY.setY(0);
        zombieNY.setMapNo("newYork");
        zombieList[4] = zombieNY;
        
        Character zombieLA = new Character();
        zombieLA.setName("Zombie");
        zombieLA.setAtkPower(30);
        zombieLA.setHealth(80);
        zombieLA.setDescription("Just a Zombie");
        zombieLA.setX(1);
        zombieLA.setY(0);
        zombieLA.setMapNo("lA");
        zombieList[5] = zombieLA;
        
        Character zombieH = new Character();
        zombieH.setName("Zombie");
        zombieH.setAtkPower(30);
        zombieH.setHealth(80);
        zombieH.setDescription("Just a Zombie");
        zombieH.setX(1);
        zombieH.setY(0);
        zombieH.setMapNo("houston");
        zombieList[6] = zombieH;
        
        Character zombieLV = new Character();
        zombieLV.setName("Zombie");
        zombieLV.setAtkPower(30);
        zombieLV.setHealth(80);
        zombieLV.setDescription("Just a Zombie");
        zombieLV.setX(1);
        zombieLV.setY(0);
        zombieLV.setMapNo("lasVegas");
        zombieList[7] = zombieLV;
        
        return zombieList;
    }
    private static Character[] createCharacterList() {
        
        Character[] characterList =
                new Character[5];
        
        Character suzie = new Character();
        suzie.setName("SUZIE");
        suzie.setAtkPower(50);
        suzie.setHealth(100);
        suzie.setDescription("She loves killin' zombies.");
        suzie.setX(0);
        suzie.setY(0);
        suzie.setMapNo("rexburg");
        characterList[0] = suzie;
        
        Character carl = new Character();
        carl.setName("CARL");
        carl.setAtkPower(40);
        carl.setHealth(100);
        carl.setDescription("His Pack is Huge.");
        carl.setX(0);
        carl.setY(0);
        carl.setMapNo("rexburg");
        characterList[1] = carl;
        
        Character lumberJack = new Character();
        lumberJack.setName("LUMBERJACK");
        lumberJack.setAtkPower(40);
        lumberJack.setHealth(100);
        lumberJack.setDescription("He can really take a hit");
        lumberJack.setX(0);
        lumberJack.setY(0);
        lumberJack.setMapNo("rexburg");
        characterList[2] = lumberJack;
        
        Character basicBob = new Character();
        basicBob.setName("BOB");
        basicBob.setAtkPower(30);
        basicBob.setHealth(100);
        basicBob.setDescription("He's Bob... nuff said.");
        basicBob.setX(0);
        basicBob.setY(0);
        basicBob.setMapNo("rexburg");
        characterList[3] = basicBob;
        
        Character professor = new Character();
        professor.setName("PROFFESSOR");
        professor.setAtkPower(40);
        professor.setHealth(100);
        professor.setDescription("awesome dude");
        professor.setX(0);
        professor.setY(0);
        professor.setMapNo("rexburg");
        characterList[4] = professor;
       
        
       
        return characterList;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(currentGame);
        }catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
        }catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }

    private static WeaponItem[] createWeapons() {
        WeaponItem[] weapons = new WeaponItem[4]; 
        
        WeaponItem knife = new WeaponItem();
        knife.setDamage(10);
        knife.setDescription("KNIFE");
        knife.setQuantityInStock(0);
        knife.setX(0);
        knife.setY(0);
        knife.setMapNo("rexburg");
        knife.setNoFound(1);
        weapons[0] = knife;
        
        WeaponItem pistol = new WeaponItem();
        pistol.setDamage(20);
        pistol.setDescription("PISTOL");
        pistol.setQuantityInStock(0);
        pistol.setX(1);
        pistol.setY(0);
        pistol.setMapNo("lA");
        pistol.setNoFound(1);
        weapons[1] = pistol;
       
        WeaponItem bat = new WeaponItem();
        bat.setDamage(5);
        bat.setDescription("BAT");
        bat.setQuantityInStock(0);
        bat.setX(0);
        bat.setY(1);
        bat.setMapNo("houston");
        bat.setNoFound(1);
        weapons[2] = bat;
       
        WeaponItem shotgun = new WeaponItem();
        shotgun.setDamage(20);
        shotgun.setDescription("SHOTGUN");
        shotgun.setQuantityInStock(0);
        shotgun.setX(1);
        shotgun.setY(0);
        shotgun.setMapNo("newYork");
        shotgun.setNoFound(1);
        weapons[3] = shotgun;
        
        return weapons;
    }

    private static HealthItem[] createHealthItems() {
        
        HealthItem[] healthItems = new HealthItem[3];
        
        HealthItem chicken = new HealthItem();
        chicken.setDescription("CHICKEN");
        chicken.setHealthPoints(10);
        chicken.setQuantityInStock(0);
        chicken.setX(1);
        chicken.setY(0);
        chicken.setMapNo("newYork");
        chicken.setNoFound(3);
        healthItems[0] = chicken;
        
        HealthItem steak = new HealthItem();
        steak.setDescription("STEAK");
        steak.setHealthPoints(25);
        steak.setQuantityInStock(0);
        steak.setX(1);
        steak.setY(0);
        steak.setMapNo("lA");
        steak.setNoFound(5);
        healthItems[1] = steak;
        
        HealthItem burger = new HealthItem();
        burger.setDescription("BURGER");
        burger.setHealthPoints(50);
        burger.setQuantityInStock(0);
        burger.setX(1);
        burger.setY(0);
        burger.setMapNo("lasVegas");
        burger.setNoFound(4);
        healthItems[2] = burger;
        
        return healthItems;
    }
        
    
}
