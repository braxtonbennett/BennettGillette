/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

/**
 *
 * @author Douglas
 */
public class WeaponItem extends Item {
    
    private long damage;

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "WeaponItem{"+ super.toString() + "damage=" + damage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.damage ^ (this.damage >>> 32));
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
        final WeaponItem other = (WeaponItem) obj;
        if (this.damage != other.damage) {
            return false;
        }
        return true;
    }
    
}
