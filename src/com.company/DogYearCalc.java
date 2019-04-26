package com.company;

public class DogYearCalc {

    public static void main(String[] args) {
        CheckDog("Fido", 12, 20);
        CheckDog( "Mac", 7, 80);
        CheckDog("Sterling", 1, 17);
        CheckDog("Bear", 5, 28);
        CheckDog("Hulk", 10,121);
        CheckDog("Max", 5,73);
        CheckDog("Ruby", 8,55);
        CheckDog("Spot",3,42);
        CheckDog("Viper",4,55);
        CheckDog("Sky",11, 75);
        CheckDog("Chester",4,65);
        CheckDog("Bella",4,78);
        CheckDog("Lucy",15,32);
        CheckDog("Daisy",8,44);
        CheckDog("Luna",6,96);
        CheckDog("Lola",13,85);
        CheckDog("Sadie",11,55);
        CheckDog("Charlie",8,35);
        CheckDog("Duke",4,25);
        CheckDog("Cooper",5,54);
        CheckDog("Hunter",12,83);
        CheckDog("Khalessi",4,93);
        CheckDog("Rover",9,66);
        CheckDog("Apollo",8,72);
        CheckDog("Ace",11,65);

        // not here
    }

        // But out here

    //Grabs a Dog to send throughout the Dog Calc Program
    public static void CheckDog(String dogName, int age, int weight){
        int dogAIHY = DogYearCalc(age,weight);
        System.out.println("Your Dog " + dogName + " is " + dogAIHY + " Years Old" + (weight));
    }

    public static int DogYearCalc(int age , int weight){

    public static String
       //f(weight)
       switch(age){
            case 1 : return 15;
            case 2 : return 24;
            case 3 : return 28;
            case 4 : return 32;
            case 5 : return 36;
            default: {
                if(age > 5 && weight < 21){
                    int rate = age - 5;
                    int humanYears = 4 * rate;
                    return humanYears + 36;
                    /*
                    Flat Method

                    return ((age - 5) * 4) + 36;
                     */
                }
                else if( age > 5 && weight < 51){
                    return ((age - 5)*6) + 36;
                }
                else if( age > 5 && weight > 50){
                    return ((age - 4)*9) + 36;
                }


            }

        }
        return 0;
    }
}
