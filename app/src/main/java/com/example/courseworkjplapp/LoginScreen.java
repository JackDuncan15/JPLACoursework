package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class LoginScreen extends AppCompatActivity {
    DatabaseHelper db;
    EditText edittxt_Email,edittxt_Password;
    Button btn_Login,btn_Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        db = new DatabaseHelper(this);

        edittxt_Email = (EditText) findViewById(R.id.edittxt_Email);
        edittxt_Password = (EditText) findViewById(R.id.edittxt_Password);

        btn_Register = (Button) findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginScreen.this,Register.class);
                startActivity(i);
            }
        });
        btn_Login = (Button) findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = edittxt_Email.getText().toString();
                String Password = edittxt_Password.getText().toString();

                if (Email.equals("")||Password.equals("")){
                    Toast.makeText(LoginScreen.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean checkEmail = db.checkEmail(Email);
                    if (checkEmail == true){
                        Toast.makeText(LoginScreen.this, "Email is correct", Toast.LENGTH_SHORT).show();
                        Boolean checkPassword = db.checkPassword(Email,Password);
                        if (checkPassword == true){
                            Toast.makeText(LoginScreen.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(LoginScreen.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(LoginScreen.this, "No account", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}