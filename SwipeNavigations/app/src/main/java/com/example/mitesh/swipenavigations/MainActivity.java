package com.example.mitesh.swipenavigations;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout myTab ;
    ViewPager myPage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTab = (TabLayout)findViewById(R.id.myTabs);
        myPage = (ViewPager)findViewById(R.id.mypager);
        myPage.setAdapter(new MyownPagerAdapter(getSupportFragmentManager()));
        myTab.setupWithViewPager(myPage);

//        myTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                myPage.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });  // Why This Code?
    }

    class MyownPagerAdapter extends FragmentPagerAdapter{

        String data[] = {"Java", "Android", "Ios"};
        public MyownPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0 )
            {
                return new Java() ;
            }
            if(position == 1)
            {
                return new Android() ;
            }
            if(position == 2)
            {
                return new Ios();
            }
            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }


}
