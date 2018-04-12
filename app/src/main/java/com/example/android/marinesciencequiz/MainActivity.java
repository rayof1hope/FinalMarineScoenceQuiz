package com.example.android.marinesciencequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * This app is a quiz about Marine Science facts.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called to record the correct answers.
     */


    //Did user select the correct answers?
    public void onRadioButtonClicked(View view) {
        //Is the right button clicked?

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.q1cb4:
                if (checked)
                    //Show message as a toast
                    Toast.makeText(this, "Great job!!", Toast.LENGTH_SHORT).show();
        }

        switch (view.getId()) {
            case R.id.q2cb2:
                if (checked)
                    //Show message as a toast
                    Toast.makeText(this, "Great job!!", Toast.LENGTH_SHORT).show();

        }

        switch (view.getId()) {
            case R.id.q3cb1:
                if (checked)
                    //Show message as a toast
                    Toast.makeText(this, "Great job!!", Toast.LENGTH_SHORT).show();
        }


        switch (view.getId()) {
            case R.id.q4cb2:
                if (checked)
                    //Show message as a toast
                    Toast.makeText(this, "Great job!!", Toast.LENGTH_SHORT).show();
        }

        switch (view.getId()) {
            case R.id.q5cb3:
                if (checked)
                    //Show message as a toast
                    Toast.makeText(this, "Great job!!", Toast.LENGTH_SHORT).show();
        }

        switch (view.getId()) {
        case R.id.q6cb4:
        if (checked)
            //Show message as a toast
            Toast.makeText(this, "Great job!!", Toast.LENGTH_SHORT).show();
    }}
    }








