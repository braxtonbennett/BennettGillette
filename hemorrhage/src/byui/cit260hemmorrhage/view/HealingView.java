/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CharacterControl;
import byui.cit260.hemorrhage.exceptions.CharacterControlException;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.HealthItem;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.WeaponItem;
import byui.cit260.hemorrhage.model.Character;
import hemorrhage.Hemorrhage;
import java.util.Scanner;

/**
 *
 * @author jnava
 */
public class HealingView extends View{
                private static HealthItem HealthChoice = null;
    
                private String healing;
                
    
    public HealingView() {
        super("\n**************************************************"
                + "\nHealing"
                + "\n**************************************************"
                + "\n|C - Chicken(10points)"
                + "\n|S - Steak(25points)"
                + "\n|B - Burger(50points)"
                + "\n|E - Exit Help Menu"
                + "\n**************************************************");
           
                        }
     
    @Override
    public boolean doAction(String choice) {
        
        
           choice = choice.toUpperCase();
           long healthPoint = 0;
           
        // set displayMessage to next prompt message
         this.displayMessage = "\nPlease enter the number of food";
        // call getInput() to get the second value
       String Strquantity = this.getInput();
       long quantity = 0;
       
        
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        HealthItem[] healthItems = game.getHealthItems();
        
       try {
       quantity = Long.parseLong(Strquantity);
       } catch(Throwable NumberFormatException){
           this.console.println("You must enter a number and nothing else");
       }
       switch (choice) {
           case "C":
           HealthItem healthChoice = healthItems[0];
           healthPoint = healthChoice.getHealthPoints();
               break;
           case "S":
           healthChoice = healthItems[1];
           healthPoint = healthChoice.getHealthPoints();
               
               break;
           case "B":
           healthChoice = healthItems[2];
           healthPoint = healthChoice.getHealthPoints();
              
               break;
          
           default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
        try{    
       long newHealth = CharacterControl.getNewHealth(55, quantity, healthPoint);
       this.console.println("Your Health is now " + newHealth);
        }catch (CharacterControlException me) {
            ErrorView.display(this.getClass().getName() ,me.getMessage());
        }
       return false;
    }

   
       

}
       
    
   

   
    


    
    

