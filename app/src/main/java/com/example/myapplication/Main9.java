package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main9 extends AppCompatActivity {
    Button nazaddayrassia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        nazaddayrassia = (Button) findViewById(R.id.nazaddayrassia);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.nazaddayrassia:
                        Intent q = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(q);
                        break;

                }
            }

        };
        nazaddayrassia.setOnClickListener(onClickListener);
    }
}