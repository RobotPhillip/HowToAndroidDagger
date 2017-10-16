package com.robotandpencils.app.ui.example_2.fragment_a.presenter;

import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.presenter.BasePresenter;
import com.robotandpencils.app.ui.example_2.fragment_a.view.Example2AView;
import com.robotandpencils.app.util.PerActivityUtil;
import com.robotandpencils.app.util.PerFragmentUtil;
import com.robotandpencils.app.util.SingletonUtil;

import javax.inject.Inject;

/**
 * Created by pwray on 2017-10-16.
 */
@PerFragment
final class Example2APresenterImpl extends BasePresenter<Example2AView> implements Example2APresenter {

    private final SingletonUtil singletonUtil;
    private final PerActivityUtil perActivityUtil;
    private final PerFragmentUtil perFragmentUtil;

    @Inject
    Example2APresenterImpl(Example2AView view, SingletonUtil singletonUtil, PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil) {
        super(view);
        this.singletonUtil = singletonUtil;
        this.perActivityUtil = perActivityUtil;
        this.perFragmentUtil = perFragmentUtil;
    }

    @Override
    public void onDoSomething() {
        String something = singletonUtil.doSomething();
        something += "\n" + perActivityUtil.doSomething();
        something += "\n" + perFragmentUtil.doSomething();
        view.showSomething(something);
    }
}
