package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class profile1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);
        getSupportActionBar().hide();
        ImageView img=findViewById(R.id.offers);
        Button button=findViewById(R.id.button);
        img.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),profile2.class));
        });
        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),book_session.class));
        });
    }

}