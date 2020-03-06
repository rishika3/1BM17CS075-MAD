package com.example.lab2_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity3 extends AppCompatActivity {
    TextView t1,t2,t3;
    String name,reg,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (TextView) findViewById(R.id.name);
        t2 = (TextView) findViewById(R.id.usn);
        t3 = (TextView) findViewById(R.id.dept);
        Intent i = getIntent();
        name = i.getStringExtra("n");
        reg = i.getStringExtra("r");
        dept = i.getStringExtra("d");
        t1.setText(name);
        t2.setText(reg);
        t3.setText(dept);
    }
}
