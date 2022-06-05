package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vopros3Prav extends AppCompatActivity {

    Button button;
    Button button2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros3_prav);


        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);


        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.button2:
                    Intent h = new Intent(getApplicationContext(), Quiz4Vopr.class);
                    startActivity(h);
                    break;




            }
        };


        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);


    }


}