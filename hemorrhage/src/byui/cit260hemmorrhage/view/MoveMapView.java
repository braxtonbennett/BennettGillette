/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import byui.cit260.hemorrhage.control.MapControl;
import byui.cit260.hemorrhage.model.Game;
import hemorrhage.Hemorrhage;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Scene;
import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class MoveMapView extends View{

    public MoveMapView() {
        super("\n-----------------------------------------------------"
                + "\n            Choose where you would like to move"
                + "\n-----------------------------------------------------"
                + "\n R - Rexburg"
                + "\n L - LA"
                + "\n V - Las Vegas"
                + "\n H - Houston"
                + "\n N - New York"
                + "\n E - Exit"
                + "\n-----------------------------------------------------");
   }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
       
       switch (choice) {
           case "R":
               this.MoveMap("rexburg");
               break;
           case "L":
               this.MoveMap("lA");
               break;
           case "V":
               this:MoveMap("lasVegas");
               break;
           case "H":
               this.MoveMap("houston");
               break;
           case "N":
               this.MoveMap("newYork");
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
        return true;
    }  

    private void MoveMap(String mapName) {
        
        Scene scene = MapControl.moveMap(mapName);
        
        this.console.println("\nYou have moved to " + mapName);
        
        this.console.println(scene.getDescription());
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        ArrayList<Character> characters = MapControl.charactersAtLocation(mainCharacter.getX(), mainCharacter.getY(), mainCharacter.getMapNo());
        
        if (characters.isEmpty()){
            this.console.println("\nThere are no other Characters here");
            
        } else{
        
            for(Character character: characters)
        this.console.println("\n"+character.getName()+" is at this location");
        }
        
        
    }
}
