package com.locker.famous;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/11/10.
 */

public class StatItem extends LinearLayout{

    private ImageView imageView;
    private TextView textView;
    private ArrayList<String> array;
    public StatItem(Context context){
        super(context);
        LayoutInflater.from(context).inflate(R.layout.stat_big_item,this,true);

        init();
    }
    public StatItem(Context context,AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.stat_big_item,this,true);
    }

    private void init() {
         imageView = (ImageView)findViewById(R.id.starimage);
         textView = (TextView)findViewById(R.id.startextview);
    }

    public ImageView setimage(){
        return imageView;
    }

    public TextView setTextView(){
        return textView;
    }

    public void setArray(ArrayList<String> array){
        this.array = array;

    }

    public void light(View view){

    }
}
