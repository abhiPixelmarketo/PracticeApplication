package com.veronica.test_application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {



    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment =null;


        switch (position){

            case 0:
                fragment = new Fragment_Plants();
                break;
            case 1:
                fragment = new Fragment_Fish();
                break;
            case 2:
                fragment = new Fragment_Birds();
                break;
            case 3:
                fragment = new Fragment_Profile();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
