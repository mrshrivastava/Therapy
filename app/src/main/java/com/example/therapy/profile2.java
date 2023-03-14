package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class profile2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        getSupportActionBar().hide();
        Button button=findViewById(R.id.button);
        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),book_session.class));
        });
    }
}