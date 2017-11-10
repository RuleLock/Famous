package com.locker.famous;

import android.app.Activity;
import android.os.Bundle;

import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;


/**
 * Created by dell on 2017/11/9.
 */

public class star extends Activity {

    public StatItem statItem;
    public AttributeSet attributes;
    public ArrayList<Integer> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linear);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView)findViewById(R.id.srcoll);
        linearLayout.hasFocus();
        list = new ArrayList<>();
        list.add(R.drawable.chen1);
        list.add(R.drawable.chen2);
        list.add(R.drawable.chen3);
        list.add(R.drawable.chen4);
        list.add(R.drawable.chen5);
        for (int i = 0;i<5;i++){
            statItem = new StatItem(this);
            statItem.setimage().setImageResource(list.get(i));
            statItem.setTextView().setText("No."+i);
            linearLayout.addView(statItem,i);
        }
        ArrayList<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("axx");
        list.add("bbc");
        ListView listView = findViewById(R.id.listviews);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        GridView gridView =(GridView)findViewById(R.id.grid);
        ArrayList<HashMap<String,Object>> lstImageItem = new ArrayList<HashMap<String,Object>>();

        for (int i = 0;i<10;i++){
            HashMap<String,Object> hashMap =new HashMap<String,Object>();
            hashMap.put("IteamImage",R.drawable.devil);
            hashMap.put("IteamText","NO."+String.valueOf(i));
            lstImageItem.add(hashMap);

        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(this,lstImageItem,R.layout.item,
                new String[]{"IteamImage","IteamText"},new int[]{R.id.ItemImage,R.id.ItemText});

        gridView.setAdapter(simpleAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });
    }


}
