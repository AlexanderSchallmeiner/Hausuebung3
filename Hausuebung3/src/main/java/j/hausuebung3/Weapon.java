/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.hausuebung3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Weapon  {
    
    String name;
    int damage;
    int speed;
    int strength;
    int value;
  public  CombatType combatType;
    DamageType typeDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public DamageType getTypeDamage() {
        return typeDamage;
    }

    public void setTypeDamage(DamageType typeDamage) {
        this.typeDamage = typeDamage;
    }

    
    
    
    
    
}
