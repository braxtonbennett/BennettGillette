/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import java.util.Scanner;

/**
 *
 * @author Braxton
 */
class CreateCureView {
       private String cureMenu;
       public CreateCureView() {
           this.cureMenu = "/n***********************************"
                   + "\nCreate the Cure:"
                   + "\n******************************************"
                   + "\nWhat ingredient goes first?"
                   + "\n[B] Brahmi"
                   + "\n[C] Calihari"
                   + "\n[He] Henna"
                   + "\n[Ha] Harida";
}
    public void displayCreateCureMenu() {
        boolean done =  false;
        do {
            String createCureOption = this.getCreateCureOption();
            if (createCureOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(createCureOption);
            
            }
        while (!done);
    }
    
    private String getCreateCureOption() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.cureMenu);
          
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
           String ingredient1 = determineIngredient(choice);
           
           System.out.println("\nPlease enter ingredient 2");
           choice = this.getCreateCureOption();
           String ingredient2 = determineIngredient(choice);
           
           System.out.println("\nPlease enter ingredient 3");
           choice = this.getCreateCureOption();
           String ingredient3 = determineIngredient(choice);
           
           System.out.println("\nPlease enter ingredient 4");
           choice = this.getCreateCureOption();
           String ingredient4 = determineIngredient(choice);
           
           call getinput to get the next choice
           determine 2nd ingredient and save as ingredient 2
           
           call a control funtion to determine if it's the correct set of ingredients
           if it is then print congratulations!
           else It'll say try again
                   else values are invalid then message that inputs were invalid'
       
       
       return false;
    }

    private void displayBrahni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayCalihari() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHenna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHarida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String determineIngredient(String choice) {
        String ingredient = null;
        switch (choice) {
           case "B":
               ingredient = "Brahmi";
               break;
           case "C":
                ingredient = "Calihari";
               break;
               case "He":
                ingredient = "Henna";
               break;
               case "Ha":
                ingredient = "Harida";
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
               
       }
        return ingredient;
    }
    
}
