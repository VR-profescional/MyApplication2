package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizNeVerno extends AppCompatActivity {


    Button button8;
    Button button9;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_ne_verno);



        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button8:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.button9:
                    Intent h = new Intent(getApplicationContext(), Main8.class);
                    startActivity(h);
                    break;


            }
        };


        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);

    }


}