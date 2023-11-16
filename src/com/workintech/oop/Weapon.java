package com.workintech.oop;

public enum Weapon {
    CROSS_BOW(20,2),
    SWORD(10,1.8),
    AXE(15,1.5);

    private int damage;
    private double attackSpeed;

    Weapon(int damage,double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
