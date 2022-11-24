package com.example.andproject_thriftily;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DailyAdapter extends BaseAdapter {
    Context aContext;
    ArrayList <daily> aData;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // listitem 레이아웃을 inflate
        if(view == null){
            view = View.inflate(aContext, R.layout.listitem, null);
        }
        TextView date=(TextView)view.findViewById(R.id.date);
        TextView content=(TextView) view.findViewById(R.id.content);
        TextView coast = (TextView) view.findViewById(R.id.coast);

        date.setText(aData.get(i).date);
        content.setText(aData.get(i).content);
        coast.setText(aData.get(i).coast);

        return view;
    }
}
