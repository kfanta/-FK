package com.example.login.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.login.R;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    TextView Questions;
   ImageButton answerchoice1;
   ImageButton answerchoice2;
   ImageButton answerchoice3;
   ImageButton answerchoice4;
   int score = 0;
   int index = 0;
   ArrayList <Question> questionlist;
   

    @Override //personality quiz
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

     //
        Questions = findViewById(R.id.Questions);
        answerchoice1 = findViewById(R.id.answerchoice1);
        answerchoice2 = findViewById(R.id.answerchoice2);
        answerchoice3 = findViewById(R.id.answerchoice3);
        answerchoice4 = findViewById(R.id.answerchoice4);
        


        Question q1 = new Question("What kind of person are you?", R.drawable.download, R.drawable.introvert, R.drawable.ambivert, R.drawable.nota);
        Question q2 = new Question("I am most likely to:", R.drawable.sleepallday, R.drawable.eatallday, R.drawable.spenddayoutdoors, R.drawable.readallday);
        Question q3 = new Question("I enjoy:", R.drawable.alldayoutdoors, R.drawable.discovernewthings, R.drawable.relaxinginnature, R.drawable.ata);
        Question q4 = new Question("What kind of scenes do you like?", R.drawable.beach, R.drawable.mountglaciers, R.drawable.forest, R.drawable.desert);
        Question q5 = new Question("Which looks like your ideal vacation:", R.drawable.beachesinwest, R.drawable.coldair, R.drawable.coolwinds, R.drawable.inmybed);
        Question q6 = new Question("If you could try something new which would it be?", R.drawable.kakum, R.drawable.scubadive, R.drawable.mountclimb, R.drawable.baliswing);

        //Declared array list
        questionlist = new ArrayList<>();
        questionlist.add(q1);
        questionlist.add(q2);
        questionlist.add(q3);
        questionlist.add(q4);
        questionlist.add(q5);
        questionlist.add(q6);
        displayQuestion();

        answerchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuestion();
                score += 10;
            }
        });

        answerchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuestion();
                score += 20;
            }
        });

        answerchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuestion();
                score += 30;
            }
        });

        answerchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuestion();
                score += 40;
            }
        });

    }

    public void displayQuestion() {

        if( index < questionlist.size()){
            Questions.setText(questionlist.get(index).getQuestion());
            answerchoice1.setImageResource(questionlist.get(index).getPic1());
            answerchoice2.setImageResource(questionlist.get(index).getPic2());
            answerchoice3.setImageResource(questionlist.get(index).getPic3());
            answerchoice4.setImageResource(questionlist.get(index).getPic4());
            index ++;
        }



        else if(score >= 60 && score <= 90){
;
                Questions.setText ("You are more chilled and laid back. You don’t like to be bothered but enjoy the sceneries of nature should consider. You should consider visiting: Europe");
            }


        else if(score >= 90 && score <= 120 ){

                Questions.setText("Neuroticism: You tend to worry about a lot of things, moody, and anxious. You should consider visiting: Oceania and get your mind of things and learn about the wildlife");
        }


        else if(score >= 120 && score <= 150){

                Questions.setText ("Agreeableness: You are very optimistic, nurturing, cooperative, and kind. You enjoy looking out for others and assisting anyone in need of help. You should consider visiting: South America");
        }

        else if(score >= 150 && score <= 180){
            Questions.setText ("Extraversion: You are very outgoing, energetic, and enjoy meeting new people. You feel energized when around people and tend to make friends easily. You should consider visiting: Asia");
        }

        else if(score >= 180 && score<= 210){
            Questions.setText("Conscientiousness: You are very organized and mindful of details. You like to plan ahead, work hard, and think of others. You should consider visiting: Africa");
        }

        else if(score >= 210 && score<= 240){
            Questions.setText("Openness to Experience: You are curious, intelligent, and imaginative. High scorers tend to be eager to learn new things and experience new things. You should consider visiting: North America ");
        }

        }









    }




