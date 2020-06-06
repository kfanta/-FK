package com.example.mymultiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton button1 = findViewById(R.id.button1);
    ImageButton button2 = findViewById(R.id.button2);

    ImageButton button3 = findViewById(R.id.button3);
    ImageButton button4 = findViewById(R.id.button4);
    ImageButton button5 = findViewById(R.id.button5);
    ImageButton button6 = findViewById(R.id.button6);

    EditText username = findViewById(R.id.username);
    EditText password = findViewById(R.id.password);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
