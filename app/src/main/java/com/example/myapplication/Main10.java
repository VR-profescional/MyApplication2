package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10 extends AppCompatActivity {
    Button nazadDayNarEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        nazadDayNarEd = (Button) findViewById(R.id.nazadDayNarEd);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.nazadDayNarEd:
                        Intent q = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(q);
                        break;

                }
            }

        };
        nazadDayNarEd.setOnClickListener(onClickListener);
    }
}