package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz2VoprNtVern extends AppCompatActivity {
    Button button14;
    Button button15;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_vopr_nt_vern);


        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);


        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button14:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.button15:
                    Intent h = new Intent(getApplicationContext(), qquiz2.class);
                    startActivity(h);
                    break;

            }
        };


        button14.setOnClickListener(onClickListener);
        button15.setOnClickListener(onClickListener);
    }


}