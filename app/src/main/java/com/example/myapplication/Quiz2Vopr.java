package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz2Vopr extends AppCompatActivity {

    Button button11;
    Button button12;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_vopr);


        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);




        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button11:
                    Intent b = new Intent(getApplicationContext(), Vopros3q.class);
                    startActivity(b);
                    break;

                case R.id.button12:
                    Intent r = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(r);
                    break;





            }
        };


        button11.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);


    }


}