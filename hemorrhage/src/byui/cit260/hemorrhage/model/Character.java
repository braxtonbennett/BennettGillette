/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Douglas
 */
public class Character implements Serializable{
    
     private String name;
     private String description;
     private long mapCoordinateX;
     private long mapCoordinateY;
     private long atkPower;
     private long health;
     private long defPower;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMapCoordinateX() {
        return mapCoordinateX;
    }

    public void setMapCoordinateX(long mapCoordinateX) {
        this.mapCoordinateX = mapCoordinateX;
    }

    public long getMapCoordinateY() {
        return mapCoordinateY;
    }

    public void setMapCoordinateY(long mapCoordinateY) {
        this.mapCoordinateY = mapCoordinateY;
    }

    public long getAtkPower() {
        return atkPower;
    }

    public void setAtkPower(long atkPower) {
        this.atkPower = atkPower;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public long getDefPower() {
        return defPower;
    }

    public void setDefPower(long defPower) {
        this.defPower = defPower;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", mapCoordinateX=" + mapCoordinateX + ", mapCoordinateY=" + mapCoordinateY + ", atkPower=" + atkPower + ", health=" + health + ", defPower=" + defPower + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + (int) (this.mapCoordinateX ^ (this.mapCoordinateX >>> 32));
        hash = 41 * hash + (int) (this.mapCoordinateY ^ (this.mapCoordinateY >>> 32));
        hash = 41 * hash + (int) (this.atkPower ^ (this.atkPower >>> 32));
        hash = 41 * hash + (int) (this.health ^ (this.health >>> 32));
        hash = 41 * hash + (int) (this.defPower ^ (this.defPower >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (this.mapCoordinateX != other.mapCoordinateX) {
            return false;
        }
        if (this.mapCoordinateY != other.mapCoordinateY) {
            return false;
        }
        if (this.atkPower != other.atkPower) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.defPower != other.defPower) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
     
}
