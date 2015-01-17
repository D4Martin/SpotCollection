package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.*;
import at.Ajtnik.SpotCollection.dataclasses.Spot;
import org.w3c.dom.Text;

/**
 * Created by Schauzer on 17.01.2015.
 */
public class SpotView extends Activity {
    private ImageView ivProfilePic;
    private TextView tvName;
    private TextView tvDifficulty;
    private ImageButton btAdd;
    private RatingBar rabaRating;
    private TextView tvDescription;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spotview_activity);

        Intent i = getIntent();
        Spot spot = (Spot)i.getSerializableExtra("spotobject");

        ivProfilePic = (ImageView)findViewById(R.id.ivProfilePicView);
        tvName = (TextView)findViewById(R.id.tvNameView);
        tvDifficulty = (TextView)findViewById(R.id.tvDifficultyView);
        btAdd = (ImageButton)findViewById(R.id.btAddView);
        rabaRating = (RatingBar)findViewById(R.id.rabaRating);
        tvDescription = (TextView)findViewById(R.id.tvDescriptionView);

        ivProfilePic.setImageBitmap( Bitmap.createScaledBitmap(spot.getImage(), 200, 200, false));
        tvName.setText(spot.getName());
        tvDifficulty.setText(spot.getDifficulty().toString());
        rabaRating.setRating((float)spot.getRating());
        tvDescription.setText(spot.getDescription());

    }
}