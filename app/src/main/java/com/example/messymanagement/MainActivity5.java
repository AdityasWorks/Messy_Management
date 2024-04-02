package com.example.messymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    private Button button1;
    private Button button2;

    private Button button3;

    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNew_Entry();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRides();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMessages();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                openFeedback();
            }
        });
    }

    public void openRides(){
        Intent intent = new Intent(this, Rides.class);
        startActivity(intent);
    }

    public void openNew_Entry(){
        Intent intent = new Intent(this, New_rides.class);
        startActivity(intent);
    }

    public void openMessages(){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

//    public void openFeedBack(){
//        Intent intent = new Intent(this, feedback5.class);
//        startActivity(intent);
//    }

}
