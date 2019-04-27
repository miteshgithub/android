 package com.example.mitesh.mymenu01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true ;
     }

     @Override

     public boolean onOptionsItemSelected(MenuItem item)
     {
         switch (item.getItemId())
         {
             case R.id.m1:
                 Toast.makeText(this,"You clicked settings", Toast.LENGTH_SHORT).show();
                 break ;

             case R.id.m2:
                 Toast.makeText(this,"You clicked mic", Toast.LENGTH_SHORT).show();
                 break ;

             case R.id.m3:
                Toast.makeText(this,"You clicked Status" , Toast.LENGTH_SHORT).show();
                 break ;
         }
        return true;
     }
 }


