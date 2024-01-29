package com.openclassrooms.myamazingviewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.openclassrooms.myamazingviewpager.Controllers.Fragments.NewsPageFragment;
import com.openclassrooms.myamazingviewpager.Controllers.Fragments.ParamPageFragment;
import com.openclassrooms.myamazingviewpager.Controllers.Fragments.ProfilePageFragment;

public class PageAdapter extends FragmentPagerAdapter {

    // 1 - Array of colors that will be passed to PageFragment
    //private int[] colors;

    // 2 - Default Constructor
    public PageAdapter(FragmentManager mgr) {
        super(mgr);

    }

    @Override
    public int getCount() {
        return(3); // 3 - Number of page to show
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: //Page number 1
                return NewsPageFragment.newInstance();
            case 1: //Page number 2
                return ProfilePageFragment.newInstance();
            case 2: //Page number 3
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    // Return page title
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: //Page number 1
                return "Fil d'actualité";
            case 1: //Page number 2
                return "Profil";
            case 2: //Page number 3
                return "Paramètre";
            default:
                return null;
        }
    }
}
