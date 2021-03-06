/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import byui.cit260.hemorrhage.exceptions.CharacterControlException;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Character;
import hemorrhage.Hemorrhage;

/**
 *
 * @author Braxton
 */
public class CharacterControl {
    public static long getNewHealth(long playerCurrentHealth, long amountOfFood, long healthPoints) throws CharacterControlException {
        
        long playerMaxHealth = 200;
        
       
        if (playerCurrentHealth <= 0 || amountOfFood <= 0) {
            throw new CharacterControlException("Cannot Heal Character because not"
                    + " enough food or Chracter is Dead");
        }
        if (playerCurrentHealth >= playerMaxHealth) {
            throw new CharacterControlException("Characters health is already full");
        }
        
        long newHealth = playerCurrentHealth + (amountOfFood * healthPoints);
        
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        mainCharacter.setHealth(newHealth);
        
        return newHealth;

    }
    
    public static void chooseCharacter(int index) {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character[] characterList = game.getCharacter();
        player.setCharacter(characterList[index]);
    }
    
    
}
