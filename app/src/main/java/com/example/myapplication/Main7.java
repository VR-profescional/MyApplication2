package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7 extends AppCompatActivity {
    Button nazad9may;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        nazad9may = (Button) findViewById(R.id.nazad9may);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.nazad9may:
                        Intent q = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(q);
                        break;

                }
            }

        };
        nazad9may.setOnClickListener(onClickListener);
    }
}