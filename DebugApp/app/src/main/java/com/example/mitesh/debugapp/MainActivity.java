package com.example.mitesh.debugapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText e1 ;
    EditText e2 ;
    TextView tv1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 =(EditText) findViewById(R.id.edit1);
        e2 =(EditText) findViewById(R.id.edit2);
   tv1 =(TextView) findViewById(R.id.myResult) ;

    }

    public void doAdd(View view) {
        Log.i("MainActivity", "Executed 1 ");
        int a1 = Integer.parseInt(e1.getText().toString());

        Log.i("MainActivity", "Executed 2 ");

        int a2 = Integer.parseInt(e2.getText().toString()) ;
        Log.i("MainActivity", "Executed 3 ");

        int result = a1 + a2 ;
        Log.i("MainActivity", "Executed 4 ");

        tv1.setText("" + result);
        Log.i("MainActivity", "Executed 5");

    }
}
