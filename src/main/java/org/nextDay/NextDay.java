package org.nextDay;

import org.plant.FlowerPot;

public class NextDay {
    private int countDay;
    private Hunger hunger;
    private Experience experience;
    private FlowerPot pot;

    public NextDay(FlowerPot pot) {
        this.pot = pot;
        hunger = new Hunger();
        experience = new Experience();
    }

    public void nextDay() throws Exception {
        ++countDay;
        hunger.addHunger(10); // Каждый день прибавляем 10 голода
        // System.out.println(hunger.getHungry());
    }

    public void pourTheWater() throws Exception {
        hunger.subHunger(10); // Поливаем растение - вычитаем 10 голода
        //System.out.println(hunger.getHungry());
    }



}