package com.developer.rohal.kotlin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        return new Tab1();
    }

  @Nullable
  @Override
   public CharSequence getPageTitle(int position) {
       String title = "";
       switch (position){
          case 0:
              title = "Tab1";
              break;
             case 1:
              title = "Tab2";
             break;
                case 2:
               title = "Tab3";
        }
        return title;
    }
}