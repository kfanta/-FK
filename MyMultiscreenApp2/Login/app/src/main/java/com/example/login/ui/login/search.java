package com.example.login.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.R;

public class search  extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        ImageButton europe = findViewById(R.id.europe);
        ImageButton asia = findViewById(R.id.asia);
        ImageButton africa = findViewById(R.id.africa);
        ImageButton aussie = findViewById(R.id.australia);
        ImageButton na = findViewById(R.id.na);
        ImageButton sa = findViewById(R.id.sa);

        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), Europe_Info.class);
                startActivity(w);
            }
        });
        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), Africa_Info.class);
                startActivity(w);
            }
        });asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), Asia_Info.class);
                startActivity(w);
            }
        });na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), NorthAmerica_Info.class);
                startActivity(w);
            }
        });sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), SouthAmerica_Info.class);
                startActivity(w);
            }
        });aussie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), Australia_Info.class);
                startActivity(w);
            }
        });
    }
}
