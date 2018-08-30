package com.example.dinesh.mo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class winter extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;


    public void init(){
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent toy = new Intent(winter.this,winfo.class);
                startActivity(toy);
            }
        });
    }

    public void inity(){
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent toy = new Intent(winter.this,wplay.class);
                startActivity(toy);
            }
        });
    }

    public void initl(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent toy = new Intent(winter.this,wpes.class);
                startActivity(toy);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter);


        initl();
        init();
        inity();
    }
}
