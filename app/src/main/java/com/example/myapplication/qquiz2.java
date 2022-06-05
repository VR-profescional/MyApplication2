package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qquiz2 extends AppCompatActivity {

        Button Years;
        Button OneHandrend;
        Button button3;
        Button button10;



        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_qquiz2);


            Years = (Button) findViewById(R.id.Years);
            OneHandrend = (Button) findViewById(R.id.OneHandrend);
            button3 = (Button) findViewById(R.id.button3);
            button10 = (Button) findViewById(R.id.button10);


            View.OnClickListener onClickListener = view -> {
                switch (view.getId()) {


                    case R.id.Years:
                        Intent b = new Intent(getApplicationContext(), Quiz2Vopr.class);
                        startActivity(b);
                        break;

                    case R.id.OneHandrend:
                        Intent h = new Intent(getApplicationContext(), Quiz2VoprNtVern.class);
                        startActivity(h);
                        break;
                    case R.id.button3:
                        Intent e = new Intent(getApplicationContext(), Quiz2VoprNtVern.class);
                        startActivity(e);
                        break;

                    case R.id.button10:
                        Intent с = new Intent(getApplicationContext(), mainactivity.class);
                        startActivity(с);
                        break;




                }
            };


            Years.setOnClickListener(onClickListener);
            OneHandrend.setOnClickListener(onClickListener);
            button3.setOnClickListener(onClickListener);
            button10.setOnClickListener(onClickListener);

        }


    }