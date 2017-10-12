package com.robotandpencils.app.ui.example_3;

import com.robotandpencils.app.inject.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Injects example 3 activity dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
 */
@PerActivity
@Subcomponent(modules = Example3ActivityModule.class)
public interface Example3ActivitySubcomponent extends AndroidInjector<Example3Activity> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example3Activity> {
    }
}
