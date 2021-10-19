package org;

import org.nextDay.NextDay;
import org.plant.FlowerPot;
import org.plant.Humidity;
import org.plant.Plant;
import org.plant.flowers.Rose;

public class Application {
    public static void main(String[] args) throws Exception {
        int humidityLevel = 60;  // Уровень влажности воздуха

        /////////////////////////////////
        //Pot должен хранить в себе розу
        Rose rose = new Rose("Роза китайская", Humidity.getMoistureGgroup(humidityLevel));
        FlowerPot potGreen = new FlowerPot(Colors.GREEN, rose);
        System.out.println(potGreen);
        NextDay nextDay = new NextDay(potGreen);

        // Пересадка розы из зеленого в красный горшок
        rose = (Rose) potGreen.getPlant();
        FlowerPot potRed = new FlowerPot(Colors.RED, rose);
        System.out.println(potGreen);
        System.out.println(potRed);

        // Пресадка пустого горшка
        //Rose rose3 = (Rose)potGreenRose.getPlant();  // Ошибка : В горше нет растения!  Вы  не можете взять растение из горшка
        potRed.addPlant(rose);
        System.out.println(potGreen);
        System.out.println(potRed);


        // Посадка пустого значения в горшок
        Rose rose2 = null; // Ошибка : Нельзя посадить Null в горшок
        potRed.addPlant(rose2);

        // Посадке в НЕ пустой горшок
        Rose rose3 = new Rose("Роза дамасская", Humidity.getMoistureGgroup(humidityLevel));// Ошибка : В горше уже есть растение!  Вы  не можете посадить другое растение
        potRed.addPlant(rose3);


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
