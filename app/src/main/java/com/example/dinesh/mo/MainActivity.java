package com.example.dinesh.mo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {


    Button but1;
    Button but2;

    public void init(){
        but1 = (Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //vibrator.vibrate(50);
                Intent toy = new Intent(MainActivity.this,secondactivity.class);
                startActivity(toy);
            }
        });
    }
    public void initi(){
        but2 = (Button)findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //vibrator.vibrate(50);
                Intent toy = new Intent(MainActivity.this,contact.class);
                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initi();
    }
}
