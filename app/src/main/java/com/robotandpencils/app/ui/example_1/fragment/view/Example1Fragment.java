package com.robotandpencils.app.ui.example_1.fragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.view.BaseViewFragment;
import com.robotandpencils.app.ui.example_1.fragment.presenter.Example1Presenter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by pwray on 2017-10-02.
 */

public final class Example1Fragment extends BaseViewFragment<Example1Presenter> implements Example1View {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_1_fragment, container, false);
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
