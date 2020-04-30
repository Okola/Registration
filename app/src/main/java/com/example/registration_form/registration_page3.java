package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class registration_page3 extends AppCompatActivity {
    public Button submit;
    public Button prev2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page3);
        //prev button onClick
        Button prev2 = (Button) findViewById(R.id.prev_btn2);
        prev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRegistration2();
            }
        });
        //submit button onclick
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Submission successful",Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
    public void openActivityRegistration2(){
        Intent prev = new Intent(this, registration_page2.class);
        startActivity(prev);
    }
}
