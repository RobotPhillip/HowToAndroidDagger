package com.robotandpencils.app.ui.example_2.fragment_b.presenter;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-16.
 */
@Module
public abstract class Example2BPresenterModule {
    @Binds
    @PerFragment
    abstract Example2BPresenter example2BPresenter(Example2BPresenterImpl example2BPresenterImpl);
}
