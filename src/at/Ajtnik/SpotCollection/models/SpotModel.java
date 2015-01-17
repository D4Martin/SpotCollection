package at.Ajtnik.SpotCollection.models;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import at.Ajtnik.SpotCollection.R;
import at.Ajtnik.SpotCollection.dataclasses.Spot;

import java.util.ArrayList;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class SpotModel extends ArrayAdapter<Spot>{

    private final Context context;
    private final ArrayList<Spot> itemsArrayList;

public SpotModel(Context context, ArrayList<Spot> itemsArrayList)
{
    super(context, R.layout.row, itemsArrayList);

    this.context = context;
    this.itemsArrayList = itemsArrayList;


}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.item_row, parent, false);

        // 3. Get the Item Components
        ImageView ivProfilePic = (ImageView) rowView.findViewById(R.id.ivProfilePic);
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        TextView tvDifficulty = (TextView) rowView.findViewById(R.id.tvDifficulty);
        RatingBar rabaRating = (RatingBar) rowView.findViewById(R.id.rabaRating);

        // 4. Set the Item Components
        ivProfilePic.setImageBitmap(itemsArrayList.get(position).getImage());
        tvName.setText(itemsArrayList.get(position).getName());
        tvDifficulty.setText(itemsArrayList.get(position).getDifficulty().toString());
        rabaRating.setRating((float)itemsArrayList.get(position).getRating());

        // 5. return rowView
        return rowView;
    }


}
