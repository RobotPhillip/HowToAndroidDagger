package com.robotandpencils.app.ui.example_3.parent_fragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.view.BaseViewFragment;
import com.robotandpencils.app.ui.example_3.child_fragment.view.Example3ChildFragment;
import com.robotandpencils.app.ui.example_3.parent_fragment.presenter.Example3ParentPresenter;
import com.robotandpencils.app.util.PerActivityUtil;
import com.robotandpencils.app.util.PerFragmentUtil;
import com.robotandpencils.app.util.SingletonUtil;

import javax.annotation.Nullable;
import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by pwray on 2017-10-10.
 * <p>
 * A fragment implementation of {@link Example3ParentView}.
 */

public final class Example3ParentFragment extends BaseViewFragment<Example3ParentPresenter> implements Example3ParentView {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_3_parent_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (savedInstanceState == null) {
            addChildFragment(R.id.child_fragment_container, new Example3ChildFragment());
        }
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
