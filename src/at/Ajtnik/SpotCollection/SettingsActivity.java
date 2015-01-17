package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import at.Ajtnik.SpotCollection.dataclasses.Settings;

import java.io.*;

/**
 * Created by ajtma_000 on 16.01.2015.
 */
public class SettingsActivity extends Activity {


    //<editor-fold desc="VARIABLES DECLARATION">
    private SeekBar sbRadius;
    private Button btSaveSettings;
    //</editor-fold>

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        initComponents();
        initListeners();
        loadSettings();
    }

    //<editor-fold desc="Inits">
    /**
     * Initialize all Components.
     */
    private void initComponents()
    {
        sbRadius = (SeekBar) findViewById(R.id.sbRadius);
        sbRadius.setMax(100);

        btSaveSettings = (Button) findViewById(R.id.btSaveSettings);
    }


    /**
     * Reads the settings with a ObjectInputStream from File "settings.set".
     *
     */
    private void loadSettings()
    {
        FileInputStream fis;
        ObjectInputStream ois;
        try
        {
            fis = new FileInputStream("settings.set");
            ois = new ObjectInputStream(fis);
            Settings s = (Settings) ois.readObject();
            MyActivity.setSettings(s);
        }catch(Exception ex)
        {
            ex.fillInStackTrace();
        }
    }
    //</editor-fold>

    //<editor-fold desc="Listeners">
    private void initListeners()
    {
        btSaveSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileOutputStream fos;
                ObjectOutputStream oos;
                try
                {
                    fos = new FileOutputStream("settings.set");
                    oos = new ObjectOutputStream(fos);
                    Settings s = new Settings(Integer.parseInt(sbRadius.getContext().toString()));
                    oos.writeObject(s);
                }catch(Exception ex)
                {
                    ex.fillInStackTrace();
                }
            }
        });
    }
    //</editor-fold>

}