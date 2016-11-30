/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import byui.cit260.hemorrhage.model.Location;
import byui.cit260.hemorrhage.model.Map;
import byui.cit260.hemorrhage.model.Scene;


/**
 *
 * @author Douglas
 */
public class MapControl {

    
    public static Location[][] createRexburg() {
        Location[][] locations = Map.rexburg.getLocations();
        assignScenesToRexburg(locations);
        return locations;
        
    }
    
    public static void createNewYork() {
        Location[][] locations = Map.newYork.getLocations();
        assignScenesToNewYork(locations);
        
        
    }
     public static void createLA() {
        Location[][] locations = Map.lA.getLocations();
        assignScenesToLA(locations);
        
        
    }
    
    public static void createLasVegas() {
        Location[][] locations = Map.lasVegas.getLocations();
        assignScenesToLasVegas(locations);    
        
    }
    public static void createHouston() {
        Location[][] locations = Map.houston.getLocations();
        assignScenesToHouston(locations);
        
    }

    private static void assignScenesToRexburg(Location[][] locations) {
        locations[0][0].setScene(Scene.rexburg1);
        locations[0][1].setScene(Scene.rexburg2);
        locations[1][0].setScene(Scene.rexburg3);
        locations[1][1].setScene(Scene.rexburg4);
    }

    private static void assignScenesToNewYork(Location[][] locations) {
        locations[0][0].setScene(Scene.newYork1);
        locations[0][1].setScene(Scene.newYork2);
        locations[1][0].setScene(Scene.newYork3);
        locations[1][1].setScene(Scene.newYork4);
        locations[2][0].setScene(Scene.newYork5);
        locations[2][1].setScene(Scene.newYork6);
    }

    private static void assignScenesToLA(Location[][] locations) {
        locations[0][0].setScene(Scene.lA1);
        locations[0][1].setScene(Scene.lA2);
        locations[1][0].setScene(Scene.lA3);
        locations[1][1].setScene(Scene.lA4);
        locations[2][0].setScene(Scene.lA5);
        locations[2][1].setScene(Scene.lA6);
    }

    private static void assignScenesToLasVegas(Location[][] locations) {
        locations[0][0].setScene(Scene.lasVegas1);
        locations[0][1].setScene(Scene.lasVegas2);
        locations[1][0].setScene(Scene.lasVegas3);
        locations[1][1].setScene(Scene.lasVegas4);
        locations[2][0].setScene(Scene.lasVegas5);
        locations[2][1].setScene(Scene.lasVegas6);
    }

    private static void assignScenesToHouston(Location[][] locations) {
        locations[0][0].setScene(Scene.houston1);
        locations[0][1].setScene(Scene.houston2);
        locations[1][0].setScene(Scene.houston3);
        locations[1][1].setScene(Scene.houston4);
        locations[2][0].setScene(Scene.houston5);
        locations[2][1].setScene(Scene.houston6);
    }
    public static void moveCharactersToStart(){
        System.out.println("moveCharactersToStart() called");
    }

   
    
}
