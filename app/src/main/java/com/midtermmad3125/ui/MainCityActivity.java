package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainCityActivity extends AppCompatActivity
{
    private TextView city;
    private TextView longitude;
    private TextView latitude;
    private TextView population;
    private Button displayWeather;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city=findViewById(R.id.textCity);
        longitude=findViewById(R.id.textlong);
        latitude=findViewById(R.id.textlat);
        population=findViewById(R.id.txtPpulation);
        displayWeather=findViewById(R.id.btnDisplay);

        displayWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainCityActivity.this,WeatherListActivity.class);
                startActivity(intent);
            }
        });

    }


}
