package com.example.newsapp_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

//
// FRAGMENT PAGER ADAPTER IS DEPRECATED, WE USE FRAGMENT STATE ADAPTER NOW WHICH IS GIVEN BELOW

//public class PagerAdapter extends FragmentPagerAdapter {
//
//
//
//    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//
//    }
//
//    public PagerAdapter(FragmentManager supportFragmentManager) {
//        super(supportFragmentManager);
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//
//      if (position==0){
//          return new HomeFragment();
//      }
//      else if (position==1){
//          return new SportsFragment();
//      } else if (position==2) {
//          return new HealthFragment();
//      } else if (position==3) {
//          return new ScienceFragment();
//      } else if (position==4) {
//          return  new EntertainmentFragment();
//      }else {
//          return  new TechFragment();
//      }
//
//
//
//
//
//    }
//
//    @Override
//    public int getCount() {
//        return 6; // returns number of tab in the layout
//    }
//
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//
//            if (position==0){
//                return "Home";
//            }
//            else if (position==1){
//                return "Sports";
//            } else if (position==2) {
//                return "Health";
//            } else if (position==3) {
//                return"Science";
//            } else if (position==4) {
//                return "Entertainment";
//            }else {
//                return  "Technology";
//            }
//
//        }
//    }


public class PagerAdapter extends FragmentStateAdapter{

public static String[] titles= new String[]{"Home","Sports","Health","Science","Entertainment","Technology"};
    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new SportsFragment();
        } else if (position == 2) {
            return new HealthFragment();
        } else if (position == 3) {
            return new ScienceFragment();
        } else if (position == 4) {
            return new EntertainmentFragment();
        } else {
            return new TechFragment();

        }

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}



