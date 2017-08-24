package com.zly.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.zly.zhibo.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/8/21 0021.
 */

public class Play_Recycler_Ver extends RecyclerView.Adapter<Play_Recycler_Ver.ViewHolder> {

    private Context mContext;
    private String name;
    private ArrayList<String> alist;

    public Play_Recycler_Ver(Context mContext, String name, ArrayList<String> alist) {
        this.mContext = mContext;
        this.name = name;
        this.alist = alist;
    }
    public void addData(int position,String talk){
        alist.add(position,talk);
        notifyItemInserted(position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.play_message_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.playMessageTvName.setText(name+"");
        holder.playMessageTvDesc.setText(alist.get(position));
    }

    @Override
    public int getItemCount() {
        return alist.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.play_message_tv_name)
        TextView playMessageTvName;
        @BindView(R.id.play_message_tv_desc)
        TextView playMessageTvDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
