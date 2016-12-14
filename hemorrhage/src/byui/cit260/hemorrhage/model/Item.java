/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Douglas
 */
public class Item implements Serializable{
    
    private String description;
    private long quantityInStock;
    private int x;
    private int y;
    private long noFound;
    
    
    private String mapNo;
            
    public Item() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = name;
    }

    public long getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(long quantityInStock) {
        this.quantityInStock = quantityInStock;
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

    public long getNoFound() {
        return noFound;
    }

    public void setNoFound(long noFound) {
        this.noFound = noFound;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + description + ", quantityInStock=" + quantityInStock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (this.quantityInStock ^ (this.quantityInStock >>> 32));
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
        final Item other = (Item) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
}
