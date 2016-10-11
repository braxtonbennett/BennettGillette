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
public class Item implements Serializable{
    
    private String name;
    private long quantityInStock;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(long quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", quantityInStock=" + quantityInStock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
