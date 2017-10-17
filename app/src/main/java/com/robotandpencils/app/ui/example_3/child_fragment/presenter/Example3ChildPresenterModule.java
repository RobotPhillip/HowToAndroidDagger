package com.robotandpencils.app.ui.example_3.child_fragment.presenter;

import com.robotandpencils.app.inject.PerChildFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-16.
 */
@Module
public abstract class Example3ChildPresenterModule {

    @Binds
    @PerChildFragment
    abstract Example3ChildPresenter example3ChildPresenter(Example3ChildPresenterImpl example3ChildPresenterImpl);
}
