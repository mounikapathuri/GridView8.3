package com.example.mounikapathuri.gridview83;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    public int [] mImages = {
            R.drawable.gingerbread,
            R.drawable.icecream,
            R.drawable.kitkat,
            R.drawable.jelly,
            R.drawable.honneycomb,
            R.drawable.lollipop,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.Images);
        gridView.setAdapter(new CustomAdapter(MainActivity.this,mImages));
    }
}
