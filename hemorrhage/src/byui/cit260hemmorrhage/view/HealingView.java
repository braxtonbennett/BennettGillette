/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import java.util.Scanner;

/**
 *
 * @author jnava
 */
public class HealingView {
    
                private String healing;
    
    public HealingView() {
        this.healing = "\n**************************************************"
                + "\nHealing"
                + "\n**************************************************"
                + "\n|C - Chicken(25points)"
                + "\nS - Steak(50points)"
                + "\n|B - Burger(150points)"
                + "\n|E - Exit Help Menu"
                + "\n**************************************************";
    }
     
    
    public void displayHealing() {
        boolean done =  false;
        do {
            String healingMenuOption = this.getHealingMenuOption();
            if (healingMenuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(healingMenuOption);
            
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
    
    private boolean doAction(String choice) {
           choice = choice.toUpperCase();
       
       switch (choice) {
           case "C":
               this.displayChicken();
               break;
           case "S":
               this:displaySteak();
               break;
           case "B":
               this.displayBurger();
               break;
          
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void displayChicken() {
        System.out.println("\nThe chicken was delicious, you are feeling better.");
    }
    
     private void displaySteak() {
        System.out.println("\nYou ate some Steak."
        +"\nYou haven't eaten something so delicious in your life.");
    }
      private void displayBurger() {
        System.out.println("\nYou are contemplating if there was a benifit in your decision in eating an old burger.");
    }


    }
    
}
