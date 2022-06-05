package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz extends AppCompatActivity {

    Button buttondalee;
    Button button7;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        buttondalee = (Button) findViewById(R.id.buttondalee);
        button7 = (Button) findViewById(R.id.button7);

        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.buttondalee:
                    Intent b = new Intent(getApplicationContext(), qquiz2.class);
                    startActivity(b);
                    break;

                case R.id.button7:
                    Intent h = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(h);
                    break;


            }
        };


        buttondalee.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);

    }


}