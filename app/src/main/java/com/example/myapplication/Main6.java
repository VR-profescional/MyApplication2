package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6 extends AppCompatActivity {
    Button Nazad1May;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Nazad1May = (Button) findViewById(R.id.Nazad1May);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.Nazad1May:
                        Intent q = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(q);
                        break;

                }
            }

        };
        Nazad1May.setOnClickListener(onClickListener);
    }
}