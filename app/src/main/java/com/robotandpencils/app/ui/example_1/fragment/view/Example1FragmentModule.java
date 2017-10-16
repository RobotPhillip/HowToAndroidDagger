package com.robotandpencils.app.ui.example_1.fragment.view;

import android.app.Fragment;

import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.view.BaseFragmentModule;
import com.robotandpencils.app.ui.example_1.fragment.presenter.Example1PresenterModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Provides example 1 fragment dependencies.
 */
@Module(includes = {BaseFragmentModule.class, Example1PresenterModule.class})
public abstract class Example1FragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example1Fragment the main fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example1Fragment example1Fragment);

    @Binds
    @PerFragment
    abstract Example1View example1View(Example1Fragment example1Fragment);
}
