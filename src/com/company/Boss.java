package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon("Traumatic",
            "Makarov");

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}