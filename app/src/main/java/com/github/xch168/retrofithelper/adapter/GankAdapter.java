package com.github.xch168.retrofithelper.adapter;

import android.content.Context;

import com.github.xch168.quickrecycleradapter.QuickAdapter;
import com.github.xch168.quickrecycleradapter.QuickViewHolder;
import com.github.xch168.retrofithelper.R;
import com.github.xch168.retrofithelper.entity.Gank;

/**
 * Created by XuCanHui on 2017/7/24.
 */

public class GankAdapter extends QuickAdapter<Gank> {

    public GankAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutResId(int viewType) {
        return R.layout.gank_item;
    }


    @Override
    protected void convert(QuickViewHolder holder, Gank item) {
        holder.setText(R.id.tv, item.desc);
    }
}
