package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class MapActivity extends Activity implements OnMapReadyCallback{

    private MapFragment map;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        map = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        map.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(53.558, 9.927))
            .title("Marker"));
    }
}