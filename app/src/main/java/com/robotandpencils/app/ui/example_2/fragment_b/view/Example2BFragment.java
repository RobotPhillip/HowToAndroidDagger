package com.robotandpencils.app.ui.example_2.fragment_b.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.view.BaseViewFragment;
import com.robotandpencils.app.ui.example_2.fragment_b.presenter.Example2BPresenter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A fragment implementation of {@link Example2BView}.
 */

public final class Example2BFragment extends BaseViewFragment<Example2BPresenter> implements Example2BView {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_2_fragment_b, container, false);
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
