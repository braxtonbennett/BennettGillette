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
public class HealthItem extends Item {
    
    private long healthPoints;

    public HealthItem() {
    }

    public long getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(long healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "HealthItem{" + super.toString() + "healthPoints=" + healthPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (this.healthPoints ^ (this.healthPoints >>> 32));
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
        final HealthItem other = (HealthItem) obj;
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        return true;
    }
    
    
}
