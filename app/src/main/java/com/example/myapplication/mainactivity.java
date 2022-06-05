package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainactivity extends AppCompatActivity {
    Button Viktorina;
    Button ItremainsuntilBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Viktorina = (Button) findViewById(R.id.Viktorina);
        ItremainsuntilBtn = (Button) findViewById(R.id.ItremainsuntilBtn);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.Viktorina:
                        Intent i = new Intent(getApplicationContext(), Main8.class);
                        startActivity(i);
                        break;
                    case R.id.ItremainsuntilBtn:
                        Intent e = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(e);
                        break;
                }
            }

        };
        Viktorina.setOnClickListener(onClickListener);
        ItremainsuntilBtn.setOnClickListener(onClickListener);
    }
}