/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;
import byui.cit260.hemorrhage.model.Character;
import byui.cit260.hemorrhage.model.Game;
import byui.cit260.hemorrhage.model.Player;
import hemorrhage.Hemorrhage;
import java.awt.Point;
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
        
        
       switch (choice) {
           case "N":
               this.moveNorth();
               break;
           case "S":
               this.moveSouth();
               break;
           case "T":
               this:moveEast();
               break;
           case "W":
               this.moveWest();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
       }
       return false;
    }

    private void moveNorth() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        Point coordinates = mainCharacter.getCoordinates();
        int yCoordinate = coordinates.y;
        yCoordinate += 1;
        mainCharacter.setCoordinates(coordinates.x, yCoordinate);
        Hemorrhage.setMainCharacter(mainCharacter);
        
    }

    private void moveSouth() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        Point coordinates = mainCharacter.getCoordinates();
        int yCoordinate = coordinates.y;
        yCoordinate -= 1;
        mainCharacter.setCoordinates(coordinates.x, yCoordinate);
        Hemorrhage.setMainCharacter(mainCharacter);
    }

    private void moveEast() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        Point coordinates = mainCharacter.getCoordinates();
        int xCoordinate = coordinates.x;
        xCoordinate += 1;
        mainCharacter.setCoordinates(xCoordinate, coordinates.y);
        Hemorrhage.setMainCharacter(mainCharacter);
    }

    private void moveWest() {
        Game game = Hemorrhage.getCurrentGame();
        Player player = game.getPlayer();
        Character mainCharacter = player.getCharacter();
        Point coordinates = mainCharacter.getCoordinates();
        int xCoordinate = coordinates.x;
        xCoordinate -= 1;
        mainCharacter.setCoordinates(xCoordinate, coordinates.y);
        Hemorrhage.setMainCharacter(mainCharacter);
    }
    
    
}
