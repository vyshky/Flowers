package org.Plants;

import java.util.Arrays;

public enum Height {
    VERY_SMALL("очень маленькая"),
    SMALL("маленькая"),
    MIDDLE("средняя"),
    BIG("большая"),
    VERY_BIG("очень большая"),
    BLOSSOMED("расцвела");


    private String height;
    private String count;

    Height(String height) {
        this.height = height;
    }

    public int count() {

        var temp = Height.values();
        return temp.length;
    }

    public Height nextIndex() {

        if (this.ordinal() == Height.BLOSSOMED.ordinal()) {
            return this;
        }
        var temp = Height.values();

        for (int i = 0; i < temp.length; ++i) {
            if (temp[i].ordinal() == this.ordinal()) {
                return temp[++i];
            }
        }
        return this;
    }

    public Height lastIndex() {

        if (this.ordinal() == Height.BLOSSOMED.ordinal()) {
            return this;
        }
        var temp = Height.values();

        int i = 0;
        for (; i < temp.length; ++i) {
        }
        return temp[i - 1];
    }

    @Override
    public String toString() {
        return height;
    }
}