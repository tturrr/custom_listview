package com.example.user.test_customlistview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    static final String [] LIST_MENU = {"LIST1","LIST2","LIST3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();


        listView = (ListView)findViewById(R.id.listview1);

        listView.setAdapter(adapter);



        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.msp),"오","111");




        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.msp),"앙앙","22");



        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.msp),"헬로우","33");


    }



}

