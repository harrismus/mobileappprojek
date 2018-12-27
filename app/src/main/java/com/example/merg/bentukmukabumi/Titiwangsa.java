package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Titiwangsa extends AppCompatActivity {

    public void gotopetatiti (View view){
        Intent intent = new Intent(getApplicationContext(),TitiwangsaMap.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titiwangsa);
    }
}
