package com.robotandpencils.app.ui.example_1;

import android.os.Bundle;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseActivity;

import javax.annotation.Nullable;

/**
 * Created by pwray on 2017-10-02.
 */

public final class Example1Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_1_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new Example1Fragment());
        }
    }
}
