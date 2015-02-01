package at.Ajtnik.SpotCollection.models;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import at.Ajtnik.SpotCollection.R;
import at.Ajtnik.SpotCollection.SettingsActivity;
import at.Ajtnik.SpotCollection.SpotView;
import at.Ajtnik.SpotCollection.SpotsActivity;
import at.Ajtnik.SpotCollection.dataclasses.Spot;
import com.google.android.gms.internal.iv;

import java.util.ArrayList;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class SpotModel extends ArrayAdapter<Spot>{

    private final Context context;
    private final ArrayList<Spot> itemsArrayList;

public SpotModel(Context context, ArrayList<Spot> itemsArrayList)
{
    super(context, R.layout.item_row, itemsArrayList);

    this.context = context;
    this.itemsArrayList = itemsArrayList;


}

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

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

        rabaRating.setEnabled(false);

        // 4. Set the Item Components

        ivProfilePic.setImageBitmap( Bitmap.createScaledBitmap(itemsArrayList.get(position).getImage(),200,200,false));
        tvName.setText(itemsArrayList.get(position).getName());
        tvDifficulty.setText(itemsArrayList.get(position).getDifficulty().toString());
        rabaRating.setRating((float)itemsArrayList.get(position).getRating());


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(getContext(), SpotView.class);
                i.putExtra("spotobject", itemsArrayList.get(position));
                try
                {
                    getContext().startActivity(i);
                } catch (Exception ex)
                {
                    ex.fillInStackTrace();
                }


            }
        });


        // 5. return rowView
        return rowView;
    }

    public Spot GetSpot(int i)
    {
        return itemsArrayList.get(i);
    }

    @Override
    public void add(Spot object) {
        super.add(object);
        itemsArrayList.add(object);
    }

}
