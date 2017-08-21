package com.zly.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zly.bean.Hot;
import com.zly.listener.OnItemClickListener;
import com.zly.zhibo.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/8/17.
 */

public class Recommend_Rec_Adp extends RecyclerView.Adapter<MyRecommendAda>{

    Context context;
    List<Hot.ResultBean.ListBean> mList;
    OnItemClickListener listener;


    public Recommend_Rec_Adp(Context context, List<Hot.ResultBean.ListBean> mList) {
        this.context = context;
        this.mList = mList;
    }

    public void refresh(List<Hot.ResultBean.ListBean> list) {
        mList = list;
        notifyDataSetChanged();
    }
    public void loadMore(List<Hot.ResultBean.ListBean> list) {
        int lastPosition = mList.size();
        mList.addAll(lastPosition,list);
        notifyDataSetChanged();
    }
    public void setOnItemClickListener (OnItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public MyRecommendAda onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_child, parent, false);
        MyRecommendAda myRecommendAda = new MyRecommendAda(view);

        return myRecommendAda;
    }

    @Override
    public void onBindViewHolder(MyRecommendAda holder, final int position) {
        if (position <mList.size()) {
            Glide.with(context).load(mList.get(position).getUser().getUser_data().getAvatar()).into(holder.childIv);
            Glide.with(context).load(mList.get(position).getData().getPic()).into(holder.childZb);
            holder.childName.setText(mList.get(position).getData().getLive_name());
            holder.childSign.setText(mList.get(position).getUser().getUser_data().getSign());
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (listener!=null) {
                    listener.onItemClick(view, position);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return mList == null?0:mList.size();
    }
}

class MyRecommendAda extends RecyclerView.ViewHolder {

    @BindView(R.id.child_iv)
    ImageView childIv;
    @BindView(R.id.child_name)
    TextView childName;
    @BindView(R.id.child_sign)
    TextView childSign;
    @BindView(R.id.child_zb)
    ImageView childZb;

    public MyRecommendAda(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
