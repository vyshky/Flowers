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


//    private void initLevelUpDay(int daysToBloom) {
//        var levelUp = daysToBloom / height.count();
//        if (levelUp <= 1) levelUp = 2;
//
//        experience = levelUp;
//    }

    //Округляем дату до дня цветения, что бы не выводить лишние дни
//    private int roundUpTheDate(int daysToBloom) {
//
//        var experienceDay = (daysToBloom / height.count()); // получаем количество дней после которого растение будет вырастать на один уровень
//
//        var countExperienceDays = daysToBloom / experienceDay;  // считаем количество повышения уровня за daysToBloom дней
//
//        var dayMaxLevel = experienceDay * countExperienceDays;  // записываем последний день в который будет повышение уровня
//
//        return dayMaxLevel;
//    }

//    public void nextDay() {
//        ++landingDay;
//        if (landingDay == dayLevelUp) {
//            System.out.print(flowerName + " " + height + ", ");
//        } else if (landingDay % dayLevelUp == 0 && landingDay != 0) {
//            height = height.nextIndex();
//            System.out.print(flowerName + " " + height + ", ");
//        }
//        hungerLevel += 10;
//    }


//    @Override
//    public String toString() {
//        return "experience{" +
//                "height=" + height +
//                ", daysFromLanding=" + landingDay +
//                '}';
//    }
}



