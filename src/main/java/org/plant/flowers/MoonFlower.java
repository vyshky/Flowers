package org.plant.flowers;

import lombok.Getter;
import org.Colors;
import org.Height;
import org.plant.Humidity;
import org.plant.Plant;

@Getter
public class MoonFlower extends Plant {
    private final String name;
    private final Humidity moistureGroup;
    private final Colors color = Colors.YELLOW;

    public MoonFlower(String MoonFlowerName, Humidity moistureGroup) {
        super();
        this.name = MoonFlowerName;
        this.moistureGroup = moistureGroup;
    }

    public MoonFlower(String MoonFlowerName, boolean stem, boolean leaf, boolean root, String plantBreathes, String drink, String plantConsumesSolarEnergy, Height height, Humidity moistureGroup) {
        super(stem, leaf, root, plantBreathes, drink, plantConsumesSolarEnergy, height);
        this.name = MoonFlowerName;
        this.moistureGroup = moistureGroup;
    }


    @Override
    public String getMoistureGroup() {
        return null;
    }

    @Override
    public String toString() {
        return "MoonFlower{" +
                "name='" + name + '\'' +
                ", moistureGroup=" + moistureGroup +
                ", color=" + color +
                '}';
    }
}
