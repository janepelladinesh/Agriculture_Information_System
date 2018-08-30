package com.example.dinesh.mo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class tinfo extends AppCompatActivity {


    ImageView imageview;
    PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinfo);
    imageview=(ImageView)findViewById(R.id.imageview);
        mAttacher= new PhotoViewAttacher(imageview);

    }
}
