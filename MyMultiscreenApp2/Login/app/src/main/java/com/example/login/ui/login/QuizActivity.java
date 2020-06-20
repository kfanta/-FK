package com.example.login.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.login.R;

public class QuizActivity extends AppCompatActivity {
    TextView questions;
    TextView answerchoice1;
    TextView answerchoice2;
    TextView answerchoice3;
    TextView answerchoice4;
    @Override //personality quiz
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questions = findViewById(R.id.questions);
        answerchoice1 = findViewById(R.id.answerchoice1);
        answerchoice2 = findViewById(R.id.answerchoice2);
        answerchoice3 = findViewById(R.id.answerchoice3);
        answerchoice4 = findViewById(R.id.answerchoice4);
    }
}
