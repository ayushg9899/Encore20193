package com.example.encore2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class performances extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performances);

//        DisplayMetrics dm= new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//        int width=dm.widthPixels;
//        int height=dm.heightPixels;
//
//        getWindow().setLayout((int)(width*.9),(int)(height*.9));
    }
}
