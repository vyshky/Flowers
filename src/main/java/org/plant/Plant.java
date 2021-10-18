package org.plant;

import lombok.Getter;
import org.Height;

@Getter
public abstract class Plant {

    private final String name;
    private final boolean stem;
    private final boolean leaf;
    private final boolean root;
    private final String plantBreathes;
    private final String drink;
    private final String plantConsumesEnergy;
    private Height height;

    public Plant(String name) {
        this.name = name;
        stem = true;
        leaf = true;
        root = true;
        plantBreathes = "Углекислый газ";
        drink = "Вода";
        plantConsumesEnergy = "Солнечный свет";
    }

    public Plant(String name, boolean stem, boolean leaf, boolean root, String plantBreathes, String drink, String plantConsumesSolarEnergy, Height height) {
        this.name = name;
        this.stem = stem;
        this.leaf = leaf;
        this.root = root;
        this.plantBreathes = plantBreathes;
        this.drink = drink;
        this.plantConsumesEnergy = plantConsumesSolarEnergy;
        this.height = height;
    }
    public abstract String getMoistureGroup();
}
