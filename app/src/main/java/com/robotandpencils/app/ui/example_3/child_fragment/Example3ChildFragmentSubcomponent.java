package com.robotandpencils.app.ui.example_3.child_fragment;

import com.robotandpencils.app.inject.PerChildFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-11.
 *
 * Injects example 3 child fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerChildFragment
@Subcomponent(modules = Example3ChildFragmentModule.class)
public interface Example3ChildFragmentSubcomponent extends AndroidInjector<Example3ChildFragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example3ChildFragment> {
    }
}
