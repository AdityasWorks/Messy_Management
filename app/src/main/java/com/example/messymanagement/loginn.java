package com.example.messymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class loginn extends AppCompatActivity implements View.OnClickListener {
    public Button act5;
    EditText editText;
    String myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginn);

        editText = findViewById(R.id.email); //initialize the EditText here
        myText = editText.getText().toString();

        act5 = findViewById(R.id.loginbutton);

        act5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        if (v.getId() == R.id.loginbutton) {
            EditText editText = findViewById(R.id.email);
            String myText = editText.getText().toString();

            if (myText.equals("E22CSEU0979")) { //use equals() method for string comparison
                i = new Intent(this, MainActivity.class);
                startActivity(i);
            } else if (myText.equals("E22CSEU1022")) {
                i = new Intent(this, MainActivity2.class);
                startActivity(i);
            }
        }
    }
}


