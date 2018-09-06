package com.example.sharjeel.scrollabletabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

}

class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
        Log.d("Android","getItem is called");
        if(i==0){
        fragment = new FragmentA();
        }
        if(i==1){
            fragment = new FragmentB();
        }
        if(i==2){
            fragment = new FragmentC();
        }
        if(i==3){
            fragment = new FragmentD();
        }
        if(i==4){
            fragment = new FragmentE();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        Log.d("Count","Counting Fragment");
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Tab 1";
        }
        if(position==1){
            return "Tab 2";
        }
        if(position==2){
            return "Tab 3";
        }
        if(position==3){
            return "Tab 4";
        }
        if(position==4){
            return "Tab 5";
        }
        return null;

    }
}