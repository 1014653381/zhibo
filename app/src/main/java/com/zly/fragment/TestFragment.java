package com.zly.fragment;

import android.os.Bundle;
import android.view.View;


import com.zly.network.RetrofitManager;
import com.zly.network.api.TestApi;
import com.zly.zhibo.R;

import retrofit2.Call;

/**
 * Created by xiaoyuan on 16/11/6.
 */

public class TestFragment extends com.zly.fragment.base.BaseNetFragment<Object> {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        goneLoading();
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadData() {
        com.zly.network.api.TestApi testApi = RetrofitManager.getTestRetrofit().create(TestApi.class);
        Call<Object> testCall = testApi.test();
        testCall.enqueue(this);
    }

    @Override
    protected void processData(Object o) {

    }

    @Override
    protected int getContentResId() {
        return R.layout.activity_test;
    }
}
