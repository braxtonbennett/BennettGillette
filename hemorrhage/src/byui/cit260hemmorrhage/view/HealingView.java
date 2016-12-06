/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CharacterControl;
import byui.cit260.hemorrhage.exceptions.CharacterControlException;
import byui.cit260.hemorrhage.model.HealthItem;
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
       long quantity = Long.parseLong(Strquantity);
        
       switch (choice) {
           case "C":
           HealthItem healthChoice = Hemorrhage.getChicken();
           healthPoint = healthChoice.getHealthPoints();
               break;
           case "S":
           healthChoice = Hemorrhage.getSteak();
           healthPoint = healthChoice.getHealthPoints();
               
               break;
           case "B":
           healthChoice = Hemorrhage.getBurger();
           healthPoint = healthChoice.getHealthPoints();
              
               break;
          
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
        try{    
       long newHealth = CharacterControl.getNewHealth(55, quantity, healthPoint);
        }catch (CharacterControlException me) {
            System.out.println(me.getMessage());
        }
       return false;
    }

   
       

}
       
    
   

   
    


    
    

