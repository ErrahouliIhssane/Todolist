package com.example.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MyAdapter extends BaseAdapter {
     ArrayList liset;
    Context context;
    MyAdapter(ArrayList data ,Context context){
        this.liset=data;
        this.context=context;
    }
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
      public View getView(int i, View view01, ViewGroup viewGrop) {
            if (view01 == null) {
            view01 = LayoutInflater.from(context).inflate(R.layout.line_list, null);}
            TextView langueNom = view01.findViewById(R.id.tatile);
            TextView languetest = view01.findViewById(R.id.test);
            TextView languedate = view01.findViewById(R.id.date);
            CheckBox test = view01.findViewById(R.id.checkBox);

            HashMap<String, String> hm = (HashMap<String, String>) liset.get(i);
            test.setOnCheckedChangeListener((buttonView, isChecked) -> {
                buttonView.setChecked(isChecked);
            });
            languetest.setText(hm.get("description"));
            langueNom.setText(hm.get("nom"));
            languedate.setText(hm.get("endDate"));



            return view01;
    }
}
