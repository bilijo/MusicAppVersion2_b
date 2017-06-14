package com.example.android.cheesequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

import static com.example.android.cheesequiz.R.id.radioGroupQuestion1;


public class MainActivity extends AppCompatActivity {


    // define an arraylist global to store answers from question fields
    private final ArrayList<String> ArrayListStoreAnswers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//define an instance of radiogroup and check button linked to question1
        Button btn = (Button) findViewById(R.id.button_check_Q1);
        final RadioGroup rg = (RadioGroup) findViewById(radioGroupQuestion1);

// add clicklistener to the button which is devoted to check the selected answer for question1
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the checked Radio Button ID from Radio Group
                int selectedRadioButtonID = rg.getCheckedRadioButtonId();

                // If nothing is selected from Radio Group, then it return -1
                if (selectedRadioButtonID != -1) {

                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonID);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();
                    ArrayListStoreAnswers.add(selectedRadioButtonText);

                    String data = ArrayListStoreAnswers.get(0);
                    Log.v("MainActivity", "checkQuestionOne: " + data);

                } else {
                    Log.v("MainActivity", "Nothing selected from Radio Group.");

                }
            }
        });
        //******************************************************
    }

}


