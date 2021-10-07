package org.Plants;

public final class Flower extends Plant {
    private final String flowerName;
    private int hungerLevel;
    private FlowerPot pot;
    private Height height;
    private int daysBetweenWatering;
    private int dateLastWatering;
    private int daysFromLanding;
    private int dayToBloom;
    private int dayLevelUp;

    public Flower(String flowerName) {
        super();
        this.flowerName = flowerName;
        daysFromLanding = 0;
        dateLastWatering = 0;
    }

    public Flower(String flowerName, int hungerLevel, Height height, Colors colorPot, int daysBetweenWatering, int daysToBloom) {
        this(flowerName);
        this.hungerLevel = hungerLevel;
        this.height = height;
        this.pot = new FlowerPot(colorPot);
        this.daysBetweenWatering = daysBetweenWatering;
        this.dayToBloom = roundUpTheDate(daysToBloom);
        this.dayLevelUp = initLevelUpDay(daysToBloom);
    }

    public String getColorPot() {
        return pot.getColorPot();
    }

    public int getDaysFromLanding() {
        return daysFromLanding;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getDayToBloom() {
        return dayToBloom;
    }

    // Поливаем flower , и flower растет
    public void toWaterFlower() {
        if (hungerLevel >= 10) {
            hungerLevel -= 10;
            dateLastWatering = daysFromLanding;
        }
        if (hungerLevel <= 0) {
            hungerLevel = 0;
            dateLastWatering = daysFromLanding;
        }
    }

    private int initLevelUpDay(int daysToBloom) {
        var tempLevelUp = daysToBloom / height.count();
        if (tempLevelUp <= 1) tempLevelUp = 2;
        return tempLevelUp;
    }

    //Округляем дату до дня цветения, что бы не выводить лишние дни
    private int roundUpTheDate(int daysToBloom) {

        var experienceDay = (daysToBloom / height.count()); // получаем количество дней после которого растение будет вырастать на один уровень

        var countExperienceDays = daysToBloom / experienceDay;  // считаем количество повышения уровня за daysToBloom дней

        var dayMaxLevel = experienceDay * countExperienceDays;  // записываем последний день в который будет повышение уровня

        return dayMaxLevel;
    }

    public void nextDay() {

        ++daysFromLanding;
        if (daysFromLanding == dayLevelUp) {
            System.out.print(flowerName + " " + height + " ");
        } else if (daysFromLanding % dayLevelUp == 0 && daysFromLanding != 0) {
            height = height.nextIndex();
            System.out.print(flowerName + " " + height + " ");
        }
    }
}
