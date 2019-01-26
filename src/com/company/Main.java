package com.company;

public class Main {

    public static void main(String[] args) {

        // first reference to the blueHouse class, and initialized to blue
        House blueHouse = new House("blue");
        // 2nd reference to the blueHouse
        House anotherhouse = blueHouse;

        System.out.println(blueHouse.getColor()); // will be blue
        System.out.println(anotherhouse.getColor()); // will also be blue

        anotherhouse.setColor("red");
        System.out.println(blueHouse.getColor()); // will now be red because of reference
        System.out.println(anotherhouse.getColor()); // will now also be red

        House greenHouse = new House("green");
        anotherhouse = greenHouse;

        System.out.println(blueHouse.getColor()); // will stay red because it was not referenced
        System.out.println(anotherhouse.getColor()); // will now be green because of reference
        System.out.println(greenHouse.getColor()); // will also be green
    }
}
