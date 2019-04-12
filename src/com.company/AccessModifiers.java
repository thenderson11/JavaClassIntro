package com.company;

public class AccessModifiers {

    public static void main(String[] args) {
        // Calling All Methods
        saySomethingNice();
        secretWord();
        DefaultExample obj = new DefaultExample();
        obj.display();

    }


    public static void saySomethingNice(){
        String Torrance = "hello T";
        System.out.println(Torrance);

    }

    public static void secretWord(){
        String arcade = "Hello Game";
        String a = arcade.substring(4,8);
        String b = arcade.substring(7);
        String c = b + arcade + a;
        System.out.println(c);
    }

}
