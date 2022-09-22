package com.example.andproject_thriftily;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_out);
    }
    public static String getToDay(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}