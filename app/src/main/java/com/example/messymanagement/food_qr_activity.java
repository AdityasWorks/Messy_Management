package com.example.messymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class food_qr_activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_qr2);

        Button act6,act7,act8,act9,act10,act11;
        act6 = (Button) findViewById(R.id.mon);
        act7 = (Button) findViewById(R.id.tue);
        act8 = (Button) findViewById(R.id.wed);
        act9 = (Button) findViewById(R.id.thu);
        act10 = (Button) findViewById(R.id.fri);
        act11 = (Button) findViewById(R.id.sat);
        act6.setOnClickListener(this);
        act7.setOnClickListener(this);
        act8.setOnClickListener(this);
        act9.setOnClickListener(this);
        act10.setOnClickListener(this);
        act11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.mon:
                i = new Intent(this,qrcode.class);
                startActivity(i);
                break;
            case R.id.tue:
                i = new Intent(this,qrcode.class);
                startActivity(i);
                break;
            case R.id.wed:
                i = new Intent(this,qrcode.class);
                startActivity(i);
                break;
            case R.id.thu:
                i = new Intent(this,qrcode.class);
                startActivity(i);
                break;
            case R.id.fri:
                i = new Intent(this,qrcode.class);
                startActivity(i);
                break;
            case R.id.sat:
                i = new Intent(this,qrcode.class);
                startActivity(i);
                break;
        }
    }
}
