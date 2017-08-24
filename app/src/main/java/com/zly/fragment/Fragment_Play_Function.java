package com.zly.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.nostra13.universalimageloader.utils.L;
import com.zly.adapter.Play_Gift_Grid_Adp;
import com.zly.adapter.Play_Gift_Pager_Adp;
import com.zly.adapter.Play_Recycler_Hor;
import com.zly.adapter.Play_Recycler_Ver;
import com.zly.bean.Gift;
import com.zly.fragment.base.BaseFragment;
import com.zly.zhibo.R;

import org.dync.giftlibrary.widget.CustormAnim;
import org.dync.giftlibrary.widget.GiftControl;
import org.dync.giftlibrary.widget.GiftModel;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/8/19 0019.
 */

public class Fragment_Play_Function extends BaseFragment implements View.OnClickListener {

    @BindView(R.id.play_ll_person_info)
    LinearLayout playLlPersonInfo;
    @BindView(R.id.play_recycler_hor)
    RecyclerView playRecyclerHor;
    @BindView(R.id.play_tv_number)
    TextView playTvNumber;
    @BindView(R.id.play_tv_duration)
    TextView playTvDuration;
    @BindView(R.id.play_tv_date)
    TextView playTvDate;
    @BindView(R.id.play_recycler_ver)
    RecyclerView playRecyclerVer;
    Unbinder unbinder;
    @BindView(R.id.play_fun_iv_pub)
    ImageView playFunIvPub;
    @BindView(R.id.play_fun_iv_gift)
    ImageView playFunIvGift;
    @BindView(R.id.play_fun_iv_music)
    ImageView playFunIvMusic;
    @BindView(R.id.play_fun_iv_close)
    ImageView playFunIvClose;
    @BindView(R.id.play_fun_rl)
    RelativeLayout playFunRl;

    GridView gridView;
    PopupWindow window;
    ViewPager viewPager;
    View popupView;
    GiftControl giftControl;

    List<Gift.GiftListBean> list;
    List<View> gridViewList;
    ArrayList<String> list0;

    Play_Gift_Pager_Adp play_gift_pager_adp;
    Play_Recycler_Ver play_recycler_ver;

    int page;
    String Et;
    private Context mcontext;
    double pageSize = 9.0;

    @BindView(R.id.play_fun_ll)
    LinearLayout playFunLl;
    @BindView(R.id.play_fun_et)
    EditText playFunEt;
    @BindView(R.id.play_fun_bt)
    Button playFunBt;

    public Fragment_Play_Function() {
    }

