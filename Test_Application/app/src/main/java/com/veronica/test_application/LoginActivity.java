package com.veronica.test_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button login,SignUp,About;
    EditText username,password;
    TextView ForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.logIn);
        username = findViewById(R.id.userName);
        password = findViewById(R.id.Password);
        ForgotPassword = findViewById(R.id.forgotPassword);
        SignUp = findViewById(R.id.signUp);
        About = findViewById(R.id.about);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                finish();
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
                finish();
            }
        });

        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ForgotPasswordActivity.class));
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AboutActivity.class));
            }
        });


    }
}
