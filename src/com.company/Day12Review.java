package com.company;

public class Day12Review {

    // Access Modifiers
    private int x = 5;
    public String t = "Torrance";
    protected int r = 7;
    String tlh = "TorLavHen";

    //Objects
    public static void main(String[] args) {
        MyHouse house1 = new MyHouse();
        house1.walls = 3;
        house1.foundation = "Concrete";
        house1.deadBodies = 34;
        house1.levels = 8;

        // giving the instance variable
        System.out.println(house1.walls);
        System.out.println(house1.levels);
        System.out.println(house1.deadBodies);
        System.out.println(house1.foundation);
        house1.closeDoor();
        house1.openDoor();
        System.out.println(house1);
    }
    //Methods
}
