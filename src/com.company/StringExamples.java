package com.company;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class StringExamples {
    // This will be a helpful tool for learning Strings

    /*
    Add any other helpful information here.

    word.charAt(enter a number here); returns char at number
    word.concat("enter a word"); adds a word to the end
    word.equals("enter a word"); compares two strings
    word.toUpperCase(); makes word all CAPS
    word.toLowerCase(); makes the word LOWERcase

     */

    // sout Entered creates shortcut 'system.out.print'
    public static void main(String[] args) {
        System.out.println("Enter A 5 letter Word Please");
        String example = new Scanner(System.in).next();
        System.out.println(example.charAt(example.length()/2));
        System.out.println(example.equals(example));
        System.out.println(example.concat(example));
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());

    }

}
