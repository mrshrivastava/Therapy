package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class landing_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        getSupportActionBar().hide();
    }
}