package com.company;

public class workingWithEncaps {

    public static void main(String[] args) {

        // Creating an Object from a Class

        Encaps target = new Encaps();

        target.setMyName("Torrance");
        System.out.println(target.getMyName());
        target.setNumber(1998 + 1);
        System.out.println(target.getNumber());

    }


}
