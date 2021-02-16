package com.example.instaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    Button register2;
    Button login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        login2=findViewById(R.id.login);
        register2=findViewById(R.id.btnregister);

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this,"Login2 clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Signup.this,SignIn.class);
                startActivity(intent);
            }
        });

        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signup.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}