package com.example.travel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText email,psw;
    ImageView btnlogg,btnreg;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email=findViewById(R.id.EditText2);
        psw=findViewById(R.id.EditText3);
        btnlogg=findViewById(R.id.btnlogg);
        btnreg=findViewById(R.id.imageView3);
        btnlogg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email,password;
                Email=email.getText().toString();
                password=psw.getText().toString();
                if(Email.equals("") || password.equals("")){
                    Toast.makeText(RegisterActivity.this,"please fill all the fields",Toast.LENGTH_LONG).show();
                }
                else{
                    if(dbHelper.checkUserEmail(Email)){
                        Toast.makeText(RegisterActivity.this,"User already exists",Toast.LENGTH_LONG).show();
                        return;
                    }
                    boolean registredSuccess= dbHelper.insertData(Email,password);
                    if(registredSuccess){
                        Toast.makeText(RegisterActivity.this,"User Registered successfully",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(RegisterActivity.this,"User Registration failed",Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
}