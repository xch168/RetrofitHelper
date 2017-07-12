package com.github.xch168.retrofithelper.ui.home.data;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by XuCanHui on 2017/7/12.
 */

public interface GitHubService {

    @GET("user/{user}/repos")
    Observable<GitHubData> listRepos(@Path("user") String user);

}
