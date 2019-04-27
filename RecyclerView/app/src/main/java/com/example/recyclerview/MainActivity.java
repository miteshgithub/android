package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1 ;
    String s1[], s2[] ;
    int imageSource[] = {R.drawable.cat, R.drawable.dog_png_20, R.drawable.cow, R.drawable.buffalo_picture_thumb} ;

    MyOwnAdapter ad ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myRecycler);
        s1= getResources().getStringArray(R.array.pet_name);
        s2 = getResources().getStringArray(R.array.pet_desc);
        ad = new MyOwnAdapter(this,s1, s2, imageSource);

        r1.setAdapter(ad);
//        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
