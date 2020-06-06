package com.example.virtualcookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button change = findViewById(R.id.change);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        if (EditText){

        }
            change.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goToChange();

                }
            });
        }




    }
    public void goToChange (){
        Intent i;
        i = new Intent(this, change.class);
        startActivity(i);
    }

}
