package com.example.travel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
EditText email,psw;
ImageView btnlogg,btnreg;
DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.EditText2);
        psw=findViewById(R.id.EditText3);
        btnlogg=findViewById(R.id.imageView4);
        btnreg=findViewById(R.id.imageView6);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        btnlogg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isLoggedIn=dbHelper.checkUser(email.getText().toString(),psw.getText().toString());
                if(isLoggedIn){
                    Intent intent =new Intent(LoginActivity.this, dashboardActivitty.class);
                }
            }
        });

    }
}