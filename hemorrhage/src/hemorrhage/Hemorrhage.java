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

/**
 *
 * @author Douglas
 */
public class Hemorrhage {

    private static Game currentGame = null;
    private static Player player = null;
    private static HealthItem chicken = new HealthItem();
    private static HealthItem steak = new HealthItem();
    private static HealthItem burger = new HealthItem();
       
    private static WeaponItem knife = new WeaponItem();
    private static WeaponItem pistol = new WeaponItem();
    private static WeaponItem bat = new WeaponItem();
    private static WeaponItem shotgun = new WeaponItem();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       knife.setDamage(10);
       knife.setName("KNIFE");
       knife.setQuantityInStock(1);
       
       pistol.setDamage(20);
       pistol.setName("PISTOL");
       pistol.setQuantityInStock(1);
       
       bat.setDamage(5);
       bat.setName("BAT");
       bat.setQuantityInStock(1);
       
       shotgun.setDamage(20);
       shotgun.setName("SHOTGUN");
       shotgun.setQuantityInStock(1);
       
        chicken.setHealthPoints(10);
            chicken.setQuantityInStock(5);
            
         steak.setHealthPoints(25);
            steak.setQuantityInStock(5);
            
          burger.setHealthPoints(50);
            burger.setQuantityInStock(5);
            
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
       
       
       
       
       
       
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
    
}
