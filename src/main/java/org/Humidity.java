package org;

public enum Humidity {
    HYDATOPHYTES("Гидатофит"),
    HYDROPHYTE("Гидрофит"),
    HYGROPHYTE("Гигрофит"),
    MESOPHYTE("Мезофит"),
    SUCCULENT("Суккулент"),
    XEROPHILE("Ксерофит");

    private String title;

    Humidity(String title) {
        this.title = title;
    }

    public static Humidity getMoistureGgroup(int humidity) throws Exception {

        Humidity temp = null;
        if (humidity > 95 && humidity <= 100) {
            temp = Humidity.valueOf("HYDATOPHYTES");
        } else if (humidity > 70 && humidity <= 95) {
            temp = Humidity.valueOf("HYDROPHYTE");
        } else if (humidity > 65 && humidity <= 70) {
            temp = Humidity.valueOf("HYGROPHYTE");  // тоже самое Humidity.HYGROPHYTE
        } else if (humidity > 40 && humidity <= 65) {
            temp = Humidity.valueOf("MESOPHYTE");
        } else if (humidity > 30 && humidity <= 40) {
            temp = Humidity.valueOf("SUCCULENT");
        } else if (humidity >= 10 && humidity <= 30) {
            temp = Humidity.valueOf("XEROPHILE");
        } else if (humidity > 100) {
            throw new Exception("Растение отсырело");
        } else {
            throw new Exception("Растение засохло");
        }
        return temp;
    }

    @Override
    public String toString() {
        return title;
    }
}
