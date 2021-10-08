package org.Plants;

public abstract class Plant {
    private boolean stem;
    private boolean leaf;
    private boolean root;
    private String plantBreathes;
    private String drink;
    private String plantConsumesSolarEnergy;

    public Plant() {
        stem = true;
        leaf = true;
        root = true;
        plantBreathes = "Углекислый газ";
        drink = "Вода";
        plantConsumesSolarEnergy = "Солнечный свет";
    }

    public Plant(boolean stem, boolean leaf, boolean root, String plantBreathes, String drink, String plantConsumesSolarEnergy) {
        this.stem = stem;
        this.leaf = leaf;
        this.root = root;
        this.plantBreathes = plantBreathes;
        this.drink = drink;
        this.plantConsumesSolarEnergy = plantConsumesSolarEnergy;
    }
}
