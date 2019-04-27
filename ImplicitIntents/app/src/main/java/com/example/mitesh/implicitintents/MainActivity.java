package com.example.mitesh.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {

        switch (view.getId()) {
            case R.id.b1:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thenewsocean.com"));
                startActivity(i1);
                break;
            case R.id.b2:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9998782510"));
                startActivity(i2);
                break;
            case R.id.b3:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:19.0760,72.8777  "));
                startActivity(i3);
                break;
        }

    }

}
