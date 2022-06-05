package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz4Vopr extends AppCompatActivity {

    Button button22;
    Button button23;
    Button button24;
    Button button25;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_vopr);


        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);


        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button22:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.button23:
                    Intent h = new Intent(getApplicationContext(), Quiz4NePrav.class);
                    startActivity(h);
                    break;

                case R.id.button24:
                    Intent z = new Intent(getApplicationContext(), Quiz4Prav.class);
                    startActivity(z);
                    break;

                case R.id.button25:
                    Intent m = new Intent(getApplicationContext(), Quiz4NePrav.class);
                    startActivity(m);
                    break;


            }
        };


        button22.setOnClickListener(onClickListener);
        button23.setOnClickListener(onClickListener);
        button24.setOnClickListener(onClickListener);
        button25.setOnClickListener(onClickListener);


    }
}