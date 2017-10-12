package com.robotandpencils.app.ui.example_3.parent_fragment;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-11.
 *
 * Injects example 3 parent fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example3ParentFragmentModule.class)
public interface Example3ParentFragmentSubcomponent extends AndroidInjector<Example3ParentFragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example3ParentFragment> {
    }
}
