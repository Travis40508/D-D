package com.company;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Home {
    private Messages messages;
    private Responses responses;
    private AppLogic appLogic;
    private CharacterModel characterModel;

    /**
     * Initializing our classes and starting our app
     */
    public void init() {
        messages = new Messages();
        responses = new Responses();
        appLogic = new AppLogic();
        startApp();
    }

    /**
     * Stores all values of our charactermodel in our applogic class so it can deal with it.
     */
    private void startApp() {
        storeName();
        storeStrength();
        storeDexterity();
        storeIntelligence();
        storeWisdom();
        storeCharisma();
        storeConstitution();
        this.characterModel = appLogic.createCharacter();
        messages.revealCharacter(characterModel.getName(),
                characterModel.getStrength(),
                characterModel.getDexterity(),
                characterModel.getIntelligence(),
                characterModel.getWisdom(),
                characterModel.getCharisma(),
                characterModel.getConstitution());
    }

    private void storeConstitution() {
        messages.calculatingScore("constitution");
        int constitution = appLogic.roleDice();
        messages.revealStat("consitution", constitution);
        appLogic.storeConstitution(constitution);
    }

    private void storeCharisma() {
        messages.calculatingScore("charisma");
        int charisma = appLogic.roleDice();
        messages.revealStat("charisma", charisma);
        appLogic.storeCharisma(charisma);
    }

    private void storeWisdom() {
        messages.calculatingScore("wisdom");
        int wisdom = appLogic.roleDice();
        messages.revealStat("wisdom", wisdom);
        appLogic.storeWisdom(wisdom);
    }

    private void storeIntelligence() {
        messages.calculatingScore("intelligence");
        int intelligence = appLogic.roleDice();
        messages.revealStat("intelligence", intelligence);
        appLogic.storeIntelligence(intelligence);
    }

    private void storeDexterity() {
        messages.calculatingScore("dexterity");
        int dexterity = appLogic.roleDice();
        messages.revealStat("dexterity", dexterity);
        appLogic.storeDexterity(dexterity);
    }

    private void storeStrength() {
        messages.calculatingScore("strength");
        int strength = appLogic.roleDice();
        messages.revealStat("strength", strength);
        appLogic.storeStrength(strength);
    }

    private void storeName() {
        messages.greetUser();
        appLogic.storeName(responses.getUserName());
    }
}
