package com.nemetologydept.nematodeinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;


public class Rice extends Activity {
    ListView list;
    String[] web = {
            "","","","","",""
    } ;
    Integer[] imageId = {
            R.drawable.rice,
            R.drawable.rice,
            R.drawable.rice,
            R.drawable.rice,
            R.drawable.rice,
            R.drawable.rice,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        custom_list adapter = new
                custom_list(Rice.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Rice.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}