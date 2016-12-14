/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CombatControl;
import byui.cit260.hemorrhage.control.MapControl;
import byui.cit260.hemorrhage.exceptions.CombatControlException;
import java.util.Scanner;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Item;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.WeaponItem;
import hemorrhage.Hemorrhage;
import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class BattleView extends View{

    public long newHealth = 0;
    private String prompt;
    
    public BattleView() {
        super("\nYou are about to attack a zombie."
                  + "\nWhich weapon from your pack would you like to use?"
                  + "\nIf you want to fight bare handed enter NONE."
                  + "\nIf you don't want to attack enter E.");
        
    }
   
    
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        long weaponDmg = 0;
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        ArrayList<Character> character = MapControl.charactersAtLocation(mainCharacter.getX(), mainCharacter.getY(), mainCharacter.getMapNo());
        Character zombieBoss = character.get(0);
        WeaponItem[] weapons = game.getWeapons();
        
        
       switch(choice) {
               case "KNIFE":
                 WeaponItem weaponChoice = weapons[0];
                 weaponDmg = weaponChoice.getDamage();
                 break;
               case "BAT":
               weaponChoice = weapons[2];
               weaponDmg = weaponChoice.getDamage();
               break;
               case "PISTOL":
               weaponChoice = weapons[1];
               weaponDmg = weaponChoice.getDamage();
               break;
               case "SHOTGUN":
               weaponChoice = weapons[3];
               weaponDmg = weaponChoice.getDamage();
               break;
               case "NONE":
               weaponDmg = 0;
               break;
               default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       
        
        long atkDmg = mainCharacter.getAtkPower();
        long health = mainCharacter.getHealth();
        long monsterAtk = zombieBoss.getAtkPower();
        long monsterHealth = zombieBoss.getHealth();
        
        
        CombatControl combatControl = new CombatControl();
        try {
        newHealth = combatControl.calcBattleHealth(atkDmg, health, monsterAtk, monsterHealth, weaponDmg);
        } catch (CombatControlException me) {
            ErrorView.display(this.getClass().getName() ,me.getMessage());
        }
        
        if (newHealth > 0) {
            this.console.println("You have defeated "+ zombieBoss.getName()+"!");
            return true;
        }
        else {
            this.console.println("You Died! :(");
            return true;
        }
    }
    
    
    
    
}
