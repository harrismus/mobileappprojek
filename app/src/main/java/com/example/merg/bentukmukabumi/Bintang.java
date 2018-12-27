package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Bintang extends AppCompatActivity {

    public void pergibintang (View view){
        Intent intent = new Intent(getApplicationContext(),BintangMap.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bintang);
    }
}
