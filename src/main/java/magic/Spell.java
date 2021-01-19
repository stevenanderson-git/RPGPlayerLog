package main.java.magic;

public class Spell {
    private String spellName;
    private int spellLevel;
    private String spellMagicSchool;
    private boolean ritualTag;
    private String spellCastingTime;
    private String spellRange;
    private String spellComponents;
    private String spellDuration;
    private String spellDescription;
    private boolean spellUpcast;
    private String spellUpcastDescription;

    @Override
    public String toString() {
        return String.format(
                "%s%n%s-Level %s Ritual: %s%nCasting Time: %s%nRange: %s%nComponents: %s%nDuration: %s%n%n%s%nUpcast: %s%n%s",
                getSpellName(), getSpellLevel(), getSpellMagicSchool(), getRitualTag(), getSpellCastingTime(),
                getSpellRange(), getSpellComponents(), getSpellDuration(), getSpellDescription(), getSpellUpcast(),
                getSpellUpcastDescription());
    }

    public Spell() {
        spellName = "";
        spellLevel = 0;
        spellMagicSchool = "";
        spellCastingTime = "";
        spellRange = "";
        spellComponents = "";
        spellDuration = "";
        spellDescription = "";
        spellUpcast = false;
        spellUpcastDescription = "";
        ritualTag = false;
    }

    public String getSpellName() {
        return this.spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellLevel() {
        return this.spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public String getSpellMagicSchool() {
        return this.spellMagicSchool;
    }

    public void setSpellMagicSchool(String spellMagicSchool) {
        this.spellMagicSchool = spellMagicSchool;
    }

    public String getSpellCastingTime() {
        return this.spellCastingTime;
    }

    public void setSpellCastingTime(String spellCastingTime) {
        this.spellCastingTime = spellCastingTime;
    }

    public String getSpellRange() {
        return this.spellRange;
    }

    public void setSpellRange(String spellRange) {
        this.spellRange = spellRange;
    }

    public String getSpellComponents() {
        return this.spellComponents;
    }

    public void setSpellComponents(String spellComponents) {
        this.spellComponents = spellComponents;
    }

    public String getSpellDuration() {
        return this.spellDuration;
    }

    public void setSpellDuration(String spellDuration) {
        this.spellDuration = spellDuration;
    }

    public String getSpellDescription() {
        return this.spellDescription;
    }

    public void setSpellDescription(String spellDescription) {
        this.spellDescription = spellDescription;
    }

    public boolean isSpellUpcast() {
        return this.spellUpcast;
    }

    public boolean getSpellUpcast() {
        return this.spellUpcast;
    }

    public void setSpellUpcast(boolean spellUpcast) {
        this.spellUpcast = spellUpcast;
    }

    public String getSpellUpcastDescription() {
        return this.spellUpcastDescription;
    }

    public void setSpellUpcastDescription(String spellUpcastDescription) {
        this.spellUpcastDescription = spellUpcastDescription;
    }

    public boolean isRitualTag() {
        return this.ritualTag;
    }

    public boolean getRitualTag() {
        return this.ritualTag;
    }

    public void setRitualTag(boolean ritualTag) {
        this.ritualTag = ritualTag;
    }

}
