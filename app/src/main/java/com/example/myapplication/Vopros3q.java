package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vopros3q extends AppCompatActivity {

    Button button21;
    Button button16;
    Button button17;
    Button button20;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros3q);


        button21 = (Button) findViewById(R.id.button21);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button20 = (Button) findViewById(R.id.button20);




        View.OnClickListener onClickListener = view -> {
            switch (view.getId()) {


                case R.id.button21:
                    Intent b = new Intent(getApplicationContext(), mainactivity.class);
                    startActivity(b);
                    break;

                case R.id.button16:
                    Intent r = new Intent(getApplicationContext(), Vopros3NePrav.class);
                    startActivity(r);
                    break;

                case R.id.button17:
                    Intent z = new Intent(getApplicationContext(), Vopros3NePrav.class);
                    startActivity(z);
                    break;

                case R.id.button20:
                    Intent n = new Intent(getApplicationContext(), Vopros3Prav.class);
                    startActivity(n);
                    break;





            }
        };


        button21.setOnClickListener(onClickListener);
        button16.setOnClickListener(onClickListener);
        button17.setOnClickListener(onClickListener);
        button20.setOnClickListener(onClickListener);


    }


}