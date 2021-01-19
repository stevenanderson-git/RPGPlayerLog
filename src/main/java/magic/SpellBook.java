package main.java.magic;

import java.util.ArrayList;
import java.util.List;

public class SpellBook {
    private ArrayList<Spell> cantrips;
    private ArrayList<Spell> level1;
    private ArrayList<Spell> level2;
    private ArrayList<Spell> level3;
    private ArrayList<Spell> level4;
    private ArrayList<Spell> level5;
    private ArrayList<Spell> level6;
    private ArrayList<Spell> level7;
    private ArrayList<Spell> level8;
    private ArrayList<Spell> level9;

    @Override
    public String toString() {
        return "{" + " cantrips='" + getCantrips() + "'" + ", level1='" + getLevel1() + "'" + ", level2='" + getLevel2()
                + "'" + ", level3='" + getLevel3() + "'" + ", level4='" + getLevel4() + "'" + ", level5='" + getLevel5()
                + "'" + ", level6='" + getLevel6() + "'" + ", level7='" + getLevel7() + "'" + ", level8='" + getLevel8()
                + "'" + ", level9='" + getLevel9() + "'" + "}";
    }

    public SpellBook() {
        cantrips = new ArrayList<>();
        level1 = new ArrayList<>();
        level2 = new ArrayList<>();
        level3 = new ArrayList<>();
        level4 = new ArrayList<>();
        level5 = new ArrayList<>();
        level6 = new ArrayList<>();
        level7 = new ArrayList<>();
        level8 = new ArrayList<>();
        level9 = new ArrayList<>();
    }

    public List<Spell> getCantrips() {
        return cantrips;
    }

    public List<Spell> getLevel1() {
        return level1;
    }

    public List<Spell> getLevel2() {
        return level2;
    }

    public List<Spell> getLevel3() {
        return level3;
    }

    public List<Spell> getLevel4() {
        return level4;
    }

    public List<Spell> getLevel5() {
        return level5;
    }

    public List<Spell> getLevel6() {
        return level6;
    }

    public List<Spell> getLevel7() {
        return level7;
    }

    public List<Spell> getLevel8() {
        return level8;
    }

    public List<Spell> getLevel9() {
        return level9;
    }

    /**
     * 
     * @param spellList
     * @param spell
     * @return true if spell was removed or false if spell was not found in list
     */
    public boolean removeSpellFromList(ArrayList<Spell> spellList, Spell spell) {
        if (spellList.contains(spell)) {
            spellList.remove(spell);
            return true;
        } else
            return false;
    }
}
