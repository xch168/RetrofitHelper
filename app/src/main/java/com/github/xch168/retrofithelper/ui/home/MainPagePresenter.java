package com.github.xch168.retrofithelper.ui.home;

import com.github.xch168.retrofithelper.helper.RetrofitHelper;
import com.github.xch168.retrofithelper.ui.home.data.GitHubData;
import com.github.xch168.retrofithelper.ui.home.data.GitHubService;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by XuCanHui on 2017/7/12.
 */

public class MainPagePresenter implements MainPageContract.Presenter {

    private GitHubService mGitHubService;

    public MainPagePresenter() {

        mGitHubService = RetrofitHelper.getService(GitHubService.class);
    }

    public void listRepos() {

        mGitHubService.listRepos("xch168")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GitHubData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GitHubData gitHubData) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
