/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.CharacterControl;
import byui.cit260.hemorrhage.control.PackControl;
import java.util.Scanner;

/**
 *
 * @author Braxton
 */
class CreateCureView extends View{
       private String cureMenu;
       public CreateCureView() {
           super("\nPlease enter quantity of Calihari");
}
    
    
    @Override
    public boolean doAction(String choice) {
           
           choice = choice.toUpperCase();
           String brahmiSt = choice;
           long quantityBrahmi = Long.parseLong(brahmiSt);
           
           this.displayMessage ="\nPlease enter quantity of Calihari";
           String calihariSt = this.getInput();
           long quantityCalihari = Long.parseLong(calihariSt);
           
           this.displayMessage ="\nPlease enter quantity of Henna";
           String hennaSt = this.getInput();
           long quantityHenna = Long.parseLong(hennaSt);
           
           this.displayMessage ="\nPlease enter quantity of Harida";
           String haridaSt = this.getInput();
           long quantityHarida = Long.parseLong(haridaSt);
           
          
       long cure = PackControl.makeCure(quantityBrahmi, quantityCalihari, quantityHenna, quantityHarida);
       if (cure == 1){
           return true;
       }
       return false;
    }

    
}
