package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class registration_page2 extends AppCompatActivity {
public Button next;
public Button prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page2);
        //course spinner
        Spinner dropdown4 = (Spinner) findViewById(R.id.Course);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.Course, android.R.layout.simple_expandable_list_item_1);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_item);
        dropdown4.setAdapter(adapter4);
        Button next = (Button) findViewById(R.id.next_btn2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_registration_page3();
            }
        });
        Button prev = (Button) findViewById(R.id.prev_btn);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_registration_page1();
            }
        });
    }

    public void onRadioButtonClicked3(View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.Certificate:
                if (checked)
                    break;
            case R.id.Diploma:
                if (checked)
                    break;
            case R.id.Undergaduate:
                if (checked)
                    break;

        }


    }

    public void onRadioButtonClicked4(View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.Day:
                if (checked)
                    break;
            case R.id.Weekend:
                if (checked)
                    break;
            case R.id.HolidayBased:
                if (checked)
                    break;

        }
    }
    //checkboxes
    public void onCheckBoxClicked(View view){
        //is the view checked?
        boolean checked = ((CheckBox) view).isChecked();

        //Check which checkbox was clicked
        switch (view.getId()){
            case R.id.checkBox_Microsoft:
                if (checked)

            break;
            case R.id.checkBox_Programming:
                if (checked)

                    break;
            case R.id.checkBox_Hardware:
                if (checked)

                    break;
            case R.id.checkBox_Unix:
                if (checked)

                    break;
        }

    }
    //next button
    public void openActivity_registration_page3(){
        Intent intent = new Intent(this, registration_page3.class);
        startActivity(intent);
    }
    //prev button
    public void openActivity_registration_page1(){
        Intent intent1 = new Intent(this, registrationPage1.class);
        startActivity(intent1);
    }
}
