package com.example.g.asyntaskexample;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase database;
    QuoteDataSource quoteDataSource = new QuoteDataSource(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherConnectionApi weatherConnectionApi = new WeatherConnectionApi();
        weatherConnectionApi.execute("hola");
    }
}
