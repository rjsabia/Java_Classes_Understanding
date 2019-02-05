package com.company;

public class House {

    // Main variable for example
    private String color;
    private int bedrooms;

    // Setup default house
    public House() {
        this("Pink --> Default", 3);
        System.out.println("Default empty constructor has been called");
    }

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