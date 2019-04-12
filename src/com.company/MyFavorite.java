package com.company;

public class MyFavorite {

    private String myName = "Torrance";
    private String favFood = "chicken";
    private String favColor = "blue";

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void playFavSong(String favSong){
        System.out.println("Playing your favorite song: " + favSong);
    }
}
