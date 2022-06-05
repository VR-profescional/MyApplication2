package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button NAZAD;
    Button Newyear2;
    Button Rogdestvo;
    Button Febrary23;
    Button Marta;
    Button Daytruda;
    Button Daywinner;
    Button DayRassia;
    Button button13;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Newyear2 = (Button) findViewById(R.id.Newyear2);
        NAZAD = (Button) findViewById(R.id.NAZAD);
        Rogdestvo = (Button) findViewById(R.id.Rogdestvo);
        Febrary23 = (Button) findViewById(R.id.Febrary23);
        Marta = (Button) findViewById(R.id.Marta);
        Daytruda = (Button) findViewById(R.id.Daytruda);
        Daywinner = (Button) findViewById(R.id.Daywinner);
        DayRassia = (Button) findViewById(R.id.DayRassia);
        button13 = (Button) findViewById(R.id.button13);
        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.NAZAD:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.Newyear2:
                    Intent h = new Intent(getApplicationContext(), Main1.class);
                    startActivity(h);
                    break;
                case R.id.Rogdestvo:
                    Intent e = new Intent(getApplicationContext(), Main2.class);
                    startActivity(e);
                    break;

                case R.id.Febrary23:
                    Intent r = new Intent(getApplicationContext(), Main4.class);
                    startActivity(r);
                    break;

                case R.id.Marta:
                    Intent t = new Intent(getApplicationContext(), Main5.class);
                    startActivity(t);
                    break;

                case R.id.Daytruda:
                    Intent y = new Intent(getApplicationContext(), Main6.class);
                    startActivity(y);
                    break;

                case R.id.Daywinner:
                    Intent u = new Intent(getApplicationContext(), Main7.class);
                    startActivity(u);
                    break;

                case R.id.DayRassia:
                    Intent o = new Intent(getApplicationContext(), Main9.class);
                    startActivity(o);
                    break;

                case R.id.button13:
                    Intent a = new Intent(getApplicationContext(), Main10.class);
                    startActivity(a);
                    break;

            }
        };


        NAZAD.setOnClickListener(onClickListener);
        Newyear2.setOnClickListener(onClickListener);
        Rogdestvo.setOnClickListener(onClickListener);
        Febrary23.setOnClickListener(onClickListener);
        Marta.setOnClickListener(onClickListener);
        Daytruda.setOnClickListener(onClickListener);
        Daywinner.setOnClickListener(onClickListener);
        DayRassia.setOnClickListener(onClickListener);
        button13.setOnClickListener(onClickListener);
    }


}