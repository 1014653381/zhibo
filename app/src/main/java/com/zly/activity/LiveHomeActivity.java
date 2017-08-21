package com.zly.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.zly.activity.base.BaseActivity;
import com.zly.fragment.Fragment_Live;
import com.zly.fragment.Fragment_Me;
import com.zly.fragment.Fragment_Room;
import com.zly.zhibo.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LiveHomeActivity extends BaseActivity {


    @BindView(R.id.vp_live_home)
    ViewPager vpLiveHome;
    @BindView(R.id.rb_home_live)
    RadioButton rbHomeLive;
    @BindView(R.id.img_home)
    ImageView imgHome;
    @BindView(R.id.rb_home_me)
    RadioButton rbHomeMe;

    private ArrayList<Fragment> listFragment;
    private Fragment_Live fragment_live;
    private Fragment_Room fragment_room;
    private Fragment_Me fragment_me;

    @Override
    protected void initTitleBar(HeaderBuilder builder) {
        builder.goneToolbar();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected int getContentResId() {
        return R.layout.activity_live_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.bind(this);
        init();
    }

    private void init() {
        fragment_live = new Fragment_Live();
        fragment_me = new Fragment_Me();
        fragment_room = new Fragment_Room();
        listFragment = new ArrayList<>();
        listFragment.add(fragment_live);
        listFragment.add(fragment_room);
        listFragment.add(fragment_me);

        vpLiveHome.setCurrentItem(0);
        rbHomeLive.setChecked(true);

        vpLiveHome.setAdapter(new MyAdapter(getSupportFragmentManager()));

        vpLiveHome.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0){
                    rbHomeLive.setChecked(true);
                }else if(position ==1){
                    rbHomeLive.setChecked(false);
                    rbHomeMe.setChecked(false);
                }else if(position ==2){
                    rbHomeMe.setChecked(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @OnClick({R.id.rb_home_live,R.id.img_home,R.id.rb_home_me})

    public void showView(View view){
        switch (view.getId()){
            case R.id.rb_home_live:
                vpLiveHome.setCurrentItem(0);
                break;
            case R.id.img_home:
                vpLiveHome.setCurrentItem(1);
                rbHomeLive.setChecked(false);
                rbHomeMe.setChecked(false);
                break;
            case R.id.rb_home_me:
                vpLiveHome.setCurrentItem(2);
                break;
        }
    }


    class MyAdapter extends FragmentPagerAdapter{
        public MyAdapter(FragmentManager fm) {
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
    }
}
