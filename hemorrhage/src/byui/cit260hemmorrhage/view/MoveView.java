/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;
import byui.cit260.hemorrhage.model.Character;
import hemorrhage.Hemorrhage;
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
        Character mainCharacter = Hemorrhage.getMainCharacter();
        long yCoordinate = mainCharacter.getMapCoordinateY();
        yCoordinate += 1;
        mainCharacter.setMapCoordinateY(yCoordinate);
        Hemorrhage.setMainCharacter(mainCharacter);
        
    }

    private void moveSouth() {
        Character mainCharacter = Hemorrhage.getMainCharacter();
        long yCoordinate = mainCharacter.getMapCoordinateY();
        yCoordinate -= 1;
        mainCharacter.setMapCoordinateY(yCoordinate);
        Hemorrhage.setMainCharacter(mainCharacter);
    }

    private void moveEast() {
        Character mainCharacter = Hemorrhage.getMainCharacter();
        long xCoordinate = mainCharacter.getMapCoordinateX();
        xCoordinate += 1;
        mainCharacter.setMapCoordinateX(xCoordinate);
        Hemorrhage.setMainCharacter(mainCharacter);
    }

    private void moveWest() {
        Character mainCharacter = Hemorrhage.getMainCharacter();
        long xCoordinate = mainCharacter.getMapCoordinateX();
        xCoordinate -= 1;
        mainCharacter.setMapCoordinateX(xCoordinate);
        Hemorrhage.setMainCharacter(mainCharacter);
    }
    
    
}
