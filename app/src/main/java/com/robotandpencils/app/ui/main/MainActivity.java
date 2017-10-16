package com.robotandpencils.app.ui.main;

import android.os.Bundle;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseActivity;
import com.robotandpencils.app.ui.main.view.MainFragment;
import com.robotandpencils.app.ui.main.view.MainFragmentListener;

import javax.annotation.Nullable;

/**
 * Created by pwray on 2017-10-02.
 */

public final class MainActivity extends BaseActivity implements MainFragmentListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new MainFragment());
        }
    }

    @Override
    public void onExample1Clicked() {
        navigator.toExample1(this);
    }

    @Override
    public void onExample2Clicked() {
        navigator.toExample2(this);
    }

    @Override
    public void onExample3Clicked() {
        navigator.toExample3(this);
    }
}
