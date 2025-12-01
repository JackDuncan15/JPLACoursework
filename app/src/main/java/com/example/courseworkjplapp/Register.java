package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
public class Register extends AppCompatActivity {
    EditText ET_Email,ET_Password,ET_ConfirmPassword;
    Button btn_RegisterAcc;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);
        ET_Email = (EditText)findViewById(R.id.edittxt_RegEmail);
        ET_Password = (EditText) findViewById(R.id.edittxt_RegPassword);
        ET_ConfirmPassword = (EditText) findViewById(R.id.edittxt_ConfirmPassword);

        btn_RegisterAcc = (Button) findViewById(R.id.btn_RegisterAcc);
        btn_RegisterAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = ET_Email.getText().toString();
                String Password = ET_Password.getText().toString();
                String Confirm = ET_ConfirmPassword.getText().toString();

                if (Email.equals("")||Password.equals("")||Confirm.equals("")){
                    Toast.makeText(Register.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (Password.equals(Confirm)){
                        Boolean checkEmail = db.checkEmail(Email);
                        if (checkEmail==false){
                            Boolean insert = db.insert(Email,Password);
                            if (insert == true) {
                                Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(Register.this,LoginScreen.class);
                                startActivity(i);
                            }
                            else{
                                Toast.makeText(Register.this, "Not Registered", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Register.this, "User already exists", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(Register.this, "Passwords don't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}