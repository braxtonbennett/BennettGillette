/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import byui.cit260.hemorrhage.exceptions.CombatControlException;

/**
 *
 * @author Braxton
 */
public class CombatControl {

    public CombatControl() {
    }
    
    
    public long calcBattleHealth(long attackDamage, long health, long weaponDamage, long monsterDamage, long monsterHealth) throws CombatControlException{
        if (attackDamage <= 0) {
                throw new CombatControlException("attack Damage must be higher");
        }
         if (health <= 0) {
                throw new CombatControlException("health must be higher");
        }
          if (weaponDamage <= 0) {
                throw new CombatControlException("Weapon Damage must be higher");
        }
           if (monsterHealth <= 0) {
                throw new CombatControlException("Monster is already dead");
        }
            if (monsterDamage <= 0) {
                throw new CombatControlException("Monster damage is too low");
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
