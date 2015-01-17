package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Schauzer on 16.01.2015.
 */
public class MenuActivity extends Activity {
    private Button btSpots;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        btSpots = (Button)findViewById(R.id.btSpots);

    }
}