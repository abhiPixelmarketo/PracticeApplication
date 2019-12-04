package com.veronica.anniapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.snackbar.Snackbar;

public class Main2Activity extends AppCompatActivity {

    Button btn,btn1;
    ToggleButton toggleButton;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.button1);
        btn1=findViewById(R.id.button2);
        toggleButton=findViewById(R.id.toggle);
        aSwitch=findViewById(R.id.switc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, "Button clicked", Toast.LENGTH_SHORT).show();
               // Snackbar.make(view,"clicked",Snackbar.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                // Snackbar.make(view,"clicked",Snackbar.LENGTH_SHORT).show();
            }
        });

        toggleButton.setTextOff("anni ka mood off hai ");
        toggleButton.setTextOn("ab thik ho gya");

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleButton.toggle();
                if(toggleButton.isActivated())
                    btn1.setVisibility(View.GONE);
                else
                    btn1.setVisibility(View.VISIBLE);
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    btn.setVisibility(View.GONE);
                else
                    btn.setVisibility(View.VISIBLE);
            }
        });

    }
}
