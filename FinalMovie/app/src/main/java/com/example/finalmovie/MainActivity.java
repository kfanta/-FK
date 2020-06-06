package com.example.finalmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button trailer =  findViewById(R.id.linkToTrailer);
    Button favorites =findViewById(R.id.fav);
    public TextView director = findViewById(R.id.Director);
    TextView description = findViewById(R.id.Description);
    RatingBar rate = findViewById(R.id.ratingBar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favorites.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent q = new Intent(getApplicationContext(), favorites.class);
                        startActivity(q);
                    }
                });
            }
        });

    }
}
