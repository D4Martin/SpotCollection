package at.Ajtnik.SpotCollection.dataclasses;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class Settings {

    private int searchRadius;

    public Settings(int searchRadius) {
        this.searchRadius = searchRadius;
    }

    public int getSearchRadius() {
        return searchRadius;
    }

    public void setSearchRadius(int searchRadius) {
        this.searchRadius = searchRadius;
    }
}
