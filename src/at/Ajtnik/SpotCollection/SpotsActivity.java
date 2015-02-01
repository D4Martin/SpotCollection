package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import at.Ajtnik.SpotCollection.dataclasses.Difficulty;
import at.Ajtnik.SpotCollection.dataclasses.Settings;
import at.Ajtnik.SpotCollection.dataclasses.Spot;
import at.Ajtnik.SpotCollection.models.SpotModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Schauzer on 17.01.2015.
 */
public class SpotsActivity extends Activity{

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

        lvSpots.setClickable(true);
        lvSpots.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lvSpots.setEnabled(true);
    }

    private void generateTestData()
    {
        spots.add(new Spot("Rampe Graz","Eine kleine Rampe in Graz",35.00,70.00,4, BitmapFactory.decodeResource(getResources(),R.drawable.index), Difficulty.Hard));
        spots.add(new Spot("10 Stairs","10 Treppen für Profis",35.00,70.00,2,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.XXTREEEME));
        spots.add(new Spot("Flat 07","Nice Flat zum Üben für Anfänger",35.00,70.00,4,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Pool 9","Ein altes Schwimmbad in Laßnitzhöhe mit Pool",35.00,70.00,2,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Intermediate));
        spots.add(new Spot("Spot Beispiel","Das ist ein Spot :D",35.00,70.00,3,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Profi));
    }




}