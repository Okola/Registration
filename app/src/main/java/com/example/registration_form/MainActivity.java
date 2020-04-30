package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
private Button Register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Register_button = (Button) findViewById(R.id.Register_button);
        Register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationPage1();
            }
        });

    }
    public void openRegistrationPage1(){
        Intent registrationPage1 =  new Intent(this, registrationPage1.class);
        startActivity(registrationPage1);
    }


}
