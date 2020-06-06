package com.example.multiscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class curly extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curly);
        ImageButton curly = findViewById(R.id.coily);
        ImageButton quiz = findViewById(R.id.quiz);
        final ImageButton curlyy = findViewById(R.id.curlyy);
        final ImageButton curlyyy = findViewById(R.id.curlyyy);

        curly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(getApplicationContext(), curlyy.class);
                startActivity(q);
            }
        });


        curlyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(getApplicationContext(), curlyyy.class);
                startActivity(f);
            }
        });
        curlyyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), curlyyyy.class);
                startActivity(w);
            }
        });
    }
}

