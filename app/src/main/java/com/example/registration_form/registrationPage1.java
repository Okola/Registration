package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class registrationPage1 extends AppCompatActivity {
    public Button next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page1);
        //year spinner
        Spinner dropdown = (Spinner) findViewById(R.id.year);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.year, android.R.layout.simple_expandable_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        dropdown.setAdapter(adapter);
        //month spinner
        Spinner dropdown2 = (Spinner) findViewById(R.id.month);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Month, android.R.layout.simple_expandable_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        dropdown2.setAdapter(adapter2);
        //day spinner
        Spinner dropdown3 = (Spinner) findViewById(R.id.day);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Day, android.R.layout.simple_expandable_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        dropdown3.setAdapter(adapter3);
        //Next button onClick
        next_btn = (Button) findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_registration_page2();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.male:
                if (checked)
                    break;
            case R.id.female:
                if (checked)
                    break;
        }

    }

    public void onRadioButtonClicked2(View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.Christianity:
                if (checked)
                    break;
            case R.id.Islam:
                if (checked)
                    break;
            case R.id.Hindu:
                if (checked)
                    break;
            case R.id.Others:
                if (checked)
                    break;
        }
    }
    //intent for next button
    public void openActivity_registration_page2(){
        Intent openActivity_registration_page2= new Intent(this ,registration_page2.class);
        startActivity(openActivity_registration_page2);
    }
}
