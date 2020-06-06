package com.example.multiscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class wavy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wavy);
        ImageButton white = findViewById(R.id.coily);
        ImageButton quiz = findViewById(R.id.quiz);
        final ImageButton whitee = findViewById(R.id.curlyy);
        final ImageButton whiteee = findViewById(R.id.curlyyy);

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(getApplicationContext(), white.class);
                startActivity(q);
            }
        });


        whitee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(getApplicationContext(), whitee.class);
                startActivity(f);
            }
        });
        whiteee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), whiteee.class);
                startActivity(w);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplicationContext(), quiz.class);
                startActivity(e);
            }
        });

    }
}