    @Override
    protected int getContentResId() {
        return R.layout.fragment_play_function;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        play_recycler_ver = new Play_Recycler_Ver(mcontext,"周立洋",list0);
        playRecyclerHor.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        playRecyclerHor.setAdapter(new Play_Recycler_Hor());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setStackFromEnd(true);
        linearLayoutManager.setReverseLayout(true);
        playRecyclerVer.setLayoutManager(linearLayoutManager);
        playRecyclerVer.setAdapter(play_recycler_ver);
        playRecyclerVer.smoothScrollToPosition(list0.size());
        playFunIvPub.setOnClickListener(this);
        playFunIvGift.setOnClickListener(this);
        playFunIvMusic.setOnClickListener(this);
        playFunIvClose.setOnClickListener(this);
        playFunBt.setOnClickListener(this);
        mcontext = getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        giftControl = new GiftControl(getActivity());
        giftControl.setGiftLayout(false, playFunLl, 3);
        giftControl.setCustormAnim(new CustormAnim());
        list0 = new ArrayList<>();
        for(int i=0;i<16;i++){
            list0.add(":这主播长忒俊了!");
        }
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play_fun_iv_pub://弹出弹幕
                showEdit();
                break;
            case R.id.play_fun_iv_gift://礼物popupwindow
                showgift();
                break;
            case R.id.play_fun_iv_music://点赞

                break;
            case R.id.play_fun_iv_close://退出
                showClosedialog();
                break;
            case R.id.play_fun_bt://发送弹幕
                add();
                break;
        }
    }

    //礼物popupwindow
    public void showgift() {
        // TODO: 2016/5/17 构建一个popupwindow的布局
        popupView = getActivity().getLayoutInflater().inflate(R.layout.play_gift, null);
        viewPager = popupView.findViewById(R.id.play_gift_vp);
        // TODO: 2016/5/17 创建PopupWindow对象，指定宽度和高度
        window = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT, 400);
        // TODO: 2016/5/17 设置动画
        window.setAnimationStyle(R.style.popup_window_anim);
        // TODO: 2016/5/17 设置背景颜色
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80000000")));
        // TODO: 2016/5/17 设置可以获取焦点
        window.setFocusable(true);
        // TODO: 2016/5/17 设置可以触摸弹出框以外的区域
        window.setOutsideTouchable(true);
        // TODO：更新popupwindow的状态

        window.update();
        View rootview = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_play_function, null);
        window.showAtLocation(rootview, Gravity.BOTTOM, 0, 0);
        initData();
        setGridview();
    }


    private void setGridview() {
        page = (int) Math.ceil(list.size() / pageSize);
        gridViewList = new ArrayList<View>();
        for (int i = 0; i < page; i++) {
            gridView = new GridView(mcontext);
            gridView.setAdapter(new Play_Gift_Grid_Adp(mcontext, list, i, pageSize));
            gridView.setGravity(Gravity.CENTER);
            gridView.setClickable(true);
            gridView.setFocusable(true);
            gridView.setNumColumns(3);
            gridView.setHorizontalSpacing(10);
            gridView.setVerticalSpacing(10);
            gridViewList.add(gridView);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Log.d("aaa", "listener");
                    GiftModel giftModel = new GiftModel();
                    giftModel.setGiftId(list.get(i).getGiftName());
                    giftModel.setGiftName(list.get(i).getGiftName());
                    giftModel.setGiftCount(1);
                    giftModel.setGiftPic(list.get(i).getGiftPic());
                    giftModel.setGiftPrice(list.get(i).getGiftPrice());
                    giftModel.setSendUserName("周立洋");
                    giftModel.setSendUserPic("https://raw.githubusercontent.com/DyncKathline/LiveGiftLayout/master/giftlibrary/src/main/assets/p/000.png");
                    giftModel.setCurrentStart(false);
                    giftModel.setSendUserId("1234");
                    giftModel.setSendGiftTime(System.currentTimeMillis());
                    giftModel.setHitCombo(0);
                    giftControl.loadGift(giftModel);
                }
            });
        }
        play_gift_pager_adp = new Play_Gift_Pager_Adp(gridViewList);
        viewPager.setAdapter(play_gift_pager_adp);
    }

    //加载礼物数据
    public void initData() {
        try {
            InputStream inputStream = getActivity().getAssets().open("gift.json");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            Gson gson = new Gson();
            Gift gift = gson.fromJson(inputStreamReader, Gift.class);
            list = new ArrayList<>();
            list = gift.getGiftList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //弹出弹幕
    public void showEdit() {
        playFunRl.setVisibility(View.VISIBLE);
    }

    //发送弹幕
    public void add(){
        Et=playFunEt.getText().toString();
        L.d("aa",Et);
        if (!Et.equals("")) {
            play_recycler_ver.addData(list0.size(), "周立洋" + ":" + Et);
            playFunEt.setText("");
            playFunRl.setVisibility(View.GONE);
            playRecyclerVer.smoothScrollToPosition(list0.size());
        }else{
            Toast.makeText(mcontext,"输入的弹幕不能为空!",Toast.LENGTH_SHORT).show();
        }
    }

    //退出
    public void showClosedialog() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("温馨提示");
        builder.setMessage("确定结束观看？");
        builder.setPositiveButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().finish();

            }
        });
        builder.setCancelable(false);
        builder.show();

    }

}
