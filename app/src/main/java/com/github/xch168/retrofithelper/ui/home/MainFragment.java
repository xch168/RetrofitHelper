package com.github.xch168.retrofithelper.ui.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.xch168.retrofithelper.R;
import com.github.xch168.retrofithelper.ui.BaseFragment;
import com.github.xch168.retrofithelper.ui.home.data.GitHubData;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment implements MainPageContract.View {

    private MainPageContract.Presenter mPresenter;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void setPresenter(MainPageContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onResume() {
        super.onResume();

        mPresenter.listRepos();
    }


    @Override
    public void showRepos(GitHubData data) {

    }
}
