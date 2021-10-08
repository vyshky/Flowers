import org.Plants.Colors;
import org.Plants.Flower;
import org.Plants.Height;
import org.Plants.Humidity;

public class Application {
    public static void main(String[] args) throws Exception {
        int hungerLevel = 50;    // Уровень голода
        int daysToBloom = 13;    // День цветения
        int humidityLevel = 80;  // Уровень влажности воздуха
        Flower rose = new Flower("Ромашка", hungerLevel, Height.VERY_SMALL, Colors.MAGENT, Humidity.getMoistureGgroup(humidityLevel), daysToBloom);
        daysToBloom = rose.getDayToBloom();
        infoPlant(rose, daysToBloom);
    }

    public static void infoPlant(Flower plant, int daysToBloom) {

        System.out.print(plant.getFlowerName() + " относится к группе : ");
        System.out.println(plant.getMoistureGgroup());
        System.out.println("Цвет горшка : " + plant.getColorPot());
        System.out.print(plant.getDaysFromLanding() + " день, ");
        for (int i = 0; i < daysToBloom; ++i) {
            plant.nextDay();

            if (plant.flowerIsHungry()) {
                plant.toWaterFlower();
            }
            System.out.print(plant.getDaysFromLanding() + " день, ");
        }
    }

}
