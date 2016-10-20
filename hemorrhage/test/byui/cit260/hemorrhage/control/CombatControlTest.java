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
public class CombatControlTest {
    
    public CombatControlTest() {
    }

    /**
     * Test of calcBattleHealth method, of class CombatControl.
     */
    @Test
    public void testCalcBattleHealth() {
        System.out.println("calcBattleHealth");
        System.out.println("\tTest Case #1");
        long attackDamage = 40;
        long health = 100;
        long weaponDamage = 20;
        long monsterDamage = 30;
        long monsterHealth = 80;
        CombatControl instance = new CombatControl();
        long expResult = 40;
        long result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #2");
        
        attackDamage = -40;
        health = 100;
        weaponDamage = 20;
        monsterDamage = 30;
        monsterHealth = 80;
        expResult = 999;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
         System.out.println("\tTest Case #3");
        
        attackDamage = 40;
        health = -100;
        weaponDamage = 20;
        monsterDamage = 30;
        monsterHealth = 80;
        expResult = 999;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #4");
        
        attackDamage = 40;
        health = 100;
        weaponDamage = -20;
        monsterDamage = 30;
        monsterHealth = 80;
        expResult = 999;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #5");
        
        attackDamage = 40;
        health = 100;
        weaponDamage = 20;
        monsterDamage = -30;
        monsterHealth = 80;
        expResult = 999;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #6");
        
        attackDamage = 40;
        health = 100;
        weaponDamage = 20;
        monsterDamage = 30;
        monsterHealth = -80;
        expResult = 999;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #7");
        
        attackDamage = 1;
        health = 100;
        weaponDamage = 20;
        monsterDamage = 30;
        monsterHealth = 80;
        expResult = -20;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #8");
        
        attackDamage = 40;
        health = 1;
        weaponDamage = 20;
        monsterDamage = 30;
        monsterHealth = 80;
        expResult = -29;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result, 1);
        
        System.out.println("\tTest Case #9");
        
        attackDamage = 40;
        health = 100;
        weaponDamage = 1;
        monsterDamage = 30;
        monsterHealth = 80;
        expResult = 40;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #10");
        
        attackDamage = 40;
        health = 100;
        weaponDamage = 20;
        monsterDamage = 1;
        monsterHealth = 80;
        expResult = 98;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #11");
        
        attackDamage = 40;
        health = 100;
        weaponDamage = 20;
        monsterDamage = 30;
        monsterHealth = 1;
        expResult = 70;
        result = instance.calcBattleHealth(attackDamage, health, weaponDamage, monsterDamage, monsterHealth);
        assertEquals(expResult, result);
        
        
        
        
        
    }
    
    
}
