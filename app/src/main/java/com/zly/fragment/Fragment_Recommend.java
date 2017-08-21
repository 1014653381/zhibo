package com.zly.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.zly.activity.PlayActivity;
import com.zly.adapter.Recommend_Rec_Adp;
import com.zly.bean.Hot;
import com.zly.fragment.base.BaseNetFragment;
import com.zly.listener.OnItemClickListener;
import com.zly.network.RetrofitManager;
import com.zly.network.api.LiveApi;
import com.zly.zhibo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import okhttp3.FormBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Recommend extends BaseNetFragment<Hot>{


    @BindView(R.id.recommend_rv)
    RecyclerView recommendRv;
    Unbinder unbinder;
    @BindView(R.id.refresh)
    MaterialRefreshLayout refresh;

    private int PAGE = 1;//页码

    private  int STATE;//定义不同的状态
    private final int NORM = 0;//当第一次加载数据的时的状态
    private final int PULL = 1;//当下拉刷新时的状态
    private final int UP = 2;//当上拉加载时的状态

    private Recommend_Rec_Adp recommend_rec_adp;
    List<Hot.ResultBean.ListBean> list = new ArrayList<>();


    @Override
    protected int getContentResId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initViews() {
        refresh.setLoadMore(true);
        recommendRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        recommend_rec_adp = new Recommend_Rec_Adp(getActivity(), list);
        recommend_rec_adp.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int i) {
                Intent intent = new Intent(getActivity(), PlayActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void loadData() {
        Log.d("aa","afds");
        LiveApi liveApi = RetrofitManager.getTestRetrofit().create(LiveApi.class);
        FormBody formBody = new FormBody.Builder()
                .add("type", "0")
                .add("page", PAGE +"")
                .build();
        Call<Hot> liveCall = liveApi.postLive(formBody);
        liveCall.enqueue(this);

    }

    @Override
    protected void processData(Hot hot) {
        goneLoading();
        init(hot);
    }

    public void init(Hot hot){

        list = hot.getResult().getList();
        if (list.size()==0){
            return;
        }
        switch (STATE){
            case NORM:
                recommend_rec_adp.refresh(list);
                recommendRv.setAdapter(recommend_rec_adp);
                break;
            case PULL:
                recommend_rec_adp.refresh(list);
                refresh.finishRefresh();
                break;
            case UP:
                recommend_rec_adp.loadMore(list);
                refresh.finishRefreshLoadMore();
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        refresh.setMaterialRefreshListener(new MaterialRefreshListener() {
            //下拉刷新
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                STATE = PULL;
                loadData();
            }

            //上拉加载
            @Override
            public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
                super.onRefreshLoadMore(materialRefreshLayout);
                PAGE+=1;
                STATE = UP;
                loadData();
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
