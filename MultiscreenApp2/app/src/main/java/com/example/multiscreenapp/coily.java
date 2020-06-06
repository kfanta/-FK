package com.example.multiscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class coily extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coily);
        ImageButton coily = findViewById(R.id.coily);
        ImageButton quiz = findViewById(R.id.quiz);
        final ImageButton coilyy = findViewById(R.id.curlyy);
        final ImageButton coilyyy = findViewById(R.id.curlyyy);

        coily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(getApplicationContext(), coily.class);
                startActivity(q);
            }
        });


        coilyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(getApplicationContext(), coilyy.class);
                startActivity(f);
            }
        });
        coilyyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), coilyyy.class);
                startActivity(w);
            }
        });
    }
}

