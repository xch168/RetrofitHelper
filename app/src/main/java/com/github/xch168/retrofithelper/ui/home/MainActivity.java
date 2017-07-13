package com.github.xch168.retrofithelper.ui.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.xch168.retrofithelper.R;
import com.github.xch168.retrofithelper.ui.BaseActivity;
import com.github.xch168.retrofithelper.util.ActivityUtil;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.content_frame);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            ActivityUtil.addFragment2Activity(getSupportFragmentManager(), R.id.content_frame, mainFragment);
        }

        new MainPagePresenter(mainFragment);

    }
}
