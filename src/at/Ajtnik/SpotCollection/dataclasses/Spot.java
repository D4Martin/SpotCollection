package at.Ajtnik.SpotCollection.dataclasses;


import android.graphics.Bitmap;

/**
 * Created by ajtma_000 on 16.01.2015.
 */
public class Spot {

    private String name;
    private int voting;
    private Bitmap image;
    private Difficulty difficulty;
    private double xCoord;
    private double yCoord;

    public Spot(String name, double xCoord, double yCoord ,int voting, Bitmap image, Difficulty difficulty) {
        this.name = name;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.voting = voting;
        this.image = image;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoting() {
        return voting;
    }

    public void setVoting(int voting) {
        this.voting = voting;
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
