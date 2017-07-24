package com.github.xch168.retrofithelper.ui.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.xch168.retrofithelper.R;
import com.github.xch168.retrofithelper.adapter.GankAdapter;
import com.github.xch168.retrofithelper.ui.BaseFragment;
import com.github.xch168.retrofithelper.ui.home.data.GankData;
import com.github.xch168.retrofithelper.ui.home.data.GitHubData;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment implements MainPageContract.View {

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;

    private GankAdapter mGankAdapter;

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

        initUI();

        //mPresenter.listRepos();
        mPresenter.listGanks();
    }

    private void initUI() {
        mSwipeRefreshLayout = getView().findViewById(R.id.srl);
        mRecyclerView = getView().findViewById(R.id.recycler);

        mGankAdapter = new GankAdapter(getActivity());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mGankAdapter);
    }


    @Override
    public void showRepos(GitHubData data) {
    }

    @Override
    public void showGanks(GankData data) {
        mGankAdapter.addAll(data.gankList);
    }
}
