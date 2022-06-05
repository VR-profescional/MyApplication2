package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5 extends AppCompatActivity {
    Button button8nartNAzad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button8nartNAzad = (Button) findViewById(R.id.button8nartNAzad);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button8nartNAzad:
                        Intent p = new Intent(getApplicationContext(), MainActivity3.class);
                        startActivity(p);
                        break;

                }
            }

        };
        button8nartNAzad.setOnClickListener(onClickListener);
    }
}