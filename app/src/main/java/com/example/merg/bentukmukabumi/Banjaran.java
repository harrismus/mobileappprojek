package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Banjaran extends AppCompatActivity {

    public void goToTitiwangsa (View view){
        Intent intent = new Intent(getApplicationContext(),Titiwangsa.class);
        startActivity(intent);
    }

    public void goToTahan (View view){
        Intent intent = new Intent(getApplicationContext(),Tahan.class);
        startActivity(intent);
    }

    public void goToCrocker (View view){
        Intent intent = new Intent(getApplicationContext(),Crocker.class);
        startActivity(intent);
    }

    public void goToTamaAbu (View view){
        Intent intent = new Intent(getApplicationContext(),TamaAbu.class);
        startActivity(intent);
    }

    public void goToBintang (View view){
        Intent intent = new Intent(getApplicationContext(),Bintang.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banjaran);
    }
}
