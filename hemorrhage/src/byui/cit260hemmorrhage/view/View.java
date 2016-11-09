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
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
        public View(){
            
        }
        public View(String message){
            this.displayMessage = message;
            
        }

    @Override
    public String getInput(){
     Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          System.out.println("\n" + this.displayMessage);
          
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
      
      

    @Override
    public void display(){
    Boolean done = false;
       do {
           
           String menuOption = this.getInput();
           if (menuOption.toUpperCase().equals("E"))
               return;
           
           done = this.doAction(menuOption);
           
       } while(!done);
}
}
