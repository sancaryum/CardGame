package com.example.cardgame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    Intent i2;
    TextView enter;
    Intent receiverIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        enter = findViewById(R.id.enter);
        receiverIntent = getIntent();
        GridLayout gl =  findViewById(R.id.kartlar);
        for(int j=0;j<10;j++)
            gl.addView(new card(this));


    }
}
