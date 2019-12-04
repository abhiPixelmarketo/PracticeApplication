package com.veronica.test_application;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView Fish, Profile, Birds, Plants;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Fish =findViewById(R.id.fish);
        Profile =findViewById(R.id.profile);
        Birds =findViewById(R.id.birds);
        Plants =findViewById(R.id.plant);

        viewPager=findViewById(R.id.fragment_container);


        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerViewAdapter);

        Plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPager.setCurrentItem(0);
            }
        });

        Fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPager.setCurrentItem(1);
            }
        });

        Birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPager.setCurrentItem(2);
            }
        });

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPager.setCurrentItem(3);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    onChangeTab(position);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int position) {
        if (position == 0)
        {
            Plants.setTextSize(25);
            Plants.setTextColor(getColor(R.color.brightColour));

            Fish.setTextSize(20);
            Fish.setTextColor(getColor(R.color.lightColour));

            Birds.setTextSize(20);
            Birds.setTextColor(getColor(R.color.lightColour));

            Profile.setTextSize(20);
            Profile.setTextColor(getColor(R.color.lightColour));

        }

        if (position == 1)
        {
            Plants.setTextSize(20);
            Plants.setTextColor(getColor(R.color.lightColour));

            Fish.setTextSize(25);
            Fish.setTextColor(getColor(R.color.brightColour));

            Birds.setTextSize(20);
            Birds.setTextColor(getColor(R.color.lightColour));

            Profile.setTextSize(20);
            Profile.setTextColor(getColor(R.color.lightColour));

        }

        if (position == 2)
        {
            Plants.setTextSize(20);
            Plants.setTextColor(getColor(R.color.lightColour));

            Fish.setTextSize(20);
            Fish.setTextColor(getColor(R.color.lightColour));

            Birds.setTextSize(25);
            Birds.setTextColor(getColor(R.color.brightColour));

            Profile.setTextSize(20);
            Profile.setTextColor(getColor(R.color.lightColour));

        }

        if (position == 3)
        {
            Plants.setTextSize(20);
            Plants.setTextColor(getColor(R.color.lightColour));

            Fish.setTextSize(20);
            Fish.setTextColor(getColor(R.color.lightColour));

            Birds.setTextSize(20);
            Birds.setTextColor(getColor(R.color.lightColour));

            Profile.setTextSize(25);
            Profile.setTextColor(getColor(R.color.brightColour));

        }

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "WTF you Want to exit ?", Toast.LENGTH_SHORT).show();;
    }
}
