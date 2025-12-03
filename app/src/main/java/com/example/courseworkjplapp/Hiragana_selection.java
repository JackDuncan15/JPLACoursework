package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class Hiragana_selection extends AppCompatActivity {
    MaterialButton btn_a,btn_k,btn_s,btn_t,btn_n,btn_h,btn_m,btn_y,btn_r,btn_combo,btn_w,btn_var;
    boolean flag_a,flag_k,flag_s,flag_t,flag_n,flag_h,flag_m,flag_y,flag_r,flag_w,flag_combo,flag_var;
    Button btn_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana_selection);
        btn_a = (MaterialButton) findViewById(R.id.btn_a);
        btn_k = (MaterialButton) findViewById(R.id.btn_k);
        btn_s = (MaterialButton) findViewById(R.id.btn_s);
        btn_t = (MaterialButton) findViewById(R.id.btn_t);
        btn_n = (MaterialButton) findViewById(R.id.btn_n);
        btn_h = (MaterialButton) findViewById(R.id.btn_h);
        btn_m = (MaterialButton) findViewById(R.id.btn_m);
        btn_y = (MaterialButton) findViewById(R.id.btn_y);
        btn_r = (MaterialButton) findViewById(R.id.btn_r);
        btn_combo = (MaterialButton) findViewById(R.id.btn_combo);
        btn_w = (MaterialButton) findViewById(R.id.btn_w);
        btn_var = (MaterialButton) findViewById(R.id.btn_variants);

        btn_a.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_k.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_s.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_t.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_n.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_h.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_m.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_y.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_r.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_combo.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_w.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_var.setBackgroundColor(Color.parseColor("#0077CC"));

        btn_continue = findViewById(R.id.btn_continue);
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_a.setSelected(!btn_a.isSelected());
                if (btn_a.isSelected()){
                    btn_a.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_a.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_a = !flag_a;
            }
        });
        btn_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_k.setSelected(!btn_k.isSelected());
                if (btn_k.isSelected()){
                    btn_k.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_k.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_k = !flag_k;
            }
        });
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_s.setSelected(!btn_s.isSelected());
                if (btn_s.isSelected()){
                    btn_s.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_s.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_s = !flag_s;
            }
        });
        btn_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_t.setSelected(!btn_t.isSelected());
                if (btn_t.isSelected()){
                    btn_t.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_t.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_t = !flag_t;
            }
        });
        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_n.setSelected(!btn_n.isSelected());
                if (btn_n.isSelected()){
                    btn_n.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_n.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_n = !flag_n;
            }
        });
        btn_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_h.setSelected(!btn_h.isSelected());
                if (btn_h.isSelected()){
                    btn_h.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_h.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_h = !flag_h;
            }
        });
        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_m.setSelected(!btn_m.isSelected());
                if (btn_m.isSelected()){
                    btn_m.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_m.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_m = !flag_m;
            }
        });
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_y.setSelected(!btn_y.isSelected());
                if (btn_y.isSelected()){
                    btn_y.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_y.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_y = !flag_y;
            }
        });
        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_r.setSelected(!btn_r.isSelected());
                if (btn_r.isSelected()){
                    btn_r.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_r.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_r = !flag_r;
            }
        });
        btn_combo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_combo.setSelected(!btn_combo.isSelected());
                if (btn_combo.isSelected()){
                    btn_combo.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_combo.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_combo = !flag_combo;
            }
        });
        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_w.setSelected(!btn_w.isSelected());
                if (btn_w.isSelected()){
                    btn_w.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_w.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_w = !flag_w;
            }
        });
        btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_var.setSelected(!btn_var.isSelected());
                if (btn_var.isSelected()){
                    btn_var.setBackgroundColor(Color.parseColor("#D4AF37"));
                }
                else{
                    btn_var.setBackgroundColor(Color.parseColor("#0077CC"));
                }
                flag_var = !flag_var;
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Hiragana> RunningList = new ArrayList<>();
                ArrayList<String> selectedGroups = new ArrayList<>();
                ArrayList<String> selectedTypes = new ArrayList<>();
                selectedTypes.add("base");
                if(flag_combo) selectedTypes.add("combo");
                if(flag_var) selectedTypes.add("variant");
                if(flag_var && flag_combo)  selectedTypes.add("combo-variant");
                if(flag_a) selectedGroups.add("vowel");
                if(flag_k) selectedGroups.add("k");
                if(flag_s) selectedGroups.add("s");
                if(flag_t) selectedGroups.add("t");
                if(flag_n) selectedGroups.add("n");
                if(flag_h) selectedGroups.add("h");
                if(flag_m) selectedGroups.add("m");
                if(flag_y) selectedGroups.add("y");
                if(flag_r) selectedGroups.add("r");
                if(flag_w) selectedGroups.add("w");
                for(Hiragana h : Hiragana.Master_List){
                    if(selectedTypes.contains(h.getType()) && selectedGroups.contains(h.getGroup())){
                        RunningList.add(h);
                    }
                }
                System.out.println("Groups = " + selectedGroups);
                System.out.println("Types = " + selectedTypes);
                System.out.println("Filtered = " + RunningList.size());
                Intent intent = new Intent(Hiragana_selection.this,Hiragana_Quiz.class);
                intent.putParcelableArrayListExtra("RunningList",RunningList);
                startActivity(intent);
            }
        });
    }
}