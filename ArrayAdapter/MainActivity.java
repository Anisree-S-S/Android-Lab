package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;
    String courseList[]={"c","ds","dbms","python","java","os","cd","ad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView=(ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_view, R.id.itemTestView,courseList);

        simpleListView.setAdapter(arrayAdapter);
    }
}