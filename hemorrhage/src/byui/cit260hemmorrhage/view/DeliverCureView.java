package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.model.Pack;
import hemorrhage.Hemorrhage;
import java.util.Scanner;




/**
 *
 * @author jnava
 */
public class DeliverCureView extends View{
     
        private String deliverCure;

        public DeliverCureView(){
    super("\n"
    +"\n***************************** "
    +"\n| You are now in the bunker | " 
    +"\n"
    +"\nWhat do you wish to do? "
    +"\nT - Turn in Cure Item "
    +"\nL - Leave Bunker"
    +"\n***************************** ");
}
@Override
    public boolean doAction(String choice) {
           choice = choice.toUpperCase();

         this.displayMessage = "\nPlease deliver the cure";   
       switch (choice) {
           case "T":
            this.displayTurnIn();
               break;
           
               
           case "L":
           this.displayLeave();
               break;
               
               
          
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
}
    

            private void displayTurnIn() {
        System.out.println("\nYou have turned it in successfully.");           
    }
     
            private void displayLeave() {
        System.out.println("\nYou walk outside the big bunker door.");
    }

}