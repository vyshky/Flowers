package org.Plants;

public abstract class Plant {
    public boolean stem;
    public boolean leaf;
    public boolean root;
    public String plantBreathes;
    public String drinkWater;
    public String plantConsumesSolarEnergy;

    public Plant() {
        stem = true;
        leaf = true;
        root = true;
        plantBreathes = "Углекислый газ";
        drinkWater = "Вода";
        plantConsumesSolarEnergy = "Солнечный свет";
    }
}
