package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        Button heat = findViewById(R.id.heat);
        Button natural = findViewById(R.id.natural);
        Button neither = findViewById(R.id.neither);
        TextView question = findViewById(R.id.question);
        heat.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        TextView question = findViewById(R.id.question);
                                        question.setText("Do you have locs?");
                                        Button heat = findViewById(R.id.heat);
                                        heat.setText("Yes");
                                        Button natural = findViewById(R.id.natural);
                                        natural.setText("No");
                                        Button neither = findViewById(R.id.neither);
                                        neither.setText("N/A");

                                    }
                                });
            natural.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView question = findViewById(R.id.question);
                    question.setText("Do you have locs?");
                    Button heat = findViewById(R.id.heat);
                    heat.setText("Yes");
                    Button natural = findViewById(R.id.natural);
                    natural.setText("No");
                    Button neither = findViewById(R.id.neither);
                    neither.setText("N/A");

                }
        });
        neither.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView question = findViewById(R.id.question);
                question.setText("Do you have locs?");
                Button heat = findViewById(R.id.heat);
                heat.setText("Yes");
                Button natural = findViewById(R.id.natural);
                natural.setText("No");
                Button neither = findViewById(R.id.neither);
                neither.setText("N/A");

            }
        });
        natural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView question = findViewById(R.id.question);
                question.setText("Which best resonates your " +
                        "curl pattern?");
                findViewById(R.id.heat);
                Button heat = findViewById(R.id.heat);
                heat.setText("Wavy");

                Button natural = findViewById(R.id.natural);
                natural.setText("Curly");
                Button neither = findViewById(R.id.neither);
                neither.setText("Coily");

            }
        });
    }
}


