package com.robotandpencils.app.ui.example_1.fragment.presenter;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-16.
 *
 * Provides example 1 presenter dependencies.
 */
@Module
public abstract class Example1PresenterModule {
    @Binds
    @PerFragment
    abstract Example1Presenter example1Presenter(Example1PresenterImpl example1PresenterImpl);
}
