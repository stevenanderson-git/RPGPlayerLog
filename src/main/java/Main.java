package main.java;

import main.java.model.CharacterStat;
import main.java.view.GUIFrame;

public class Main {
    public static void main(String[] args) {
        // Created new GUI class to build from the frame up
        GUIFrame guiFrame = new GUIFrame();
        // TODO: fetch information and populate before displaying
        guiFrame.displayGUI();
    }

    public static CharacterStat[] makeStatArrays() {
        CharacterStat[] characterStats = { new CharacterStat("Strength", 20), new CharacterStat("Dexterity", 20),
                new CharacterStat("Constitution", 20), new CharacterStat("Intelligence", 20),
                new CharacterStat("Wisdom", 20), new CharacterStat("Charisma", 20) };
        return characterStats;
    }
}
