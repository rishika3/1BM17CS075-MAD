package com.example.lab2_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity3 extends AppCompatActivity {
    EditText e1,e2;
    Spinner s;
    Button b;
    String [] dept_a = {"CSE", "ISE", "ME", "EEE", "TCE", "ECE", "ML"};
    String name,reg,dept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.n);
        e2 = (EditText) findViewById(R.id.u);
        b = (Button) findViewById(R.id.button);
        s = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity3.this, android.R.layout.simple_spinner_item, dept_a);
        s.setAdapter(adapter);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                name = e1.getText().toString();
                reg = e2.getText().toString();
                dept = s.getSelectedItem().toString();

                Intent i = new Intent(MainActivity3.this, SecondActivity3.class);
                i.putExtra("n", name);
                i.putExtra("r", reg);
                i.putExtra("d", dept);
                startActivity(i);


            }
        });

    }
}
