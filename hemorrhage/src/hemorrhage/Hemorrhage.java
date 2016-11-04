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
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
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
