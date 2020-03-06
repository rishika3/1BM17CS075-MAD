package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText t1 = (EditText)findViewById(R.id.editText);
        final EditText t2 = (EditText)findViewById(R.id.editText2);
        final EditText t3 = (EditText)findViewById(R.id.editText3);

        Button b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                String s3 = t3.getText().toString();

                intent.putExtra("Name",s1);
                intent.putExtra("USN",s2);
                intent.putExtra("Branch",s3);

                startActivity(intent);

            }
        });

    }
}
