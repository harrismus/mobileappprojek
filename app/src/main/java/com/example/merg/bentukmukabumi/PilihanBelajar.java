package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PilihanBelajar extends AppCompatActivity {

    public void gotobanjaran (View view){
        Intent intent = new Intent(getApplicationContext(),Banjaran.class);
        startActivity(intent);
    }

    public void gotodataran (View view){
        Intent intent = new Intent(getApplicationContext(),Dataran.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_belajar);
    }
}
