package com.robotandpencils.app.ui.example_3.child_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseFragment;
import com.robotandpencils.app.util.PerActivityUtil;
import com.robotandpencils.app.util.PerChildFragmentUtil;
import com.robotandpencils.app.util.PerFragmentUtil;
import com.robotandpencils.app.util.SingletonUtil;

import javax.annotation.Nullable;
import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by pwray on 2017-10-10.
 */

public final class Example3ChildFragment extends BaseFragment {

    @Inject
    SingletonUtil singletonUtil;

    @Inject
    PerActivityUtil perActivityUtil;

    @Inject
    PerFragmentUtil perFragmentUtil;

    @Inject
    PerChildFragmentUtil perChildFragmentUtil;

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_3_child_fragment, container, false);
    }

    @OnClick(R.id.do_something)
    void onDoSomethingClicked() {
        String something = singletonUtil.doSomething();
        something += "\n" + perActivityUtil.doSomething();
        something += "\n" + perFragmentUtil.doSomething();
        something += "\n" + perChildFragmentUtil.doSomething();
        showSomething(something);
    }

    private void showSomething(String something) {
        someText.setText(something);
    }
}
