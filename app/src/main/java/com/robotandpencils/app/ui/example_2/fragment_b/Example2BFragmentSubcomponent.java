package com.robotandpencils.app.ui.example_2.fragment_b;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 *
 * Injects example 2B fragment dependencies.
 *
 * TODO (@ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example2BFragmentModule.class)
public interface Example2BFragmentSubcomponent extends AndroidInjector<Example2BFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example2BFragment>{}
}
