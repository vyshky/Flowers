package org.Plants;

public class FlowerPot {

    private final String color;

    public FlowerPot(Colors color) {
        this.color = color.toString();
    }

    public String getColorPot() {
        return color;
    }

}
