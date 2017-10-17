package com.robotandpencils.app.ui.example_3.child_fragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.view.BaseViewFragment;
import com.robotandpencils.app.ui.example_3.child_fragment.presenter.Example3ChildPresenter;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by pwray on 2017-10-10.
 */

public final class Example3ChildFragment extends BaseViewFragment<Example3ChildPresenter> implements Example3ChildView {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_3_child_fragment, container, false);
    }

    @OnClick(R.id.do_something)
    void onDoSomethingClicked() {
        presenter.onDoSomething();
    }

    @Override
    public void showSomething(String something) {
        someText.setText(something);
    }
}
