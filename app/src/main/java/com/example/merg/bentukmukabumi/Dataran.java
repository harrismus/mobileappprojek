package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dataran extends AppCompatActivity {


    public void pergikedah (View view){
        Intent intent = new Intent(getApplicationContext(),Kedah.class);
        startActivity(intent);
    }
    public void goToLembah (View view){
        Intent intent = new Intent(getApplicationContext(),Lembah.class);
        startActivity(intent);
    }
    public void goToKelantan (View view){
        Intent intent = new Intent(getApplicationContext(),Kelantan.class);
        startActivity(intent);
    }
    public void goToRajang (View view){
        Intent intent = new Intent(getApplicationContext(),Rajang.class);
        startActivity(intent);
    }
    public void goToJohor (View view){
        Intent intent = new Intent(getApplicationContext(),Johor.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataran);
    }
}
