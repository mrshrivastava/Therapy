package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Button viewprof=findViewById(R.id.profview);
        viewprof.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),profile1.class));
        });
    }
}