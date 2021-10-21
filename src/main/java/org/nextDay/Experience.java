package org.nextDay;

public class Experience {
    private final int landingDay;
    private int experience;
    private int experienceNextLevel;

    public Experience() {
        landingDay = 0;
        experience = 0;
    }

    public Experience(int experienceNextLevel) {
        this();
        this.experienceNextLevel = experienceNextLevel;
    }

    public int getExperience() {
        return experience;
    }

    public int getLandingDay() {
        return landingDay;
    }

    public void setExperience(int value) {
        experience = value;
    }

    public void addExperience(int value) {
        experience += value;
    }

    public void nextLevel() {
        experience -= experienceNextLevel;
    }

}



