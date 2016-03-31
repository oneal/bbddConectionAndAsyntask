package com.example.g.asyntaskexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WeatherDataHelper extends SQLiteOpenHelper {

    public WeatherDataHelper(Context context){
        super(context,QuoteDataSource.WEATHER_BBDD,null,QuoteDataSource.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(QuoteDataSource.TABLE_WEATHER_DATA);
    }

    public void insertWeatherDataHelper(WeatherModel weatherModel){
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("INSERT INTO "+QuoteDataSource.WEATHER_TABLE_NAME+
                " VALUES ("+weatherModel.getWeather()+", "+weatherModel.getWeathername()+
                ", "+weatherModel.getPressure()+", "+weatherModel.getTemp()+
                ", "+weatherModel.getHumidity()+")");

        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
