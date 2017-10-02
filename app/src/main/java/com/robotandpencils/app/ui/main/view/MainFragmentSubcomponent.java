package com.robotandpencils.app.ui.main.view;

import com.robotandpencils.app.inject.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 */

// TODO (@ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
@PerFragment
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentSubcomponent extends AndroidInjector<MainFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment>{}
}
