package com.example.andproject_thriftily;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class DailyActivity extends AppCompatActivity {
    ListView dList = findViewById(R.id.list);
    DailyAdapter dAdapter;
    ArrayList<Daily> dArray;
    Daily dItem;

    String[] date={"11/24", "10/29", "10/15", "10/4", "9/24"};
    String[] content={"GS25편의점", "SM&STORE", "김밥천국", "LUSH(주)", "와플대학"};
    String[] coast={"5000", "1000000", "4000", "35000", "20000"};

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_activity);

        dArray = new ArrayList<Daily>();

        for (int i=0; i<date.length; i++){
            dItem = new Daily(date[i],content[i], coast[i]);
            dArray.add(dItem);
        }
        dAdapter = new DailyAdapter(this, dArray);
        dList.setAdapter(dAdapter);

        dList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Daily item=(Daily)dList.getItemAtPosition(i);
                String content = item.getContent();
                Toast.makeText(getApplicationContext(), content, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
