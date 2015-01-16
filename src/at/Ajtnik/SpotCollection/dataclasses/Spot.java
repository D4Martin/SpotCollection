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

    public Spot(String name, int voting, Bitmap image, Difficulty difficulty) {
        this.name = name;
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


}
