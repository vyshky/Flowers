package org.plant.flowers;

import lombok.Getter;
import org.Colors;
import org.Height;
import org.plant.Humidity;
import org.plant.Plant;

@Getter
public final class Rose extends Plant {
    private final String name;
    private final Humidity moistureGroup;
    private final Colors color = Colors.RED;

    public Rose(String flowerName, Humidity moistureGroup) {
        super();
        this.name = flowerName;
        this.moistureGroup = moistureGroup;
    }

    public Rose(String flowerName, boolean stem, boolean leaf, boolean root, String plantBreathes, String drink, String plantConsumesSolarEnergy, Height height, Humidity moistureGroup) {
        super(stem, leaf, root, plantBreathes, drink, plantConsumesSolarEnergy, height);
        this.name = flowerName;
        this.moistureGroup = moistureGroup;
    }

    @Override
    public String getMoistureGroup() {
        return moistureGroup.toString();
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", moistureGroup=" + moistureGroup +
                ", color=" + color +
                '}';
    }
}
