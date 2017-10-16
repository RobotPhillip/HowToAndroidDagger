package com.robotandpencils.app.ui.example_1.fragment.presenter;

import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.presenter.BasePresenter;
import com.robotandpencils.app.ui.example_1.fragment.view.Example1View;
import com.robotandpencils.app.util.PerActivityUtil;
import com.robotandpencils.app.util.PerFragmentUtil;
import com.robotandpencils.app.util.SingletonUtil;

import javax.inject.Inject;

/**
 * Created by pwray on 2017-10-16.
 */
@PerFragment
final class Example1PresenterImpl extends BasePresenter<Example1View> implements Example1Presenter {

    private final SingletonUtil singletonUtil;
    private final PerActivityUtil perActivityUtil;
    private final PerFragmentUtil perFragmentUtil;

    @Inject
    Example1PresenterImpl(Example1View view, SingletonUtil singletonUtil, PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil) {
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
