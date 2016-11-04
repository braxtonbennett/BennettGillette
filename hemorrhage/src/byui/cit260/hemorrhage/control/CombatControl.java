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
public class CombatControl {

    public CombatControl() {
    }
    
    
    public long calcBattleHealth(long attackDamage, long health, long weaponDamage, long monsterDamage, long monsterHealth) {
        if (attackDamage <= 0) {
                return 999;
        }
         if (health <= 0) {
                return 999;
        }
          if (weaponDamage <= 0) {
                return 999;
        }
           if (monsterHealth <= 0) {
                return 999;
        }
            if (monsterDamage <= 0) {
                return 999;
        }
            
            long newHealth = health - monsterDamage;
            long newMonsterHealth = monsterHealth - (weaponDamage + attackDamage);
            
            if (newHealth <= 0 || newMonsterHealth <= 0) {
                return newHealth;
                
            }
       newHealth = calcBattleHealth(attackDamage, newHealth, weaponDamage, monsterDamage, newMonsterHealth);
      return newHealth;
    }
    
}
