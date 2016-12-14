/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author Douglas
 */
public class Game implements Serializable{
    
    private Player player;

    
    Character[] character;
    Item[] item;
    HealthItem[] healthItems;
    WeaponItem[] weapons;
    Character[] zombieList;
    

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] Item) {
        this.item = Item;
    }

    public HealthItem[] getHealthItems() {
        return healthItems;
    }

    public void setHealthItems(HealthItem[] healthItems) {
        this.healthItems = healthItems;
    }

    public WeaponItem[] getWeapons() {
        return weapons;
    }

    public void setWeapons(WeaponItem[] weapons) {
        this.weapons = weapons;
    }

    public Character[] getZombieList() {
        return zombieList;
    }

    public void setZombieList(Character[] zombieList) {
        this.zombieList = zombieList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.player);
        hash = 89 * hash + Arrays.deepHashCode(this.character);
        hash = 89 * hash + Arrays.deepHashCode(this.item);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", character=" + character + ", item=" + item + '}';
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.character, other.character)) {
            return false;
        }
        if (!Arrays.deepEquals(this.item, other.item)) {
            return false;
        }
        return true;
    }
    
    

    

    
    
}
