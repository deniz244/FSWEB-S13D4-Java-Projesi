package com.workintech.oop;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void checkHealthPercentage(int healthPercentage){
        if(healthPercentage > 100){
            System.out.println("Health percentage: " + healthPercentage);
            System.out.println("Health percentage can't be bigger than 100");
            this.healthPercentage = 100;
        } else if (healthPercentage < 0)  {
            this.healthPercentage = 0 ;
        }
    }

    //constructor
    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealthPercentage(this.healthPercentage);
        this.weapon = weapon;

    }

    public int healthRemaining(){
       return healthPercentage;
    }

    public void loseHealth(int damage){

        healthPercentage = healthPercentage - damage;

        if(healthPercentage <= 0){
            System.out.println(name + " player has been knocked out of game");
        }else{
            checkHealthPercentage(healthPercentage);
            System.out.println("Lost " + damage + " health percentage");
            System.out.println("Remaining health percentage: " + healthPercentage);
        }

    }
    public void restoreHealth(int healthPotion){

            int newHealth = healthPercentage + healthPotion;
            checkHealthPercentage(newHealth);
            System.out.println("New health percentage: " + healthPercentage);
    }
}




