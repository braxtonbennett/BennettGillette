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
import byui.cit260.hemorrhage.model.Pack;
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
        
        Pack[] packList = GameControl.createPackList();
        game.setPack(packList);
        
        Character[] characterList = GameControl.createCharacterList();
        game.setCharacter(characterList);
        
        
        MapControl.createLasVegas();
        MapControl.createHouston();
        MapControl.createLA();
        MapControl.createRexburg();
        MapControl.createNewYork();
        MapControl.moveCharactersToStart();
     }

    private static Item[] createItemList() {
        Item[] itemList = 
                new Item[11];
        
        WeaponItem knife = new WeaponItem();
        knife.setDamage(10);
        knife.setDescription("KNIFE");
        knife.setQuantityInStock(0);
        knife.setCoordinates(1,1);
        knife.setMapNo(1);
        itemList[0] = knife;
        
        WeaponItem pistol = new WeaponItem();
        pistol.setDamage(20);
        pistol.setDescription("PISTOL");
        pistol.setQuantityInStock(0);
        pistol.setCoordinates(1,1);
        pistol.setMapNo(2);
        itemList[1] = pistol;
       
        WeaponItem bat = new WeaponItem();
        bat.setDamage(5);
        bat.setDescription("BAT");
        bat.setQuantityInStock(0);
        bat.setCoordinates(1,1);
        bat.setMapNo(3);
        itemList[2] = bat;
       
        WeaponItem shotgun = new WeaponItem();
        shotgun.setDamage(20);
        shotgun.setDescription("SHOTGUN");
        shotgun.setQuantityInStock(0);
        bat.setCoordinates(0,0);
        bat.setMapNo(1);
        itemList[3] = shotgun;
       
        HealthItem chicken = new HealthItem();
        chicken.setDescription("CHICKEN");
        chicken.setHealthPoints(10);
        chicken.setQuantityInStock(0);
        chicken.setCoordinates(0,0);
        chicken.setMapNo(2);
        itemList[4] = chicken;
        
        HealthItem steak = new HealthItem();
        steak.setDescription("STEAK");
        steak.setHealthPoints(25);
        steak.setQuantityInStock(0);
        steak.setCoordinates(0,0);
        steak.setMapNo(3);
        itemList[5] = steak;
        
        HealthItem burger = new HealthItem();
        burger.setDescription("BURGER");
        burger.setHealthPoints(50);
        burger.setQuantityInStock(0);
        burger.setCoordinates(0,1);
        burger.setMapNo(1);
        itemList[6] = burger;
        
        Item calihari = new Item();
        calihari.setDescription("CALIHARI");
        calihari.setQuantityInStock(0);
        calihari.setCoordinates(0,1);
        calihari.setMapNo(2);
        itemList[7] = calihari;
        
        Item brahmi = new Item();
        brahmi.setDescription("BRAHMI");
        brahmi.setQuantityInStock(0);
        brahmi.setCoordinates(0,1);
        brahmi.setMapNo(3);
        itemList[8] = brahmi;
        
        Item henna = new Item();
        henna.setDescription("HENNA");
        henna.setQuantityInStock(0);
        henna.setCoordinates(0,1);
        henna.setMapNo(4);
        itemList[9] = henna;
        
        Item harida = new Item();
        harida.setDescription("HARIDA");
        harida.setQuantityInStock(0);
        harida.setCoordinates(0,1);
        harida.setMapNo(5);
        itemList[10] = brahmi;
        return itemList;
    }

    private static Character[] createCharacterList() {
        Character[] characterList =
                new Character[13];
        
        Character suzie = new Character();
        suzie.setName("SUZIE");
        suzie.setAtkPower(50);
        suzie.setHealth(100);
        suzie.setDescription("She loves killin' zombies.");
        characterList[0] = suzie;
        
        Character carl = new Character();
        carl.setName("CARL");
        carl.setAtkPower(40);
        carl.setHealth(100);
        carl.setDescription("His Pack is Huge.");
        characterList[1] = carl;
        
        Character lumberJack = new Character();
        lumberJack.setName("LUMBERJACK");
        lumberJack.setAtkPower(40);
        lumberJack.setHealth(100);
        lumberJack.setDescription("He can really take a hit");
        characterList[2] = lumberJack;
        
        Character basicBob = new Character();
        basicBob.setName("BOB");
        basicBob.setAtkPower(30);
        basicBob.setHealth(100);
        basicBob.setDescription("He's Bob... nuff said.");
        characterList[3] = basicBob;
        
        Character professor = new Character();
        professor.setName("PROFFESSOR");
        professor.setAtkPower(40);
        professor.setHealth(100);
        professor.setDescription("awesome dude");
        characterList[4] = professor;
       
        Character zombieBossNY = new Character();
        zombieBossNY.setName("Da Boss");
        zombieBossNY.setAtkPower(30);
        zombieBossNY.setHealth(80);
        zombieBossNY.setDescription("He Da Boss of New York");
        characterList[5] = zombieBossNY;
        
        Character zombieBossLA = new Character();
        zombieBossLA.setName("Da Boss");
        zombieBossLA.setAtkPower(30);
        zombieBossLA.setHealth(80);
        zombieBossLA.setDescription("He Da Boss of LA");
        characterList[6] = zombieBossLA;
        
        Character zombieBossH = new Character();
        zombieBossH.setName("Da Boss");
        zombieBossH.setAtkPower(30);
        zombieBossH.setHealth(80);
        zombieBossH.setDescription("He Da Boss of Houston");
        characterList[7] = zombieBossH;
        
        Character zombieBossLV = new Character();
        zombieBossLV.setName("Da Boss");
        zombieBossLV.setAtkPower(30);
        zombieBossLV.setHealth(80);
        zombieBossLV.setDescription("He Da Boss of Vegas");
        characterList[8] = zombieBossLV;
        
        Character zombieNY = new Character();
        zombieNY.setName("Da Boss");
        zombieNY.setAtkPower(30);
        zombieNY.setHealth(80);
        zombieNY.setDescription("Just a Zombie");
        characterList[9] = zombieNY;
        
        Character zombieLA = new Character();
        zombieLA.setName("Da Boss");
        zombieLA.setAtkPower(30);
        zombieLA.setHealth(80);
        zombieLA.setDescription("Just a Zombie");
        characterList[10] = zombieLA;
        
        Character zombieH = new Character();
        zombieH.setName("Da Boss");
        zombieH.setAtkPower(30);
        zombieH.setHealth(80);
        zombieH.setDescription("Just a Zombie");
        characterList[11] = zombieH;
        
        Character zombieLV = new Character();
        zombieLV.setName("Zombie");
        zombieLV.setAtkPower(30);
        zombieLV.setHealth(80);
        zombieLV.setDescription("Just a Zombie");
        characterList[12] = zombieLV;
        
       
        return characterList;
    }

    private static Pack[] createPackList() {
        Pack[] packList = 
                new Pack[4];
        
        Pack packSuzie = new Pack();
        packSuzie.setNoSlots(5);
        
        Pack packCarl = new Pack();
        packCarl.setNoSlots(6);
        
        Pack packJack = new Pack();
        packJack.setNoSlots(7);
        
        Pack packBob = new Pack();
        packBob.setNoSlots(8);
        
        Pack packZombie = new Pack();
        packZombie.setNoSlots(1);
        
        return packList;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
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
        
    
}
