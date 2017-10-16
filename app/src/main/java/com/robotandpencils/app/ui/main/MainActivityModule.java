package com.robotandpencils.app.ui.main;

import android.app.Activity;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.main.view.MainFragment;
import com.robotandpencils.app.ui.main.view.MainFragmentListener;
import com.robotandpencils.app.ui.main.view.MainFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 */

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);

    @Binds
    @PerActivity
    abstract MainFragmentListener mainFragmentListener(MainActivity mainActivity);

}
