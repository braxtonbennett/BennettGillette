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
            + "\nthree others occupied by unconsious bodies. R1",1,"R1"),
    rexburg2("You are in the Lab of Professor Jackson. There are bottles"
            + "\n filled with Chemicals all over. R2",2,"R2"),
    rexburg3("You are in the Armory. the walls and shelves are mostly bare. R3",5,"R3"),
    rexburg4("You are in the Garage. There is a taxi in one corner. R4",6,"R4"),
    newYork1("You are on a random street in New York. NY 1",1,"N1"),
    newYork2("You are on a random street in New York. NY 2",2,"N2"),
    newYork3("You are on a random street in New York. NY 3",3,"N3"),
    newYork4("You are on a random street in New York. NY 4",4,"N4"),
    newYork5("You are on a random street in New York. NY 5",5,"N5"),
    newYork6("You are on a random street in New York. NY 6",6,"N6"),
    lA1("You are on a random street in LA. LA 1",1,"A1"),
    lA2("You are on a random street in LA. LA 2",2,"A2"),
    lA3("You are on a random street in LA. LA 3",3,"A3"),
    lA4("You are on a random street in LA. LA 4",4,"A4"),
    lA5("You are on a random street in LA. LA 5",5,"A5"),
    lA6("You are on a random street in LA. LA 6",6,"A6"),
    lasVegas1("You are in the Front room of a Las Vegas Casino. LV 1",1,"V1"),
    lasVegas2("You are in a room in a casino. LV 2",2,"V2"),
    lasVegas3("You are in a room in a casino. LV 3",3,"V3"),
    lasVegas4("You are in a room in a casino. LV 4",4,"V4"),
    lasVegas5("You are in a room in a casino. LV 5",5,"V5"),
    lasVegas6("You are in a room in a casino. LV 6",6,"V6"),
    houston1("You are on a random street in Houston. H 1",1,"H1"),
    houston2("You are on a random street in Houston. H 2",2,"H2"),
    houston3("You are on a random street in Houston. H 3",3,"H3"),
    houston4("You are on a random street in Houston. H 4",4,"H4"),
    houston5("You are on a random street in Houston. H 5",5,"H5"),
    houston6("You are on a random street in Houston. H 6",6,"H6");
    
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
