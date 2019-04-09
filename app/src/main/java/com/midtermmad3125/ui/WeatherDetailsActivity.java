package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.midtermmad3125.R;

public class WeatherDetailsActivity extends AppCompatActivity
{
    private TextView city;
    private TextView longitude;
    private TextView latitudes;
    private TextView min;
    private TextView max;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waether_details);
    }
}
