package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
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
        lvSpots.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast t = Toast.makeText(SpotsActivity.this,"OnClick",Toast.LENGTH_LONG);
                Spot s = spotmodel.GetSpot(position);
                Intent i = new Intent(getApplicationContext(),SpotView.class);
                i.putExtra("spotobject",s);
                startActivity(i);
            }
        });
    }

    public void OnItemClicked(AdapterView<?> parent,View view,int position,long id)
    {
        Spot s = spotmodel.GetSpot(position);
        Intent i = new Intent(getApplicationContext(),SpotView.class);
        i.putExtra("spotobject",s);
        startActivity(i);
    }

    private void generateTestData()
    {
        spots.add(new Spot("Spot1","description",35.00,70.00,4, BitmapFactory.decodeResource(getResources(),R.drawable.index), Difficulty.Beginner));
        spots.add(new Spot("Spot2","description",35.00,70.00,2,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Spot3","description",35.00,70.00,4,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Spot4","description",35.00,70.00,2,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
        spots.add(new Spot("Spot5","description",35.00,70.00,3,BitmapFactory.decodeResource(getResources(),R.drawable.index),Difficulty.Beginner));
    }
}