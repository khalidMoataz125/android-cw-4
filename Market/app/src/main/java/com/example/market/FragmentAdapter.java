package com.example.market;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.market.Fragment.FragmentOne;
import com.example.market.Fragment.FragmentThree;
import com.example.market.Fragment.FragmentTwo;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public FragmentAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
      switch (position){
          case 0:
          return new FragmentOne();
          case 1:
          return new FragmentTwo();
          case 2:
          return new FragmentThree();

      }

        return null;


    }



    @Override
    public int getCount() {
        return 3;
    }
}
