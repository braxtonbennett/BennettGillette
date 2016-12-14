/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;
import byui.cit260.hemorrhage.control.MapControl;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Player;
import byui.cit260.hemorrhage.model.Scene;
import hemorrhage.Hemorrhage;
import java.awt.Point;
import java.util.ArrayList;
/**
 *
 * @author Douglas
 */
public class MoveView extends View{

    public MoveView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Move"
                + "\n----------------------------------------------------------"
                + "\nN - North"
                + "\nS - South"
                + "\nT - East"
                + "\nW - West"
                + "\nE - Exit"
                + "\n----------------------------------------------------------");
    }
     
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        Game game = Hemorrhage.getCurrentGame();
               Player player = game.getPlayer();
               Character mainCharacter = player.getCharacter();
               String mapName = mainCharacter.getMapNo();
               int y = mainCharacter.getY();
               int x = mainCharacter.getX();
        
               Location[][] map = MapControl.getMap(mapName);
               Location location = map[x][y];
               Scene scene = location.getScene();
        
       switch (choice) {
           case "N":
               
               if( scene.getBlockedDirections() == 1 || scene.getBlockedDirections() == 2){
                   this.console.println("\n You cannot go that way"); 
                   return false;
               }
               
               this.moveNorth();
               
               break;
           case "S":
               if( scene.getBlockedDirections() == 5 || scene.getBlockedDirections() == 6){
                   this.console.println("\n You cannot go that way"); 
                   return false;
               }
               this.moveSouth();
               break;
           case "T":
               if( scene.getBlockedDirections() == 2 || scene.getBlockedDirections() == 4|| scene.getBlockedDirections() == 6){
                   this.console.println("\n You cannot go that way"); 
                   return false;
               }
               this:moveEast();
               break;
           case "W":
               if( scene.getBlockedDirections() == 1 || scene.getBlockedDirections() == 3|| scene.getBlockedDirections() == 5){
                   this.console.println("\n You cannot go that way"); 
                   return false;
               }
               this.moveWest();
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return true;
    }

    private void moveNorth() {
        
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        String mapName = mainCharacter.getMapNo();
        int y = mainCharacter.getY();
        int x = mainCharacter.getX();
        
        x -= 1;
        mainCharacter.setX(x);
        
        Location[][] map = MapControl.getMap(mapName);
        Location location = map[x][y];
        Scene scene = location.getScene();
        
        
       
        this.console.println(scene.getDescription());
        ArrayList<Character> characters = MapControl.charactersAtLocation(mainCharacter.getX(), mainCharacter.getY(), mainCharacter.getMapNo());
        
        if (characters.isEmpty()){
            this.console.println("\nThere are no other Characters here");
            
        } else{
        
            for(Character character: characters)
        this.console.println("\n"+character.getName()+" is at this location");
        }
        
        
    }

    private void moveSouth() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        String mapName = mainCharacter.getMapNo();
        int y = mainCharacter.getY();
        int x = mainCharacter.getX();
        x += 1;
        mainCharacter.setX(x);
        
        Location[][] map = MapControl.getMap(mapName);
        Location location = map[x][y];
        Scene scene = location.getScene();
        
        this.console.println(scene.getDescription());
        ArrayList<Character> characters = MapControl.charactersAtLocation(mainCharacter.getX(), mainCharacter.getY(), mainCharacter.getMapNo());
        
        if (characters.isEmpty()){
            this.console.println("\nThere are no other Characters here");
            
        } else{
        
            for(Character character: characters)
        this.console.println("\n"+character.getName()+" is at this location");
        }
    }

    private void moveEast() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        String mapName = mainCharacter.getMapNo();
        int x = mainCharacter.getX();
        int y = mainCharacter.getY();
        y += 1;
        mainCharacter.setY(y);
        
        Location[][] map = MapControl.getMap(mapName);
        Location location = map[x][y];
        Scene scene = location.getScene();
        this.console.println(scene.getDescription());
        ArrayList<Character> characters = MapControl.charactersAtLocation(mainCharacter.getX(), mainCharacter.getY(), mainCharacter.getMapNo());
        
        if (characters.isEmpty()){
            this.console.println("\nThere are no other Characters here");
            
        } else{
        
            for(Character character: characters)
        this.console.println("\n"+character.getName()+" is at this location");
        }
    }

    private void moveWest() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        String mapName = mainCharacter.getMapNo();
        int x = mainCharacter.getX();
        int y = mainCharacter.getY();
        y -= 1;
        mainCharacter.setY(y);
        
        Location[][] map = MapControl.getMap(mapName);
        Location location = map[x][y];
        Scene scene = location.getScene();
        
        this.console.println(scene.getDescription());
        
        ArrayList<Character> characters = MapControl.charactersAtLocation(mainCharacter.getX(), mainCharacter.getY(), mainCharacter.getMapNo());
        
        if (characters.isEmpty()){
            this.console.println("\nThere are no other Characters here");
            
        } else{
        
            for(Character character: characters)
        this.console.println("\n"+character.getName()+" is at this location");
        }
        
    }
    
    
}
