package com.veronica.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Two = findViewById(R.id.two);

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),Main2Activity.class));

            }
        });


        Toast.makeText(this, "hiii", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "thhhisss", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onBackPressed() {
        onPause();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}

