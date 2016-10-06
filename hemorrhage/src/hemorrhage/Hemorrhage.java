/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hemorrhage;

import byui.cit260.hemorrhage.model.Player;

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
    }
    
}
