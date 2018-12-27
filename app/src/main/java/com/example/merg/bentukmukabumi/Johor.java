package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Johor extends AppCompatActivity {

    public void pergijohor (View view){
        Intent intent = new Intent(getApplicationContext(),JohorMap.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_johor);
    }
}
