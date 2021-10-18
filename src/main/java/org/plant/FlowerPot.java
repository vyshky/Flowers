package org.plant;

import lombok.Getter;
import lombok.ToString;
import org.Colors;
import org.plant.Plant;

@Getter
@ToString
public final class FlowerPot {
    private final String color;
    private Plant plant;

    public FlowerPot(Colors color, Plant plant) {
        this.color = color.toString();
        this.plant = plant;
    }

    public String getMoistureGroup() {
        return plant.getMoistureGroup();
    }
    // Написать методы для пересадки растения Get вытащить растение Set посадить


}
