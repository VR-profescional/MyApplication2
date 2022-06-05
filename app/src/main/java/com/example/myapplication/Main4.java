package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4 extends AppCompatActivity {
    Button buttonzad21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        buttonzad21 = (Button) findViewById(R.id.buttonzad21);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.buttonzad21:
                        Intent q = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(q);
                        break;

                }
            }

        };
        buttonzad21.setOnClickListener(onClickListener);
    }
}