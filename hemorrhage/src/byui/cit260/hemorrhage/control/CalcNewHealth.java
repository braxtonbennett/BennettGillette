/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

/**
 *
 * @author Braxton
 */
public class CalcNewHealth {
    public long getNewHealth(long playerCurrentHealth, long amountOfFood) {
        
        long playerMaxHealth = 100;
        long foodPoints = 10;
        if (playerCurrentHealth <= 0 || amountOfFood <= 0) {
            return -1;
        }
        if (playerCurrentHealth > playerMaxHealth) {
            return -1;
        }
        
        long newHealth = playerCurrentHealth + (amountOfFood * foodPoints);
        return newHealth;


    }
    
    newHealth = getNewHealth (playerCurrentHealth,amountOfFood);
    return newHealth; 
}
