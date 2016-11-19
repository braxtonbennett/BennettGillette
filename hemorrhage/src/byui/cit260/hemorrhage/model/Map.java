/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

/**
 *
 * @author Braxton
 */
public enum Map {
    
    rexburg(2,2),
    newYork(3,2),
    lA(3,2),
    lasVegas(3,2),
    houston(3,2);
    
    private final int rowCount;
    private final int columnCount;
    private final Location[][] locations;

    Map(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++ ) {
            for (int column = 0; column < columnCount; column++ ) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                locations[row][column] = location;
                
                
                
            }
        }
        
    }

    public int getRowCount() {
        return this.rowCount;
    }


    public int getColumnCount() {
        return this.columnCount;
    }

    public Location[][] getLocations() {
        return locations;
    }
 
    
    
}
