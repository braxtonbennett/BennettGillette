/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Character;
import hemorrhage.Hemorrhage;

/**
 *
 * @author Braxton
 */
public class CharacterControl {
    public static long getNewHealth(long playerCurrentHealth, long amountOfFood, long healthPoints) {
        
        long playerMaxHealth = 50;
        
       
        if (playerCurrentHealth <= 0 || amountOfFood <= 0) {
            return -1;
        }
        if (playerCurrentHealth > playerMaxHealth) {
            return -1;
        }
        
        long newHealth = playerCurrentHealth + (amountOfFood * healthPoints);
        return newHealth;

    }
    
    public static void chooseCharacter(int index) {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        player.setCharacter(characterList[index]);
    }
    
    
}
