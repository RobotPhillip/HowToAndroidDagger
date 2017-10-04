package com.robotandpencils.app.ui.example_1;

import com.robotandpencils.app.inject.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Injects example 1 activity dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerActivity
@Subcomponent(modules = Example1ActivityModule.class)
public interface Example1ActivitySubcomponent extends AndroidInjector<Example1Activity> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example1Activity> {
    }
}
