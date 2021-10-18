package org.plant.flowers;

import org.Height;
import org.Humidity;
import org.plant.Plant;

public final class Rose extends Plant {
    private final Humidity moistureGroup;
    private Height height;

    public Rose(String flowerName, Humidity moistureGroup, Height height) {
        super(flowerName);
        this.moistureGroup = moistureGroup;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rose{" + "name=" + this.getName() +
                ", moistureGroup=" + moistureGroup +
                ", height=" + height +
                '}';
    }

    @Override
    public String getMoistureGroup() {
        return moistureGroup.toString();
    }
}
