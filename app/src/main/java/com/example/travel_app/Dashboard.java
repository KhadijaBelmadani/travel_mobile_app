package com.example.travel_app;





import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
ImageView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        home=findViewById(R.id.home1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, AppUI.class);
                startActivity(intent);
            }
        });

        };



    public void nature (View view){
        startActivity(new Intent(this,natural_places.class));
    }

    public void emergency(View view) {
        startActivity(new Intent(this,emergency.class));
    }

//    public void mountains(View view) {
//        startActivity(new Intent(this,mountain.class));
//    }
//
    public void hotels(View view) {
        startActivity(new Intent(this,hotel.class));
    }
//
    public void beaches(View view) {
        startActivity(new Intent(this,beaches.class));
    }
//
    public void temple(View view) {
        startActivity(new Intent(this,Religious_places.class));
    }
//    public void instructions(View view) {
//        startActivity(new Intent(this,instructions.class));
//    }
//    public void waterfall(View view) {
//        startActivity(new Intent(this,waterfall.class));
//    }
//    public void logout (View view){
//        startActivity(new Intent(this,login.class));
//    }
}