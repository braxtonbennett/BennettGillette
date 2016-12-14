/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Douglas
 */
public class Character implements Serializable{
    
     private String name;
     private String description;
     private int x;
     private int y;
     private long atkPower;
     private long health;
     private String mapNo;
     ArrayList<Item> items;
     ArrayList<WeaponItem> weapons;
     ArrayList<HealthItem> healthItems;

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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String getMapNo() {
        return mapNo;
    }

    public void setMapNo(String mapNo) {
        this.mapNo = mapNo;
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


    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", x=" + x + ", y=" + y + ", atkPower=" + atkPower + ", health=" + health +", mapNo=" + mapNo + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + (int) (this.atkPower ^ (this.atkPower >>> 32));
        hash = 17 * hash + (int) (this.health ^ (this.health >>> 32));
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
        if (this.atkPower != other.atkPower) {
            return false;
        }
        if (this.health != other.health) {
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
