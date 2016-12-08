/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import hemorrhage.Hemorrhage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jnava
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = Hemorrhage.getInFile();
    protected final PrintWriter console = Hemorrhage.getOutFile();
    
        public View(){
            
        }
        public View(String message){
            this.displayMessage = message;
            
        }

    @Override
    public String getInput(){
      String value = "";
      boolean valid = false;
      
      while (!valid) {
          this.console.println("\n" + this.displayMessage);
          
          try {
              value = this.keyboard.readLine();
          } catch (IOException ex) {
              this.console.println("Error reading input: "+ ex.getMessage());
          }
          value = value.trim();
          
          if (value.length() < 1) {
              this.console.println("\nInvalid value: value cannot be blank");
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
