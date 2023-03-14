package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

public class confirm_session extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_session);
        getSupportActionBar().hide();
        String cname=getIntent().getStringExtra("keyname");
        String cphone=getIntent().getStringExtra("keyphone");
        String cage=getIntent().getStringExtra("keyage");
        String cgender=getIntent().getStringExtra("keygender");
        String cmarital=getIntent().getStringExtra("keymarital");
        String cdom=getIntent().getStringExtra("keydomicile");
        String cedu=getIntent().getStringExtra("keyedu");
        String cocc=getIntent().getStringExtra("keyocc");
        String ccon=getIntent().getStringExtra("keyconcern");


        EditText namefield=findViewById(R.id.name);
        EditText phonefield=findViewById(R.id.phone);
        EditText agefield=findViewById(R.id.age);
        EditText genderfield=findViewById(R.id.gender);
        EditText maritalstatusfield=findViewById(R.id.marital_status);
        EditText domicilefield=findViewById(R.id.domicile);
        EditText educationfield=findViewById(R.id.education);
        EditText occupationfield=findViewById(R.id.occupation);
        EditText concernfield=findViewById(R.id.concern);




        Button submit=findViewById(R.id.submit);

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





            String array1[]={name,phone,age,gender,marital,domicile,edu,occ,concern};
            String array2[]={cname,cphone,cage,cgender,cmarital,cdom,cedu,cocc,ccon};
            int check=0;
            for(int i=0; i<9; i++)
            {
                if(!array1[i].equalsIgnoreCase(array2[i]))
                {
                        check=1;
                        break;
                }
            }
            if(check==1)
            {
                Toast.makeText(this, "Details didn't match. Renter the details", Toast.LENGTH_SHORT).show();
            }
            else
            {

                dataholder obj=new dataholder(name, phone, age, gender, marital, domicile, edu,occ,concern);
                FirebaseDatabase db=FirebaseDatabase.getInstance();
                DatabaseReference node=db.getReference().child("customer");

                node.push().setValue(obj);

                Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
                namefield.setText(null);
                phonefield.setText(null);
                agefield.setText(null);
                genderfield.setText(null);
                domicilefield.setText(null);
                maritalstatusfield.setText(null);
                educationfield.setText(null);
                occupationfield.setText(null);
                concernfield.setText(null);


                Toast.makeText(this, "Booking Confirmed", Toast.LENGTH_LONG).show();

                startActivity(new Intent(getApplicationContext(),landing_page.class));



            }
        });


    }
}