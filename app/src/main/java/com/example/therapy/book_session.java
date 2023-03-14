package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class book_session extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_session);
        getSupportActionBar().hide();
        Button submit=findViewById(R.id.submit);
        EditText namefield=(EditText) findViewById(R.id.name);
        EditText phonefield=findViewById(R.id.phone);
        EditText agefield=findViewById(R.id.age);
        EditText genderfield=findViewById(R.id.gender);
        EditText maritalstatusfield=findViewById(R.id.marital_status);
        EditText domicilefield=findViewById(R.id.domicile);
        EditText educationfield=findViewById(R.id.education);
        EditText occupationfield=findViewById(R.id.occupation);
        EditText concernfield=findViewById(R.id.concern);







        submit.setOnClickListener(view -> {

            String name=namefield.getText().toString().trim();
            String phone=phonefield.getText().toString().trim();
            String age=agefield.getText().toString().trim();
            String gender=genderfield.getText().toString().trim();
            String marital=maritalstatusfield.getText().toString().trim();
            String domicile=domicilefield.getText().toString().trim();
            String edu=educationfield.getText().toString().trim();
            String occ=occupationfield.getText().toString().trim();
            String concern=concernfield.getText().toString().trim();
            Intent intent=new Intent(book_session.this,confirm_session.class);

            intent.putExtra("keyname",name);
            intent.putExtra("keyphone",phone);
            intent.putExtra("keyage",age);
            intent.putExtra("keygender",gender);
            intent.putExtra("keymarital",marital);
            intent.putExtra("keydomicile",domicile);
            intent.putExtra("keyedu",edu);
            intent.putExtra("keyocc",occ);
            intent.putExtra("keyconcern",concern);
            startActivity(intent);

        });
    }
}