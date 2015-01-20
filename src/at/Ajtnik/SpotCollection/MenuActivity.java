package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Schauzer on 16.01.2015.
 */
public class MenuActivity extends Activity {
    private ImageView btSpots;
    private Button btFavourites;
    private Button btProfile;
    private Button btSettings;
    private Button btMySpots;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        btSpots = (ImageView)findViewById(R.id.btSpots);
        btFavourites = (Button)findViewById(R.id.btFavourites);
        btProfile = (Button)findViewById(R.id.btProfile);
        btSettings = (Button)findViewById(R.id.btSettings);
        btMySpots = (Button)findViewById(R.id.btMySpots);

        btSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSettings(v);
            }
        });
        /*btSpots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSpots(v);
            }
        });*/

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


    }

    public void OnSettings(View v)
    {
            }

    public void OnSpots(View v)
    {

    }
}