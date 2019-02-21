package com.example.bn000976322.timeout;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private Adapter adapter;
    private ViewPager viewPagerHomeFrag;
    private TabLayout tabLayoutHomeFrag;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View homefragview = inflater.inflate(R.layout.fragment_home,container,false);

        adapter = new Adapter(getChildFragmentManager());

        viewPagerHomeFrag = homefragview.findViewById(R.id.containerHomeFrag);

        tabLayoutHomeFrag = homefragview.findViewById(R.id.tabLayoutHomeFrag);

        viewPagerHomeFrag.setAdapter(adapter);

        viewPagerHomeFrag.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutHomeFrag));

        tabLayoutHomeFrag.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPagerHomeFrag));

        return homefragview;
    }

    static class Adapter extends FragmentPagerAdapter{

        public Adapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new HighlightsFragment();
                case 1:
                    return new NewsFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

}


