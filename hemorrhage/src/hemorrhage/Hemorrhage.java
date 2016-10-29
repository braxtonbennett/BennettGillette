/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hemorrhage;


import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260hemmorrhage.view.StartProgramView;


/**
 *
 * @author Douglas
 */
public class Hemorrhage {

    private static Game currentGame = null;
    private static Player player = null;
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
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
    
}
