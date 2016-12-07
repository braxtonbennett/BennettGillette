/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hemorrhage;


import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260hemmorrhage.view.StartProgramView;
import byui.cit260.hemorrhage.model.WeaponItem;
import byui.cit260.hemorrhage.model.Character;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Douglas
 */
public class Hemorrhage {

    private static Game currentGame = null;
    private static Player player = null;
    
   private static PrintWriter outFile = null;
   private static BufferedReader inFile = null;
    
    private static HealthItem chicken = new HealthItem();
    private static HealthItem steak = new HealthItem();
    private static HealthItem burger = new HealthItem();
       
    private static WeaponItem knife = new WeaponItem();
    private static WeaponItem pistol = new WeaponItem();
    private static WeaponItem bat = new WeaponItem();
    private static WeaponItem shotgun = new WeaponItem();
    private static Character mainCharacter = new Character();
    private static Character zombieBoss = new Character();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       knife.setDamage(10);
       knife.setDescription("KNIFE");
       knife.setQuantityInStock(1);
       
       pistol.setDamage(20);
       pistol.setDescription("PISTOL");
       pistol.setQuantityInStock(1);
       
       bat.setDamage(5);
       bat.setDescription("BAT");
       bat.setQuantityInStock(1);
       
       shotgun.setDamage(20);
       shotgun.setDescription("SHOTGUN");
       shotgun.setQuantityInStock(1);
       
        chicken.setHealthPoints(10);
            chicken.setQuantityInStock(5);
            
         steak.setHealthPoints(25);
            steak.setQuantityInStock(5);
            
          burger.setHealthPoints(50);
            burger.setQuantityInStock(5);
            
       mainCharacter.setName("Chuck");
       mainCharacter.setAtkPower(40);
       mainCharacter.setHealth(100);
       mainCharacter.setDescription("awesome dude");
       
       zombieBoss.setName("Da Boss");
       zombieBoss.setAtkPower(30);
       zombieBoss.setHealth(80);
       zombieBoss.setDescription("He Da Boss");
            
       StartProgramView startProgramView = new StartProgramView();
       try {
           Hemorrhage.inFile = new BufferedReader(new InputStreamReader(System.in));
          // Hemorrhage.outFile = new PrinterWriter(System.out, true);
           
           startProgramView.display();
       } catch (Throwable te) { 
           System.out.println(te.getMessage());
           te.printStackTrace();
           startProgramView.display();
       }
       
       
       
       
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hemorrhage.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Hemorrhage.player = player;
    }

    public static WeaponItem getKnife() {
        return knife;
    }

    public static void setKnife(WeaponItem knife) {
        Hemorrhage.knife = knife;
    }

    public static WeaponItem getPistol() {
        return pistol;
    }

    public static void setPistol(WeaponItem pistol) {
        Hemorrhage.pistol = pistol;
    }

    public static WeaponItem getBat() {
        return bat;
    }

    public static void setBat(WeaponItem bat) {
        Hemorrhage.bat = bat;
    }

    public static WeaponItem getShotgun() {
        return shotgun;
    }

    public static void setShotgun(WeaponItem shotgun) {
        Hemorrhage.shotgun = shotgun;
    }
    
    public static HealthItem getChicken() {
        return chicken;
    }

    public static void setChicken(HealthItem chicken) {
        Hemorrhage.chicken = chicken;
    }

    public static HealthItem getSteak() {
        return steak;
    }

    public static void setSteak(HealthItem steak) {
        Hemorrhage.steak = steak;
    }

    public static HealthItem getBurger() {
        return burger;
    }

    public static void setBurger(HealthItem burger) {
        Hemorrhage.burger = burger;
    }

    public static Character getMainCharacter() {
        return mainCharacter;
    }

    public static void setMainCharacter(Character mainCharacter) {
        Hemorrhage.mainCharacter = mainCharacter;
    }

    public static Character getZombieBoss() {
        return zombieBoss;
    }

    public static void setZombieBoss(Character zombieBoss) {
        Hemorrhage.zombieBoss = zombieBoss;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hemorrhage.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Hemorrhage.inFile = inFile;
    }
    
}
