package org.plant;

import lombok.Getter;
import org.Height;

@Getter
public abstract class Plant {

    private final boolean stem;
    private final boolean leaf;
    private final boolean root;
    private final String plantBreathes;
    private final String drink;
    private final String plantConsumesEnergy;
    private Height height;

    public Plant() {
        stem = true;
        leaf = true;
        root = true;
        plantBreathes = "Углекислый газ";
        drink = "Вода";
        plantConsumesEnergy = "Солнечный свет";
        height = Height.VERY_SMALL;
    }


    public Plant(boolean stem, boolean leaf, boolean root, String plantBreathes, String drink, String plantConsumesSolarEnergy, Height height) {
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
