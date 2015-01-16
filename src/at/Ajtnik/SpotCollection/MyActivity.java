package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MyActivity extends Activity {

    ImageButton searchButton;
    ImageButton menuButton;
    EditText searchText;

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
