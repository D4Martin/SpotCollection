package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import at.Ajtnik.SpotCollection.dataclasses.Settings;

public class MyActivity extends Activity {

    private ImageButton searchButton;
    private ImageButton menuButton;
    private EditText searchText;

    private static Settings settings;

    public static Settings getSettings() {
        return settings;
    }

    public static void setSettings(Settings set ) {
        settings = set;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        searchButton = (ImageButton)findViewById(R.id.btSearch);
        menuButton  = (ImageButton)findViewById(R.id.btMenu);
        searchText = (EditText)findViewById(R.id.tfSearchText);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnMenu();
            }
        });

    }

    public void OnMenu()
    {
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }
}
