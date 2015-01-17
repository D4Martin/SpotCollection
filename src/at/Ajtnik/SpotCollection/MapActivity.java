package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class MapActivity extends Activity implements OnMapReadyCallback{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}