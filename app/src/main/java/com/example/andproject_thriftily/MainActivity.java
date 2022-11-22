package com.example.andproject_thriftily;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLay;
    ViewPager viewPager;
    FragmentAdapter fragAdt;
    Fragment Fragment1;
    Fragment Fragment2;
    Fragment Fragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLay = findViewById(R.id.tabLay);
        viewPager = findViewById(R.id.viewPager);
        fragAdt = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragAdt);
        tabLay.setupWithViewPager(viewPager);
        tabLay.getTabAt(0).setText("입금 내역");
        tabLay.getTabAt(1).setText("지출 내역");

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR); //시스템 달력에서 년도 가져오기
        int month = cal.get(Calendar.MONTH); //시스템 달력에서 월(0부터 시작) 가져오기
        int day = cal.get(Calendar.DAY_OF_MONTH); //시스템 달력에서 일 가져오기
        //fileName = year+"_"+(month+1)+"_"+day+".txt"; //파일 이름 만들기 "년_월_일.txt"

        Fragment1 = new Fragment1();
        Fragment2 = new Fragment2();
        Fragment3 = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment1).commit();
    }
}