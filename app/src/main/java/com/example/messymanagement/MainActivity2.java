package com.example.messymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    public ImageButton act1 , act2 , act3 , act4, act05;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act1 = (ImageButton) findViewById(R.id.foodbutton);
        act2 = (ImageButton) findViewById(R.id.timetablebutton);
        act3 = (ImageButton) findViewById(R.id.feedbackbutton);
        act4 = (ImageButton) findViewById(R.id.navbutton);
        act05 = (ImageButton) findViewById(R.id.hostelbutton);

        act1.setOnClickListener(this);
        act2.setOnClickListener(this);
        act3.setOnClickListener(this);
        act4.setOnClickListener(this);
        act05.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.foodbutton:
                i = new Intent(this,food_qr_activity.class);
                startActivity(i);
                break;

            case R.id.timetablebutton:
                i = new Intent(this,TimeTable2.class);
                startActivity(i);
                break;

            case R.id.feedbackbutton:
                i = new Intent(this,feedback_activity.class);
                startActivity(i);
                break;

            case R.id.navbutton:
                i = new Intent(this,navigation_drawer_profile.class);
                startActivity(i);
                break;

            case R.id.hostelbutton:
                i = new Intent(this,MainActivity7.class);
                startActivity(i);
                break;
        }


    }
}