package com.robotandpencils.app.ui.example_2;

import com.robotandpencils.app.inject.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Injects example 2 activity dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerActivity
@Subcomponent(modules = Example2ActivityModule.class)
public interface Example2ActivitySubcomponent extends AndroidInjector<Example2Activity> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example2Activity> {
    }
}
