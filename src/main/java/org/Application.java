package org;

import org.plant.FlowerPot;
import org.plant.flowers.Rose;

public class Application {
    public static void main(String[] args) throws Exception {
        int hungerLevel = 0;    // Уровень голода
        int daysToBloom = 20;    // День цветения
        int humidityLevel = 60;  // Уровень влажности воздуха

        /////////////////////////////////
        //Pot должен хранить в себе розу
        Rose rose = new Rose("Роза китайская", Humidity.getMoistureGgroup(humidityLevel), Height.VERY_SMALL);
        FlowerPot potGreenRose = new FlowerPot(Colors.GREEN, rose);
        System.out.println(potGreenRose.getMoistureGroup());
        System.out.println(potGreenRose);
        //Все действия с розой написать в мотодах или в отдельном классе рост , полив , смерть

    }

//    public static void infoPlant(Flower plant, int daysToBloom) {
//
//        System.out.print(plant.getFlowerName() + " относится к группе : ");
//        //System.out.println(plant.getMoistureGgroup());
//        //System.out.println("Цвет горшка : " + plant.getColorPot());
//        System.out.println(plant.getDaysFromLanding() + " день;");
//        for (int i = 0; i < daysToBloom; ++i) {
//            plant.nextDay();
//            if (plant.flowerIsHungry()) {
//                plant.toWaterFlower();
//            }
//            System.out.println(plant.getDaysFromLanding() + " день;");
//        }
//    }

}
