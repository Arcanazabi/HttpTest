package com.example.dl10.httptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView test = (TextView) findViewById(R.id.test1);
        googleHttpClient task = new googleHttpClient();
        task.execute();
        setContentView(R.layout.activity_main);

    }






}

