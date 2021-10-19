package org;

import org.nextDay.NextDay;
import org.plant.FlowerPot;
import org.plant.Humidity;
import org.plant.flowers.Rose;

public class Application {
    public static void main(String[] args) throws Exception {
        int humidityLevel = 60;  // Уровень влажности воздуха

        /////////////////////////////////
        //Pot должен хранить в себе розу
        Rose rose = new Rose("Роза китайская", Humidity.getMoistureGgroup(humidityLevel));
        FlowerPot potGreenRose = new FlowerPot(Colors.GREEN, rose);
        System.out.println(potGreenRose);
        NextDay nextDay = new NextDay(potGreenRose);

        // Пересадка розы
        Rose rose2 = (Rose) potGreenRose.getPlant();
        FlowerPot potRedRose = new FlowerPot(Colors.RED, rose2);
        System.out.println(potGreenRose);
        System.out.println(potRedRose);

        nextDay.nextDay();
        nextDay.nextDay();
        nextDay.nextDay();
        nextDay.nextDay();
        nextDay.nextDay();
        nextDay.nextDay();
        nextDay.nextDay();
        nextDay.nextDay();
        //nextDay.nextDay();      // Ошибка : Растение погибло от голода

        nextDay.pourTheWater();
        nextDay.pourTheWater();
        nextDay.pourTheWater();
        nextDay.pourTheWater();
        //nextDay.pourTheWater(); // Ошибка : Растение перекормили

    }
}
