package com.example.dinesh.mo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.Spinner;

public class secondactivity extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        spinner= (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        break;
                    case 1:

                        Intent toy = new Intent(secondactivity.this,tomato.class);
                        startActivity(toy);
                        break;
                    case 2:
                        Intent poy = new Intent(secondactivity.this,potato.class);
                        startActivity(poy);
                        break;
                    case 3:
                        Intent to = new Intent(secondactivity.this,brinjal.class);
                        startActivity(to);
                        break;
                    case 4:
                        Intent toyy = new Intent(secondactivity.this,carrot.class);
                        startActivity(toyy);
                        break;
                    case 5:
                        Intent top = new Intent(secondactivity.this,cabbage.class);
                        startActivity(top);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner2= (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        break;
                    case 1:

                        Intent toy = new Intent(secondactivity.this,summer.class);
                        startActivity(toy);
                        break;
                    case 2:
                        Intent poy = new Intent(secondactivity.this,winter.class);
                        startActivity(poy);
                        break;
                    case 3:
                        Intent to = new Intent(secondactivity.this,rainy.class);
                        startActivity(to);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
