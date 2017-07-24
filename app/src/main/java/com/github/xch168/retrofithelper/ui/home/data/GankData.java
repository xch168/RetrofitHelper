package com.github.xch168.retrofithelper.ui.home.data;

import com.github.xch168.retrofithelper.entity.Gank;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by XuCanHui on 2017/7/24.
 */

public class GankData {

    @SerializedName("error")
    public boolean error;

    @SerializedName("results")
    public List<Gank> gankList;
}
