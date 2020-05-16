package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

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
        enter.setText(receiverIntent.getStringExtra("name"));
        i2 = new Intent(getApplicationContext(),Main3Activity.class);
        GridLayout gl = findViewById(R.id.kartlar);
        for(int j=0;j<10;j++)
            gl.addView(new card(this));


    }
}
