package com.example.andproject_thriftily;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragList = new ArrayList<>();
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragList.add(new AccountInActivity());
        fragList.add(new AccountOutActivity());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragList.get(position);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }
}
