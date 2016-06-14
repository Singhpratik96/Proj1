package com.nemetologydept.nematodeinfo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import android.widget.GridView;


public class MainActivity extends Activity {
    GridView grid;
    String[] web = {
            "RICE","WHEAT","RAAGI","BAJRA"

    } ;
    int[] imageId = {
            R.drawable.rice,
            R.drawable.wheat,
            R.drawable.rice,
            R.drawable.rice


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.gridview);
        grid.setAdapter(adapter);




    }

}