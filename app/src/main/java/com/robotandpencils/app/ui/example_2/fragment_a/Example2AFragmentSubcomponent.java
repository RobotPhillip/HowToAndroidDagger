package com.robotandpencils.app.ui.example_2.fragment_a;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 *
 * Injects example 2A fragment dependencies.
 *
 * TODO (@ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example2AFragmentModule.class)
public interface Example2AFragmentSubcomponent extends AndroidInjector<Example2AFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example2AFragment>{}
}
