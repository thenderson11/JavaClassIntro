package com.company;

public class KnowingMyVariables2 {

    public static void main(String[] args) {

        // call all of our methods from here.

        knowingMyVariables2Test();




    }
        // Write all of our methods out here.
        public static void knowingMyVariables2Test(){
            MyFavorite torrance = new MyFavorite();

            torrance.setMyName("Torrance Henderson");
            torrance. setFavColor("blue");
            torrance.setFavFood("chicken");

            System.out.println(torrance.getFavColor());
            System.out.println(torrance.getFavFood());
            System.out.println(torrance.getMyName());

            torrance.playFavSong("Uptown Funk - Bruno Mars");
        }

}
