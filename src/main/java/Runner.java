package main.java;

import main.java.model.CharacterStat;
import main.java.view.MainGUI;

public class Runner {
    public static void main(String[] args){
        MainGUI mainGUI = new MainGUI();
        mainGUI.displayGUI();
    }
    public static CharacterStat[] makeStatArrays() {
        CharacterStat[] characterStats = { new CharacterStat("Strength", 20), new CharacterStat("Dexterity", 20),
                new CharacterStat("Constitution", 20), new CharacterStat("Intelligence", 20),
                new CharacterStat("Wisdom", 20), new CharacterStat("Charisma", 20) };
        return characterStats;
    }
}
