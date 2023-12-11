package com.example.travel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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
        btnlogg=findViewById(R.id.imageView3);
        btnreg=findViewById(R.id.imageView4);
        dbHelper=new DBHelper(this);
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
                    Intent intent =new Intent(LoginActivity.this, AppUI.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"Loggin failed",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
