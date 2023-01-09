package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
TextView page2txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        page2txt=findViewById(R.id.page2txt);
        Intent I=getIntent();
        String data=I.getStringExtra("title");
        page2txt.setText(data);
    }
}
