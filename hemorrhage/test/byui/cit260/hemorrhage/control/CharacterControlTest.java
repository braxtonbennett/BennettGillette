/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Braxton
 */
public class CharacterControlTest {
    
    public CharacterControlTest() {   
}

    /**
     * Test of getNewHealth method, of class CharacterControl.
     */
    @Test
    public void testGetNewHealth() {
        
        System.out.println("testGetNewHealth");
        
        System.out.println("\tTest Case #1");
        long playerCurrentHealth = 15;
        long amountOfFood = 3; 
        long foodPoints = 10;
        CharacterControl instance = new CharacterControl();
        long expResult = 45;
        long result = instance.getNewHealth(playerCurrentHealth, amountOfFood, foodPoints);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #2");
        
        playerCurrentHealth = -15;
        amountOfFood = 3;
        foodPoints = 10;
        expResult = -1;
        result = instance.getNewHealth(playerCurrentHealth, amountOfFood, foodPoints);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #3");
        
        playerCurrentHealth = 15;
        amountOfFood = -3; 
        foodPoints = 10;
        expResult = -1;
        result = instance.getNewHealth(playerCurrentHealth, amountOfFood, foodPoints);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #4");
        
        playerCurrentHealth = 60;
        amountOfFood = 3; 
        foodPoints = 10;
        expResult = -1;
        result = instance.getNewHealth(playerCurrentHealth, amountOfFood, foodPoints);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #5");
        
        playerCurrentHealth = 1;
        amountOfFood = 3; 
        foodPoints = 10;
        expResult = 31;
        result = instance.getNewHealth(playerCurrentHealth, amountOfFood, foodPoints);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #6");
        
        playerCurrentHealth = 15;
        amountOfFood = 1; 
        foodPoints = 10;
        expResult = 25;
        result = instance.getNewHealth(playerCurrentHealth, amountOfFood, foodPoints);
        assertEquals(expResult, result);
    }
    
}
