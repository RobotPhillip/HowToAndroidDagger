package com.robotandpencils.app.ui.main.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.view.BaseFragment;

import javax.annotation.Nullable;
import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Created by pwray on 2017-09-27.
 */

public final class MainFragment extends BaseFragment {

    @Inject
    MainFragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @OnClick(R.id.example_1)
    void onExample1Clicked() {
        listener.onExample1Clicked();
    }

    @OnClick(R.id.example_2)
    void onExample2Clicked() {
        listener.onExample2Clicked();
    }

    @OnClick(R.id.example_3)
    void onExample3Clicked() {
        listener.onExample3Clicked();
    }
}
