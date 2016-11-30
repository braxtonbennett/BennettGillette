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
public class Pack {
    
    private long noSlots;
    private Character character;
    
    Item[] item;

    public Pack() {
    }
    
    public long getNoSlots() {
        return noSlots;
    }

    public void setNoSlots(long noSlots) {
        this.noSlots = noSlots;
    }

    @Override
    public String toString() {
        return "Pack{" + "noSlots=" + noSlots + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (this.noSlots ^ (this.noSlots >>> 32));
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
        final Pack other = (Pack) obj;
        if (this.noSlots != other.noSlots) {
            return false;
        }
        return true;
    }
    
    
    
        
    
    
}
