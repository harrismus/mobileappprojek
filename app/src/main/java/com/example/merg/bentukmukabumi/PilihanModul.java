package com.example.merg.bentukmukabumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class PilihanModul extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;

    private TextView textViewUserEmail;
    private Button buttonLogout;


    public void gotobelajar (View view){
        Intent intent = new Intent(getApplicationContext(),PilihanBelajar.class);
        startActivity(intent);
    }

    public void gotoaktiviti (View view){
        Intent intent = new Intent(getApplicationContext(),QuizActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_modul);

        firebaseAuth = FirebaseAuth.getInstance();

        //if (firebaseAuth.getCurrentUser() == null);{
          //  finish();
          // startActivity(new Intent(this, Login.class));
        //}

        FirebaseUser user = firebaseAuth.getCurrentUser();

        textViewUserEmail = (TextView) findViewById(R.id.textViewUserEmail);
        textViewUserEmail.setText("Hai " + user.getEmail() + " Sila pilih modul anda");

        buttonLogout = (Button) findViewById(R.id.buttonLogout);

        buttonLogout.setOnClickListener(this);

    }
    @Override
   public void onClick(View view) {
        if (view == buttonLogout)
        {
            firebaseAuth.signOut();
            finish();
           //startActivity(new Intent(this, Login.class));
        }

    }
}
