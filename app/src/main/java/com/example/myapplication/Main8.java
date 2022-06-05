package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8 extends AppCompatActivity {

    Button button4;
    Button button5;
    Button button6;
    Button buttonNaz;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        buttonNaz = (Button) findViewById(R.id.buttonNaz);

        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button4:
                    Intent b = new Intent(getApplicationContext(), quiz.class);
                    startActivity(b);
                    break;

                case R.id.button5:
                    Intent h = new Intent(getApplicationContext(), quizNeVerno.class);
                    startActivity(h);
                    break;
                case R.id.button6:
                    Intent e = new Intent(getApplicationContext(), quizNeVerno.class);
                    startActivity(e);
                    break;
                case R.id.buttonNaz:
                    Intent w = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(w);
                    break;




            }
        };


        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        buttonNaz.setOnClickListener(onClickListener);

    }


}