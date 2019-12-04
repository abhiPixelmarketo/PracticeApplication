package com.veronica.test_application;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.veronica.test_application.R.color.brightColour;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        progressBar=findViewById(R.id.progress_horizontal);


        Thread thread =new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);

                    Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                    for (int i=0;i<=100;i=i+5){
                        sleep(30);
                        progressBar.setProgress(i);
                    }
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }


}


