package com.gcraven.ga.listitemclickdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Item One");
        myList.add("Item Two");
        myList.add("Item Three");
        myList.add("Item Four");

        ListView myListView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                myList
        );

        myListView.setAdapter(myArrayAdapter);

        /**
         * DON'T USE A View.OnClickListener FOR THE LIST VIEW BECAUSE IT WILL CRASH THE APP.
         * uncomment this code if you want to debug why/how it crashes.
         */
//        myListView.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v){
//                Toast.makeText(MainActivity.this, "you clicked the list", Toast.LENGTH_SHORT).show();
//            }
//
//        });

    }
}
