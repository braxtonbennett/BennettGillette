/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CombatControl;
import java.util.Scanner;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.WeaponItem;
import hemorrhage.Hemorrhage;

/**
 *
 * @author Douglas
 */
public class BattleView {

    public long newHealth = 0;
    private static WeaponItem weaponchoice = null;
    
    public BattleView() {
        
    }
    void displayBattleView(Character mainCharacter,Character zombieBoss) {
         Boolean done = false;
       do {
           
           String weaponChoice = this.getWeaponChoice();
           if (weaponChoice.toUpperCase().equals("RUN"))
               return;
           
           done = this.doAction(weaponChoice, mainCharacter, zombieBoss);
           
       } while(!done);
    }
    
    private String getWeaponChoice() {
        Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\nYou are about to attack a zombie."
                  + "\nWhich weapon from your pack would you like to use?"
                  + "\nIf you don't want to attack enter RUN.");
          
          value = keyboard.nextLine();
          value = value.trim();
          
          if (value.length() < 1) {
              System.out.println("\nInvalid value: value cannot be blank");
              continue;
              
          }
          
          break;
      }
      
      return value;
    }

    
    public boolean doAction(String choice, Character mainCharacter, Character zombieBoss) {
        
        choice = choice.toUpperCase();
        long weaponDmg = 0;
        
        
       switch (choice) {
           case "KNIFE":
                 WeaponItem weaponChoice = Hemorrhage.getKnife();
                 weaponDmg = weaponChoice.getDamage();
               break;
           case "BAT":
               weaponChoice = Hemorrhage.getBat();
               weaponDmg = weaponChoice.getDamage();
               break;
           case "PISTOL":
               weaponChoice = Hemorrhage.getPistol();
               weaponDmg = weaponChoice.getDamage();
               break;
           case "SHOTGUN":
               weaponChoice = Hemorrhage.getShotgun();
               weaponDmg = weaponChoice.getDamage();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       
        
        long atkDmg = mainCharacter.getAtkPower();
        long health = mainCharacter.getHealth();
        long monsterAtk = zombieBoss.getAtkPower();
        long monsterHealth = zombieBoss.getHealth();
        
        
        CombatControl combatControl = new CombatControl();
        newHealth = combatControl.calcBattleHealth(atkDmg, health, monsterAtk, monsterHealth, weaponDmg);
        
        if (newHealth > 0) {
            System.out.println("You have defeated "+ zombieBoss.getName()+"!");
            return true;
        }
        else {
            System.out.println("You Died! :(");
            return true;
        }
    }
    
    
    
    
}
