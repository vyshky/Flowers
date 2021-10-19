package org.plant;

import lombok.Getter;
import lombok.ToString;
import org.Colors;

@Getter
public final class FlowerPot {
    private final String color;
    private Plant plant;

    public FlowerPot(Colors color, Plant plant) {
        this.color = color.toString();
        this.plant = plant;
    }

    @Override
    public String toString() {
        return "FlowerPot{" +
                "color='" + color + '\'' +
                ", plant=" + plant +
                '}';
    }

    public String getMoistureGroup() {
        return plant.getMoistureGroup();
    }

    public Plant getPlant() throws Exception {
        if (this.plant == null) throw new Exception("В горше нет растения!  Вы  не можете взять растение из горшка");
        var temp = plant;
        plant = null;
        return temp;
    }

    public void addPlant(Plant plant) throws Exception {
        if (this.plant != null && plant == null)
            throw new Exception("В горше уже есть растение!  Вы  не можете посадить другое растение");
        this.plant = plant;
    }

}
