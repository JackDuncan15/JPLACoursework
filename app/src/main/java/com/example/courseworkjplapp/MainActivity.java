package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {


    MaterialCardView cardHiragana,cardKatakana,cardDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardHiragana = findViewById(R.id.cardHiragana);
        cardKatakana = findViewById(R.id.cardKatakana);
        cardDictionary = findViewById(R.id.cardDictionary);
        cardHiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this, Hiragana_selection.class);
                startActivity(h);
            }
        });
        cardKatakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, Katakana_selection.class);
                startActivity(k);
            }
        });
        cardDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, Dictionary.class);
                startActivity(d);
            }
        });
    }
}