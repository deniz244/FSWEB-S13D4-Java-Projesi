package com.workintech.oop;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public String getName(){
        return name;
    }

    public int getHealthPercentage(){
        return healthPercentage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHealthPercentage(int healthPercentage){
        this.healthPercentage = healthPercentage;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void checkHealthPercentage(int healthPercentage){
        if(healthPercentage > 100){
            this.healthPercentage = 100;
        } else if (healthPercentage < 0)  {
            this.healthPercentage = 0 ;
        }
    }

    //constructor
    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
        checkHealthPercentage(healthPercentage);
    }

    public int healthRemaining(){
       return getHealthPercentage();
    }

    public void loseHealth(int damage){

        if(healthPercentage == 0){
            System.out.println(name + " player has been knocked out of game");
        }else{
            healthPercentage = healthPercentage - damage;
            System.out.println("Lost " + damage + " health percentage");
            System.out.println("Remaining health percentage: " + healthPercentage);
        }

    }
    public void restoreHealth(int healthPotion){

        if (healthPercentage == 100) {
            System.out.println("Health is already at 100. Cannot restore further.");
        } else {
            int newHealth = healthPercentage + healthPotion;

            if (newHealth > 100) {
                healthPercentage = 100;
                System.out.println("Health percentage can't be bigger than 100");
                System.out.println("Health percentage: " + healthPercentage);
            } else {
                healthPercentage = newHealth;
                System.out.println("Health percentage increased by: " + healthPotion);
                System.out.println("New health percentage: " + healthPercentage);
            }
        }


    }

}
