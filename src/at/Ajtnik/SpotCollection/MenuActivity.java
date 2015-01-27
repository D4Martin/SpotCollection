package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Schauzer on 16.01.2015.
 */
public class MenuActivity extends Activity {
    private ImageView btSpots;
    private ImageView btFavourites;
    private ImageView btProfile;
    private ImageView btSettings;
    private ImageView btMySpots;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        btSpots = (ImageView)findViewById(R.id.btSpots);
        btFavourites = (ImageView)findViewById(R.id.btFavourites);
        btProfile = (ImageView)findViewById(R.id.btProfile);
        btSettings = (ImageView)findViewById(R.id.btSettings);
        btMySpots = (ImageView)findViewById(R.id.btMySpots);


        initMenuButtons();

    }

    private void initMenuButtons()
    {

        //<editor-fold desc="SetOnTouchListener´s">
        btSpots.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    btSpots.setImageDrawable(getResources().getDrawable(R.drawable.menu_button_spots_hover));
                else if(event.getAction() == MotionEvent.ACTION_UP) {
                    Intent intent = new Intent(getApplicationContext(),SpotsActivity.class);
                    startActivity(intent);
                    btSpots.setImageDrawable(getResources().getDrawable(R.drawable.menu_button_spots_normal));
                }
                return true;
            }
        });

        btFavourites.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    btFavourites.setImageDrawable(getResources().getDrawable(R.drawable.menu_button_favourites_hover));
                else if(event.getAction() == MotionEvent.ACTION_UP) {
                    Intent intent = new Intent(getApplicationContext(),FavouritesActivity.class);
                    startActivity(intent);
                    btFavourites.setImageDrawable(getResources().getDrawable(R.drawable.menu_button_favourites_normal));
                }
                return true;
            }
        });

        //</editor-fold>

        //<editor-fold desc="SetOnClickListener´s">
        btSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSettings(v);
            }
        });
        btSpots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSpots(v);
            }
        });

        btFavourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFavourites(v);
            }
        });

        btMySpots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMySpots(v);
            }
        });

        btProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onProfile(v);
            }
        });
        //</editor-fold>

    }

    private void onSettings(View v)
    {
        Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
        startActivity(i);
    }

    private void onSpots(View v)
    {

    }

    private void onFavourites(View v)
    {

    }

    private void onProfile(View v)
    {

    }

    private void onMySpots(View v)
    {

    }
}