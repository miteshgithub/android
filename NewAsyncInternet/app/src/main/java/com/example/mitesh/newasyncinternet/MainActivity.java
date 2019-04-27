package com.example.mitesh.newasyncinternet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ConnectToIntenet c1 ;
    static TextView t1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.myResult) ;
    }

    public void doSomething(View view)
    {
        c1 = new ConnectToIntenet(this);
        c1.execute("http://www.google.com") ;
    }
}
