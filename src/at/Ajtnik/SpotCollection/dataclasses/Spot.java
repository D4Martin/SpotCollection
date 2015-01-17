package at.Ajtnik.SpotCollection.dataclasses;


import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by ajtma_000 on 16.01.2015.
 */
public class Spot implements Serializable{

    private String name;
    private int rating;
    private Bitmap image;
    private Difficulty difficulty;
    private double xCoord;
    private double yCoord;

    public Spot(String name, double xCoord, double yCoord ,int rating, Bitmap image, Difficulty difficulty) {
        this.name = name;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.rating = rating;
        this.image = image;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int voting) {
        this.rating = voting;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }
}
