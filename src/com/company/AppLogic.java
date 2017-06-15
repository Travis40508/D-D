package com.company;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class AppLogic {
    private Messages messages;
    private String name;
    private int strength;
    private int constitution;
    private int charisma;
    private int wisdom;
    private int intelligence;
    private int dexterity;

    public AppLogic() {
        messages = new Messages();
    }

    /**
     * Rolls dice within a scale of 1-6. Adds all 3 values up
     * and prints out each individual value before returning full value.
     */
    public int roleDice() {
        int value = 0;
        for (int i = 0; i < 3; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
            messages.showNumber(randomNum);
            value += randomNum;
        }
        return value;


    }

    public void storeName(String name) {
        this.name = name;
    }

    public void storeConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void storeCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void storeWisdom(int wisdom) {
        this.wisdom = wisdom;
    }


    public void storeIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void storeDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void storeStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Creates character model with full data from earlier.
     */
    public CharacterModel createCharacter() {
        CharacterModel characterModel = new CharacterModel(name,
                strength, dexterity, intelligence, wisdom, charisma, constitution);
        return characterModel;
    }
}
