package com.github.xch168.retrofithelper.ui.home;

import com.github.xch168.retrofithelper.helper.RetrofitHelper;
import com.github.xch168.retrofithelper.ui.home.data.GankData;
import com.github.xch168.retrofithelper.ui.home.data.GankService;
import com.github.xch168.retrofithelper.ui.home.data.GitHubData;
import com.github.xch168.retrofithelper.ui.home.data.GitHubService;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by XuCanHui on 2017/7/12.
 */

public class MainPagePresenter implements MainPageContract.Presenter {

    private final MainPageContract.View mainPageView;

    private GitHubService mGitHubService;
    private GankService mGankService;

    public MainPagePresenter(MainPageContract.View mainPageView) {

        this.mainPageView = mainPageView;
        this.mainPageView.setPresenter(this);

        mGitHubService = RetrofitHelper.getService(GitHubService.class);
        mGankService = RetrofitHelper.getService(GankService.class);
    }


    @Override
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
                        mainPageView.showRepos(gitHubData);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void listGanks() {
        mGankService.listGank(1, 20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GankData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GankData data) {
                        mainPageView.showGanks(data);
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
