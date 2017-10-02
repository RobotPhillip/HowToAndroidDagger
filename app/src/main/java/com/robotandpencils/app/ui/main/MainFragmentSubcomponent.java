package com.robotandpencils.app.ui.main;

import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.main.MainFragment;
import com.robotandpencils.app.ui.main.MainFragmentModule;

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
