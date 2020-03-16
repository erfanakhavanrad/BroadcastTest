package com.example.broadcasttest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestPagerAdapter extends FragmentPagerAdapter {
    public TestPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BlankFragment fragment = new BlankFragment();
                return fragment;
            case 1:
                BlankFragment fragment1 = new BlankFragment();
                return fragment1;
            case 2:
            BlankFragment fragment2 = new BlankFragment();
            return fragment2;
            default:
                BlankFragment fragment3 = new BlankFragment();
                return  fragment3;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "1";
            case 1:
                return "2";
            case 2:
                return "3";
            default:
                return  "unknown";
        }
    }
}
