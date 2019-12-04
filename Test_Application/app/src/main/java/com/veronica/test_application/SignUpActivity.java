package com.veronica.test_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {

    EditText userName,password,password2;
    Button getData,singIn;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userName = findViewById(R.id.userNamesing);
        password = findViewById(R.id.passSing);
        password2 = findViewById(R.id.pass2Sing);

        getData = findViewById(R.id.submit);
        singIn =findViewById(R.id.singIn);




        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();
            }
        });

        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Log.d("TAG", "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    Log.d("TAG", "onAuthStateChanged:signed_out");
                }
                //updateUI(user);
            }
        };
    }
}
