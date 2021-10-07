import org.Plants.Colors;
import org.Plants.Flower;
import org.Plants.Height;

public class Application {
    public static void main(String[] args) {

        int daysBetweenWaterings = 2;
        int hungerLevel = 50;
        int daysToBloom = 13;
        Flower rose = new Flower("Ромашка", hungerLevel, Height.VERY_SMALL, Colors.MAGENT, daysBetweenWaterings, daysToBloom);
        daysToBloom = rose.getDayToBloom();

        infoPlant(rose, daysToBloom);
    }

    public static void infoPlant(Flower plant, int daysToBloom) {

        System.out.println(plant.getFlowerName());
        System.out.println("Цвет горшка : " + plant.getColorPot());
        System.out.println(plant.getDaysFromLanding() + " день");
        for (int i = 0; i < daysToBloom; ++i) {
            plant.nextDay();
            plant.toWaterFlower();
            System.out.println(plant.getDaysFromLanding() + " день");
        }
    }

}
