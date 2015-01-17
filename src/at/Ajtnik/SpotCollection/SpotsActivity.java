package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;
import at.Ajtnik.SpotCollection.dataclasses.Difficulty;
import at.Ajtnik.SpotCollection.dataclasses.Spot;
import at.Ajtnik.SpotCollection.models.SpotModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Schauzer on 17.01.2015.
 */
public class SpotsActivity extends Activity {

    private SpotModel spotmodel;
    private ListView lvSpots;
    private ArrayList<Spot> spots = new ArrayList<Spot>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        generateTestData();
        setContentView(R.layout.spots_activity);
        spotmodel = new SpotModel(this,spots);

        lvSpots = (ListView)findViewById(R.id.lvSpots);
        lvSpots.setAdapter(spotmodel);
    }

    private void generateTestData()
    {
        spots.add(new Spot("Spot1",35.00,70.00,4, BitmapFactory.decodeResource(getResources(),R.drawable.index), Difficulty.Beginner));
        spots.add(new Spot("Spot2",35.00,70.00,2,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Spot3",35.00,70.00,4,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Spot4",35.00,70.00,2,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Spot5",35.00,70.00,3,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
    }
}