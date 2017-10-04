package com.robotandpencils.app.ui.example_1;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 *
 * Injects example 1 fragment dependencies.
 *
 * TODO (@ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example1FragmentModule.class)
public interface Example1FragmentSubcomponent extends AndroidInjector<Example1Fragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example1Fragment>{}
}
