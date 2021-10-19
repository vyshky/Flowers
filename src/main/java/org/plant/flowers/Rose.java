package org.plant.flowers;

import org.Height;
import org.plant.Humidity;
import org.plant.Plant;

public final class Rose extends Plant {
    private final Humidity moistureGroup;

    public Rose(String flowerName, Humidity moistureGroup) {
        super(flowerName);
        this.moistureGroup = moistureGroup;
    }

    public Rose(String name, boolean stem, boolean leaf, boolean root, String plantBreathes, String drink, String plantConsumesSolarEnergy, Height height, Humidity moistureGroup) {
        super(name, stem, leaf, root, plantBreathes, drink, plantConsumesSolarEnergy, height);
        this.moistureGroup = moistureGroup;
    }


    public Plant Copy(Plant plant) {
        var temp = new Rose(plant.getName(), plant.isStem(), plant.isLeaf(), plant.isRoot(), plant.getPlantBreathes(), plant.getDrink(), plant.getPlantConsumesEnergy(), plant.getHeight(), plant.getHumidity());
        return temp;
    }

    @Override
    public Humidity getHumidity() {
        return moistureGroup;
    }

    @Override
    public String getMoistureGroup() {
        return moistureGroup.toString();
    }

    @Override
    public String toString() {
        return "Rose{" + "name=" + this.getName() +
                ", moistureGroup=" + moistureGroup +
                '}';
    }


}
