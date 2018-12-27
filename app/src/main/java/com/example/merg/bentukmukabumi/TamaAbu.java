package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TamaAbu extends AppCompatActivity {

    public void pergitamaabu (View view){
        Intent intent = new Intent(getApplicationContext(),TamaabuMap.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamaabu);
    }
}
