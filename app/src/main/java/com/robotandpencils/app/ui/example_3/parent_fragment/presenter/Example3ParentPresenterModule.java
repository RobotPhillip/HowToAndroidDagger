package com.robotandpencils.app.ui.example_3.parent_fragment.presenter;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-16.
 */
@Module
public abstract class Example3ParentPresenterModule {
    @Binds
    @PerFragment
    abstract Example3ParentPresenter example2BPresenter(Example3ParentPresenterImpl example3ParentPresenterImpl);
}
