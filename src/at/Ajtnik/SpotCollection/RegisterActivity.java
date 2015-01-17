package at.Ajtnik.SpotCollection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class RegisterActivity extends Activity {


    private Button btRegister;
    private EditText tfRegUsername;
    private EditText tfRegPassword;
    private EditText tfRegEmail;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        btRegister = (Button) findViewById(R.id.btRegister);
        tfRegUsername = (EditText) findViewById(R.id.tfRegUsername);
        tfRegEmail = (EditText) findViewById(R.id.tfRegEmail);
        tfRegPassword = (EditText) findViewById(R.id.tfRegPassword);

        initListeners();
    }

    private void initListeners()
    {
        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register()
    {
        String username = tfRegUsername.getText().toString();
        String password = tfRegPassword.getText().toString();
        String email = tfRegEmail.getText().toString();
/////////////////////////////////////////////////////////////////////////
        //Ab hier Registrierung



////////////////////////////////////////////////////////////////////////
        try
        {
            new FileOutputStream(new File("registered.set"));
        } catch(Exception ex)
        {
            ex.fillInStackTrace();
        }
    }




}