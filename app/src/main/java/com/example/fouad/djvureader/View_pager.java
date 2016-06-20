package com.example.fouad.djvureader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class View_pager extends FragmentActivity {

    ViewPager vp;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_view_pager);

         vp = (ViewPager) findViewById(R.id.pager);
         fm=getSupportFragmentManager();
         MyAdpter  adapter=new MyAdpter(fm);
         vp.setAdapter(adapter);



    }


    class MyAdpter extends FragmentPagerAdapter
    {

        public MyAdpter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return new Fragment1();
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
