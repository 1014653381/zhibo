package com.zly.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zly.zhibo.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/16.
 */

public class Fragment_Live extends Fragment{

    private TabLayout tabLayout;
    private ViewPager pager;
    private ArrayList<Fragment> listFragment;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_live, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tabLayout = view.findViewById(R.id.tab_live);
        pager = view.findViewById(R.id.vp_live);
        final String[] title = new String[] {"精品","热门"};

        Fragment_Recommend fragment_recommend = new Fragment_Recommend();
        Fragment_Hot fragment_hot = new Fragment_Hot();

        listFragment = new ArrayList<>();
        listFragment.add(fragment_recommend);
        listFragment.add(fragment_hot);
        pager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return  listFragment.get(position);
            }

            @Override
            public int getCount() {
                return listFragment.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return title[position];
            }
        });
        tabLayout.setupWithViewPager(pager);


    }

}
