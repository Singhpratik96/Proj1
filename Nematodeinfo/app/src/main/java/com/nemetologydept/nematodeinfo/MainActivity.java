package com.nemetologydept.nematodeinfo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

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

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                    Intent i= new Intent(MainActivity.this,Rice.class);
                    startActivity(i);



            }
        });

    }

}