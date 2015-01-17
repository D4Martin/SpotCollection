package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import at.Ajtnik.SpotCollection.dataclasses.Login;
import at.Ajtnik.SpotCollection.dataclasses.Settings;

import java.io.*;

public class MyActivity extends Activity {

    private Button btLogin;
    private CheckBox cbSaveLoginData;
    private EditText tfLogUsername;
    private EditText tfLogPassword;

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
        if(checkForRegister())
        {
            setContentView(R.layout.main);
        }
        else
        {
            Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(i);
        }



        tfLogUsername = (EditText) findViewById(R.id.tfLogUsername);
        tfLogPassword = (EditText) findViewById(R.id.tfLogPassword);
        cbSaveLoginData = (CheckBox) findViewById(R.id.cbSaveLoginData);

        loadLoginSave();
        loadDefaultSettings();

        btLogin  = (Button)findViewById(R.id.btLogin);
        cbSaveLoginData = (CheckBox) findViewById(R.id.cbSaveLoginData);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();
            }
        });

    }

    public void onLogin()
    {
        login(tfLogUsername.getText().toString(), tfLogPassword.getText().toString());
        String str="";
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }

    private void loadDefaultSettings()
    {
        //Settings für App
        settings = new Settings(20);

    }

    private void loadLoginSave()
    {
        FileInputStream fis;
        ObjectInputStream ois;
        Login log = null;
        try
        {
            if(new java.io.File("login.set").exists()) {
                fis = new FileInputStream("login.set");
                ois = new ObjectInputStream(fis);
                log = (Login) ois.readObject();
                if(log.isSave())
                {
                    tfLogUsername.setText(log.getUsername());
                    tfLogPassword.setText(log.getPassword());
                    cbSaveLoginData.setSelected(true);
                }
            }
        }catch(Exception ex)
        {
            ex.fillInStackTrace();
        }



    }

    private void saveLoginSave(boolean save, String username, String password)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(new File("login.set"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Login(save, username, password));
        }catch (Exception ex)
        {
            ex.fillInStackTrace();
        }

    }

    private void login(String username, String password)
    {
        if(!username.isEmpty() || !password.isEmpty())
        {
            if(cbSaveLoginData.isSelected())
            {
                saveLoginSave(true, username, password);
            }
            else //Einloggen
            {

            }
        }
    }

    private boolean checkForRegister()
    {
        if(new File("registered.set").exists())
        {
            return true;
        }

        return false;
    }


}
