package org;

public enum Colors {
    RED("красный"),
    YELLOW("желтый"),
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