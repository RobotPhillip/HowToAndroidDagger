package com.robotandpencils.app.ui.example_3.child_fragment;

import android.app.Fragment;

import com.robotandpencils.app.inject.PerChildFragment;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.common.BaseChildFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-10.
 */

@Module(includes = {
        BaseChildFragmentModule.class
})
abstract class Example3ChildFragmentModule {

    /**
     * As per the contract specified in {@link BaseChildFragmentModule}; "This must be included in
     * all child fragment modules, which must provide a concrete implementation of the child
     * {@link Fragment} and named {@link BaseChildFragmentModule#CHILD_FRAGMENT}
     *
     * @param example3ChildFragment the example 3 child fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseChildFragmentModule.CHILD_FRAGMENT)
    @PerChildFragment
    abstract Fragment fragment(Example3ChildFragment example3ChildFragment);
}
