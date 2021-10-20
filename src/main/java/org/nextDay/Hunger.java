package org.nextDay;

import lombok.Getter;


enum HungryPlant {
    NOT_HUNGRY("Не голоден"),
    LITTLE_HUNGRY("Слегка голоден"),
    HUNGRY("Голоден"),
    VERY_HUNGRY("Сильно голлоден");

    private String title;

    HungryPlant(String hunger) {
        this.title = hunger;
    }

    @Override
    public String toString() {
        return title;
    }

    public int count() {
        var temp = HungryPlant.values();
        return temp.length;
    }
}

@Getter
public class Hunger {
    private HungryPlant hungry;
    private int hungerLevel;

    public Hunger() {
        this.hungry = HungryPlant.valueOf("NOT_HUNGRY");
    }

    public boolean flowerIsHungry() {
        return hungry != HungryPlant.NOT_HUNGRY ? true : false;
    }

    public static HungryPlant getHungry(int hungryLevel) throws Exception {

        HungryPlant temp = null;
        if (hungryLevel > 60 && hungryLevel <= 85) {
            temp = HungryPlant.valueOf("VERY_HUNGRY");

        } else if (hungryLevel > 45 && hungryLevel <= 60) {
            temp = HungryPlant.valueOf("HUNGRY");

        } else if (hungryLevel > 25 && hungryLevel <= 45) {
            temp = HungryPlant.valueOf("LITTLE_HUNGRY");

        } else if (hungryLevel >= 0 && hungryLevel <= 25) {
            temp = HungryPlant.valueOf("NOT_HUNGRY");

        } else if (hungryLevel < 0) {
            throw new Exception("Растение перекормили");

        } else {
            throw new Exception("Растение погибло от голода");
        }
        return temp;
    }

    public void subHunger(int value) throws Exception {
        hungerLevel -= value;
        hungry = getHungry(hungerLevel);
    }

    public void addHunger(int value) throws Exception {
        hungerLevel += value;
        hungry = getHungry(hungerLevel);
    }

    public HungryPlant nextIndex() {

        if (hungry.ordinal() == HungryPlant.VERY_HUNGRY.ordinal()) {
            return hungry;
        }
        var temp = HungryPlant.values();

        for (int i = 0; i < temp.length; ++i) {
            if (temp[i].ordinal() == hungry.ordinal()) {
                return temp[++i];
            }
        }
        return hungry;
    }

    public void getInfoHunger() {
        System.out.println("Уровень голода : " + hungry);
    }

    @Override
    public String toString() {
        return "Hunger{" +
                "hungryLevel=" + hungry +
                '}';
    }
}
