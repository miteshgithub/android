package com.example.mitesh.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","OnDestroy");
    }
}
