package com.example.mounikapathuri.gridview83;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by mounikapathuri on 23-02-2018.
 */

class CustomAdapter extends BaseAdapter {
    private Context MContext;
    private int[] mImageid;
    LayoutInflater mInfaltor;

    public CustomAdapter(MainActivity mainActivity,int[]mImages){
        MContext=mainActivity;
        mImageid=mImages;
        mInfaltor= (LayoutInflater) MContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mImageid.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=mInfaltor.inflate(R.layout.images,viewGroup,false);

        ImageView imageView= (ImageView) view.findViewById(R.id.Versions);
        imageView.setImageResource(mImageid[i]);
        return view;
    }
}
