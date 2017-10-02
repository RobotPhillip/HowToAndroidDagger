package com.robotandpencils.app.ui.common;

import com.robotandpencils.app.inject.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 */

// TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
@PerActivity
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
