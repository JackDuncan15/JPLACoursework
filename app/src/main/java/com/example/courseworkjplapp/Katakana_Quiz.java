package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Katakana_Quiz extends AppCompatActivity {
    TextView txt_kana,txt_score;
    EditText txt_answer;
    Button btn_submit;
    int pointer = 0;
    int score = 0;
    int size = 0;
    boolean incorrect = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katakana_quiz);
        ArrayList<Katakana> RunningList = getIntent().getParcelableArrayListExtra("RunningList");
        Collections.shuffle(RunningList);
        size = RunningList.size();
        txt_kana = (TextView) findViewById(R.id.txt_kana);
        txt_score = (TextView) findViewById(R.id.txt_score);
        txt_answer = (EditText) findViewById(R.id.txt_answer);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        txt_score.setText(score + "/" + size);
        try {
            txt_kana.setText(RunningList.get(pointer).getKana());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt_answer.getText().toString().equals(RunningList.get(pointer).getRomaji())){
                    pointer++;
                    txt_kana.setText(RunningList.get(pointer).getKana());
                    txt_answer.setText("");
                    Toast.makeText(Katakana_Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                    if (incorrect == false){
                        score++;
                    }
                    incorrect = false;
                }
                else{
                    Toast.makeText(Katakana_Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    incorrect = true;
                }
                txt_score.setText(score + "/" + size);
            }
        });
    }
}