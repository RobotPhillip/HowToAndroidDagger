package com.robotandpencils.app.ui.example_2.fragment_a.presenter;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-16.
 */
@Module
public abstract class Example2APresenterModule {
    @Binds
    @PerFragment
    abstract Example2APresenter example2APresenter(Example2APresenterImpl example2APresenterImpl);
}
