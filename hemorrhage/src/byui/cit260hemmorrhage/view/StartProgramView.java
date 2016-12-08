/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.GameControl;
import byui.cit260.hemorrhage.model.Player;


/**
 *
 * @author Douglas
 */
public class StartProgramView extends View{
    
    
    
    public StartProgramView() {
        
         super("\nPlease enter your name");
        
        this.displayBanner();
    }
    
    private void displayBanner() {
       
        this.console.println(
                "\n**********************************************************"
                        + "\n"
                        + "\n This game is Hemmorrhage!"
                        + "\nIn this game you live in a postapocalyptic world "
                        + "\nthat is now inhabited with ZOMBIES!!! OOHHHH SCARY!"
                        + "\nGood luck you're gonna need it!"
                        + "\n"
                        + "\n**********************************************************");

    }
   

    private void displayNextView(Player player) {
        this.console.println("\n======================================="
                + "\nWelcome to the Game " + player.getName()
                + "\nHave fun Killing Zombies"
                + "\n=======================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }

    @Override
    public boolean doAction(String value) {
        if (value.length() < 2) {
            this.console.println("\nInvalid players name:"
                    + "\nThe name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(value);
        
        if (player==null) {
            this.console.println("\nError Creating Player.");
        }
       this.displayNextView(player);
       return true;
       
    }

}
