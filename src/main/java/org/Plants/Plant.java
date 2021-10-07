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
}
