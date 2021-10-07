package org.Plants;

public enum Colors {
    RED("красный"),
    GREEN("зеленый"),
    BLACK("черный"),
    White("белый"),
    MAGENT("пурпурный"),
    BLUE("голубой");

    private String color;

    Colors(String title) {
        this.color = title;
    }

    @Override
    public String toString() {
        return color;
    }
}