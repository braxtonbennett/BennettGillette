/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

import java.util.Objects;

/**
 *
 * @author Braxton
 */
public enum Scene {
    
    rexburg1("You are in a room with four beds.The one you woke up on and"
            + "\nthree others occupied by unconsious bodies.",1,"R1"),
    rexburg2("You are in the Lab of Professor Jackson. There are bottles"
            + "\n filled with Chemicals all over.",2,"R2"),
    rexburg3("You are in the Armory. the walls and shelves are mostly bare.",3,"R3"),
    rexburg4("You are in the Garage. There is a taxi in one corner.",4,"R4"),
    newYork1("'You are on a random street in New York",1,"N1"),
    newYork2("",2,"N2"),
    newYork3("",3,"N3"),
    newYork4("",4,"N4"),
    newYork5("",5,"N5"),
    newYork6("",6,"N6"),
    lA1("",1,"A1"),
    lA2("",2,"A2"),
    lA3("",3,"A3"),
    lA4("",4,"A4"),
    lA5("",5,"A5"),
    lA6("",6,"A6"),
    lasVegas1("You are in the Front room of a Las Vegas Casino",1,"V1"),
    lasVegas2("",2,"V2"),
    lasVegas3("",3,"V3"),
    lasVegas4("",4,"V4"),
    lasVegas5("",5,"V5"),
    lasVegas6("",6,"V6"),
    houston1("",1,"H1"),
    houston2("",2,"H2"),
    houston3("",3,"H3"),
    houston4("",4,"H4"),
    houston5("",5,"H5"),
    houston6("",6,"H6");
    
    private final String description;
    private final long blockedDirections;
    private final String mapSymbol;

    Scene(String description, long blockedDirections, String mapSymbol) {
        this.description = description;
        this.blockedDirections = blockedDirections;
        this.mapSymbol = mapSymbol;
    }

    public String getDescription() {
        return description;
    }

   
    public long getBlockedDirections() {
        return blockedDirections;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    
    
    
}
