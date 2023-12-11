package com.example.travel_app;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import androidx.cardview.widget.CardView;



import java.io.IOException;

import java.util.List;




public class AppUI extends AppCompatActivity {

    private EditText searchEditText;
    //private static final String TAG = AppUI.class.getSimpleName();
    private ImageView home;
     ImageView dashboard;
    private ImageView profile;
    private ImageView like;
     ImageView hot;

CardView f;
    //private OkHttpClient client;
     ImageView attractions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_ui);

        searchEditText = findViewById(R.id.searchEditText);
        home = findViewById(R.id.home1);
        dashboard = findViewById(R.id.dash);
        profile = findViewById(R.id.profile);
        like = findViewById(R.id.like);
        hot = findViewById(R.id.hotel);
        attractions = findViewById(R.id.attraction);
        //client = new OkHttpClient();
        f=findViewById(R.id.fes);

        f.setOnClickListener(v -> {
            Intent intent = new Intent(AppUI.this, FES.class);
            startActivity(intent);
        });
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppUI.this, Attractions.class);
                startActivity(intent);
            }
        });
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppUI.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }
    public void nature (View view){
        startActivity(new Intent(this, hotel.class));
    }
}



//    private void searchLocation(String location) {
//        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://nominatim.openstreetmap.org/search").newBuilder();
//        urlBuilder.addQueryParameter("q", location);
//        urlBuilder.addQueryParameter("format", "json");
//        String url = urlBuilder.build().toString();
//
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//
////        client.newCall(request).enqueue(new Callback() {
////            @Override
////            public void onFailure(Call call, IOException e) {
////                e.printStackTrace();
////                runOnUiThread(new Runnable() {
////                    @Override
////                    public void run() {
////                        Toast.makeText(AppUI.this, "An error occurred", Toast.LENGTH_SHORT).show();
////                    }
////                });
////            }
////
////            @Override
//////            public void onResponse(Call call, Response response) throws IOException {
//////                final String responseData = response.body().string();
//////                runOnUiThread(new Runnable() {
//////                    @Override
//////                    public void run() {
//////                        // Traitez la réponse ici
//////                        Log.d("responseData", responseData);
//////                    }
//////                });
////            }
////        });
////    }
//
//
//        }}




