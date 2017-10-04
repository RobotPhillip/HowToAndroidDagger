package com.robotandpencils.app.ui.example_2.fragment_b;

import android.app.Fragment;

import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.BaseFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Provides example 1 fragment dependencies.
 */
@Module(includes = BaseFragmentModule.class)
abstract class Example2BFragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example2BFragment the main fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example2BFragment example2BFragment);
}
