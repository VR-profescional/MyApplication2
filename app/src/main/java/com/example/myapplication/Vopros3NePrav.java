package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vopros3NePrav extends AppCompatActivity {

    Button button19;
    Button button18;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros3_ne_prav);


        button19 = (Button) findViewById(R.id.button19);
        button18 = (Button) findViewById(R.id.button18);


        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button19:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.button18:
                    Intent h = new Intent(getApplicationContext(), Vopros3q.class);
                    startActivity(h);
                    break;




            }
        };


        button19.setOnClickListener(onClickListener);
        button18.setOnClickListener(onClickListener);


    }


}