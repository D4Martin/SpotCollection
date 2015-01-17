package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Schauzer on 16.01.2015.
 */
public class MenuActivity extends Activity {
    private Button btSpots;
    private Button btFavourites;
    private Button btProfile;
    private Button btSettings;
    private Button btMySpots;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        btSpots = (Button)findViewById(R.id.btSpots);
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
        btSpots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSpots(v);
            }
        });
    }

    public void OnSettings(View v)
    {
        Intent intent = new Intent(getApplicationContext(),SettingsActivity.class);
        startActivity(intent);
    }

    public void OnSpots(View v)
    {
        Intent intent = new Intent(getApplicationContext(),SpotsActivity.class);
        startActivity(intent);
    }
}