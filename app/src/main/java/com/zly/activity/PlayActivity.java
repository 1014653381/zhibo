package com.zly.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


import com.zly.activity.base.BaseActivity;
import com.zly.fragment.Fragment_Play_Empty;
import com.zly.fragment.Fragment_Play_Function;
import com.zly.zhibo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayActivity extends BaseActivity {

    @BindView(R.id.vp_play)
    ViewPager vpPlay;
    private List<Fragment> listFragment;

    @Override
    protected void initTitleBar(HeaderBuilder builder) {
        builder.goneToolbar();
    }

    @Override
    protected int getContentResId() {
        return R.layout.activity_play;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        initVariable();
        initData();
    }

    private void initVariable() {
        Fragment_Play_Empty fragment_play_empty = new Fragment_Play_Empty();
        Fragment_Play_Function fragment_play_function = new Fragment_Play_Function();

        listFragment = new ArrayList<>();
        listFragment.add(fragment_play_empty);
        listFragment.add(fragment_play_function);
    }

    private void initData() {
        vpPlay.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        vpPlay.setCurrentItem(1);
    }
    class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return listFragment.get(position);
        }

        @Override
        public int getCount() {
            return listFragment.size();
        }
    };
}
