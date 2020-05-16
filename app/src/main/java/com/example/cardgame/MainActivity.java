package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.editText);
    }

    public void startGame(View v){
        Intent i1 = new Intent(getApplicationContext(),Main2Activity.class);
        i1.putExtra("name", nameText.getText().toString());
        startActivity(i1);

    }
}
