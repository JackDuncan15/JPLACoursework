package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button btn_Hiragana,btn_Katakana,btn_Dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Hiragana = (Button) findViewById(R.id.btn_Hiragana);
        btn_Hiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this, Hiragana_selection.class);
                startActivity(h);
            }
        });
        btn_Katakana = (Button) findViewById(R.id.btn_Katakana);
        btn_Katakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, Katakana.class);
                startActivity(k);
            }
        });
        btn_Dictionary = (Button) findViewById(R.id.btn_Dictionary);
        btn_Dictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, Dictionary.class);
                startActivity(d);
            }
        });
    }
}