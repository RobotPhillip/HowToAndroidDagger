package com.robotandpencils.app.ui.example_2;

import android.os.Bundle;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseActivity;
import com.robotandpencils.app.ui.example_2.fragment_a.view.Example2AFragment;
import com.robotandpencils.app.ui.example_2.fragment_b.view.Example2BFragment;

import javax.annotation.Nullable;

/**
 * Created by pwray on 2017-10-04.
 */

public final class Example2Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_2_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_a_container, new Example2AFragment());
            addFragment(R.id.fragment_b_container, new Example2BFragment());
        }
    }
}
