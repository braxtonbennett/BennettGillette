/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CharacterControl;
import byui.cit260.hemorrhage.model.HealthItem;
import hemorrhage.Hemorrhage;
import java.util.Scanner;

/**
 *
 * @author jnava
 */
public class HealingView {
                private static HealthItem HealthChoice = null;
    
                private String healing;
                private String quanity;
                
    
    public HealingView() {
        this.healing = "\n**************************************************"
                + "\nHealing"
                + "\n**************************************************"
                + "\n|C - Chicken(10points)"
                + "\n|S - Steak(25points)"
                + "\n|B - Burger(50points)"
                + "\n|E - Exit Help Menu"
                + "\n**************************************************";
        this.quanity = "\nPlease enter the number of food";    
                        }
     
    
    public void displayHealing() {
        boolean done =  false;
        do {
            String healingMenuOption = this.getHealingMenuOption();
            if (healingMenuOption.toUpperCase().equals("E"))
                return;
            long quanity = this.getQuanity();
            done = this.doAction(healingMenuOption, quanity);
            
            }
        while (!done);
    }
    
    private String getHealingMenuOption() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.healing);
          
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
private long getQuanity(){
     Scanner keyboard = new Scanner(System.in);
      long value = 0;
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.quanity);
          
          value = keyboard.nextLong();
          
          
         if(value > 5){
             System.out.println("\nValue is too high");
             continue;
             
              
          }
          
          break;
      }
      
      return value;
    
    
}
    
    private boolean doAction(String choice, long quanity) {
           choice = choice.toUpperCase();
           long healthPoint = 0; 
           
       
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
       CharacterControl characterControl = new CharacterControl();
            long newHealth = characterControl.getNewHealth(55, quanity, healthPoint);
       return false;
    }

   
       

}
       
    
   

   
    


    
    

