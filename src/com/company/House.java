package com.company;

public class House {

    // Main variable for example
    private String color;
    private int bedrooms;

    public House(String color, int bedrooms) {
        this.color = color;
        this.bedrooms = bedrooms;
    }

    // House getter
    public String getColor() {
        return color;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    // House setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

}
