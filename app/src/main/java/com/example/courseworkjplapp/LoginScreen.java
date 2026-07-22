package com.example.courseworkjplapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DatabaseError;
public class LoginScreen extends AppCompatActivity {
    EditText edittxt_Email,edittxt_Password;
    Button btn_Login,btn_Register;
    FirebaseAuth mAuth;
    DatabaseReference usersRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


        edittxt_Email = (EditText) findViewById(R.id.edittxt_Email);
        edittxt_Password = (EditText) findViewById(R.id.edittxt_Password);
        mAuth = FirebaseAuth.getInstance();
        usersRef = FirebaseDatabase.getInstance("https://fir-authentication25-85f05-default-rtdb.europe-west1.firebasedatabase.app/").getReference("users");

        btn_Register = (Button) findViewById(R.id.btn_Register);
        btn_Register.setBackgroundColor(Color.parseColor("#0077CC"));

        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginScreen.this,Register.class);
                startActivity(i);
            }
        });
        btn_Login = (Button) findViewById(R.id.btn_Login);
        btn_Login.setBackgroundColor(Color.parseColor("#0077CC"));
        btn_Login.setOnClickListener(view ->{
            String Email = edittxt_Email.getText().toString();
            String Password = edittxt_Password.getText().toString();

            if (Email.equals("")||Password.equals("")){
                Toast.makeText(this, "Fields are empty", Toast.LENGTH_SHORT).show();
            }
            else{
                mAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(task ->{
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                        String uid = user.getUid();
                        usersRef.child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String email = snapshot.child("email").getValue(String.class);
                                Intent i = new Intent(LoginScreen.this,MainActivity.class);
                                startActivity(i);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {
                                Toast.makeText(LoginScreen.this, "Error Login Fail", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                    else {
                        Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}