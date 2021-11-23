package com.funtash.dingVpnn.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.funtash.dingVpnn.Fragments.HomeFragment;
import com.funtash.dingVpnn.Fragments.OptionFragment;
import com.funtash.dingVpnn.Fragments.SpeedTestFragment;
import com.funtash.dingVpnn.Fragments.StatsFragment;

public class HomeAdapter extends FragmentPagerAdapter {
    public HomeAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public HomeAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new HomeFragment();
            case 1: return new StatsFragment();
            case 2: return new OptionFragment();
            case 3: return new SpeedTestFragment();
            default:return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0)
        {
            title="Home";
        }
        if(position==1)
        {
            title="Stats";
        }
        if(position==2)
        {
            title="Options";
        }
        if (position==3){
            title="Speed Test";
        }
        return title;
    }
}
