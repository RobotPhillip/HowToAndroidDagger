package com.robotandpencils.app.ui.example_3;

import android.os.Bundle;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseActivity;
import com.robotandpencils.app.ui.example_3.parent_fragment.view.Example3ParentFragment;

import javax.annotation.Nullable;

/**
 * Created by pwray on 2017-10-04.
 *
 * Activity that contains a single fragment that contains a child fragment.
 */
public final class Example3Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_3_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.parent_fragment_container, new Example3ParentFragment());
        }
    }
}
