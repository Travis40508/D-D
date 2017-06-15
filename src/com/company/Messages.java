package com.company;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Messages {

    /**
     * Self-explanatory stuff.
     */

    public void greetUser() {
        System.out.println("It's time to create your D&D character! First input a name");
    }

    public void calculatingScore(String stat) {
        System.out.println("Calculating the score of your " + stat);
    }

    public void revealStat(String stat, int value) {
        System.out.println("Your " + stat + " score is " + value + "\n");
    }

    public void showNumber(int randomNum) {
        System.out.println("You rolled a " + randomNum);
    }

    public void revealCharacter(String name, int strength, int dexterity, int intelligence, int wisdom, int charisma, int constitution) {
        System.out.println("Your character's name is " + name + ", with \n" +
                "strength of " + strength + ", a \n" +
                "dexterity of " + dexterity + ", an \n" +
                "intelligence of " + intelligence + ", a \n" +
                "wisdom of " + wisdom + ", a \n" +
                "charisma of " + charisma + ", and a \n" +
                "constitution of " + constitution + ".\n");
    }
}
