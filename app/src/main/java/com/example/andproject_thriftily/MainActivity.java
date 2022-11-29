package com.example.andproject_thriftily;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.widget.ListView;

import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Fragment1 mainFragment;
    Fragment2 dailyFragment;
    Fragment3 expensesFragment;
    BottomNavigationView bottom_menu;
    ListView dList;
    DailyAdapter dAdapter;
    ArrayList<daily> dArray;
    daily dItem;

    String

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new Fragment1();
        dailyFragment = new Fragment2();
        expensesFragment = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        bottom_menu = findViewById(R.id.bottom_menu);

        bottom_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
                        return true;
                    case R.id.tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, dailyFragment).commit();
                        return true;
                    case R.id.tab3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, expensesFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}