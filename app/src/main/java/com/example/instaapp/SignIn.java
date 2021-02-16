package com.example.instaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    //private Object SignIn;
    Button SignIn;
    Button register1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // getSupportActionBar().setTitle("Sign In");

        SignIn = findViewById(R.id.btnregister);
        register1=findViewById(R.id.register);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Signin clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignIn.this, MainActivity.class);
                startActivity(intent);
            }
        });
        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn.this,Signup.class);
                startActivity(intent);
            }
        });

    }
}

