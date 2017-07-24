package com.github.xch168.retrofithelper.ui.home;

import com.github.xch168.retrofithelper.base.mvp.BasePresenter;
import com.github.xch168.retrofithelper.base.mvp.BaseView;
import com.github.xch168.retrofithelper.ui.home.data.GankData;
import com.github.xch168.retrofithelper.ui.home.data.GitHubData;

/**
 * Created by XuCanHui on 2017/7/12.
 */

public interface MainPageContract {

    interface View extends BaseView<Presenter> {

        void showRepos(GitHubData data);

        void showGanks(GankData data);
    }

    interface Presenter extends BasePresenter {

        void listRepos();

        void listGanks();
    }
}
