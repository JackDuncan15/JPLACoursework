package com.example.courseworkjplapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;

public class Register extends AppCompatActivity {
    EditText ET_Email,ET_Password,ET_ConfirmPassword;
    Button btn_RegisterAcc;
    FirebaseAuth mAuth;
    DatabaseReference usersRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ET_Email = (EditText)findViewById(R.id.edittxt_RegEmail);
        ET_Password = (EditText) findViewById(R.id.edittxt_RegPassword);
        ET_ConfirmPassword = (EditText) findViewById(R.id.edittxt_ConfirmPassword);
        usersRef = FirebaseDatabase.getInstance("https://fir-authentication25-85f05-default-rtdb.europe-west1.firebasedatabase.app/").getReference("users");
        mAuth = FirebaseAuth.getInstance();
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
                    if (Password.equals(Confirm)) {
                        mAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(task->{
                            if (task.isSuccessful()) {
                                FirebaseUser user = mAuth.getCurrentUser();
                                if (user != null){
                                    String uid = user.getUid();
                                    HashMap<String,Object> userData = new HashMap<>();
                                    userData.put("email",Email);
                                    userData.put("uid",uid);
                                    usersRef.child(uid).setValue(userData);
                                    Toast.makeText(Register.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(Register.this,LoginScreen.class);
                                    startActivity(i);
                                    finish();
                                }
                                else {
                                    Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                    else{
                        Toast.makeText(Register.this, "Passwords don't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}