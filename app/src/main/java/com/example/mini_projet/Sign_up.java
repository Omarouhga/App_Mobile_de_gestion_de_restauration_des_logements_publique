package com.example.mini_projet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class Sign_up extends AppCompatActivity {

    EditText username_signup;
    EditText email;
    EditText password_signup;
    EditText repassword;

    Button sign_up_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username_signup = findViewById(R.id.username_signup);
        email = findViewById(R.id.email);
        sign_up_Button = findViewById(R.id.sign_up_Button);
        repassword = findViewById(R.id.repassword);
        password_signup = findViewById(R.id.password_signup);
    }
}