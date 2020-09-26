package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(270);
        boss.setDamage(50);
        boss.setWeapon(boss.weapon);

        System.out.println("Boss weapon name's: " +
                boss.getWeapon().getNameOfWeapon() + ";");
        System.out.println("Boss weapon type's: " +
                boss.getWeapon().getTypeOfWeapon() + ";");
        System.out.println("Boss health is: " + boss.getHealth() + ";");
        System.out.println("Boss damage is: " + boss.getDamage() + ";");
    }
}
