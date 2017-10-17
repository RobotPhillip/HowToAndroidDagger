package com.robotandpencils.app.ui.example_3.child_fragment.presenter;

import com.robotandpencils.app.inject.PerChildFragment;
import com.robotandpencils.app.ui.common.presenter.BasePresenter;
import com.robotandpencils.app.ui.example_3.child_fragment.view.Example3ChildView;
import com.robotandpencils.app.util.PerActivityUtil;
import com.robotandpencils.app.util.PerChildFragmentUtil;
import com.robotandpencils.app.util.PerFragmentUtil;
import com.robotandpencils.app.util.SingletonUtil;

import javax.inject.Inject;

/**
 * Created by pwray on 2017-10-16.
 */
@PerChildFragment
final class Example3ChildPresenterImpl extends BasePresenter<Example3ChildView> implements Example3ChildPresenter {

    private final SingletonUtil singletonUtil;
    private final PerActivityUtil perActivityUtil;
    private final PerFragmentUtil perFragmentUtil;
    private final PerChildFragmentUtil perChildFragmentUtil;

    @Inject
    Example3ChildPresenterImpl(Example3ChildView view, SingletonUtil singletonUtil, PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil, PerChildFragmentUtil perChildFragmentUtil) {
        super(view);
        this.singletonUtil = singletonUtil;
        this.perActivityUtil = perActivityUtil;
        this.perFragmentUtil = perFragmentUtil;
        this.perChildFragmentUtil = perChildFragmentUtil;
    }

    @Override
    public void onDoSomething() {
        String something = singletonUtil.doSomething();
        something += "\n" + perActivityUtil.doSomething();
        something += "\n" + perFragmentUtil.doSomething();
        something += "\n" + perChildFragmentUtil.doSomething();
        view.showSomething(something);
    }
}
