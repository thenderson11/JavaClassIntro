package com.company;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        System.out.println("--------loading");
        System.out.println("----------------loading");
        System.out.println("------------------------loading");
        System.out.println("--------------------------------loading");
        System.out.println("----------------------------------------loading");
        System.out.println("done");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Welocme to The Deadliest Word Game Ever");
        System.out.println("Utlizing Java We Made A Game That Kills");
        System.out.println("Enter Secret Word - Dont let anyone Know");
        String secretWord = new Scanner(System.in).next();
        System.out.println("The Secret just lost its letters " +
                "The word needs help getting all of its constants and vowles");
        System.out.println("Will you help ? enter yes or no ");
        String willHelp = new Scanner(System.in).next();
        if( willHelp.toLowerCase()== "yes"){
            int numberOfGuesses = secretWord.length();
            System.out.println("you have : " + numberOfGuesses + "guesses");

        }
        else if(willHelp.toLowerCase() == "no"){
            System.out.println("Really ? - You Died");

            System.out.println("playing");
            Integer numberOfGuesses){
        }
    }
}
