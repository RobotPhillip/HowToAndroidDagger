package com.robotandpencils.app.ui.main;

import android.app.Activity;
import android.app.Fragment;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.ui.common.BaseActivityModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by pwray on 2017-10-02.
 */

@Module(includes = BaseActivityModule.class, subcomponents = MainFragmentSubcomponent.class)
abstract class MainActivityModule {

    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    mainFragmentInjectorFactory(MainFragmentSubcomponent.Builder builder);

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);

    @Binds
    @PerActivity
    abstract MainFragmentListener mainFragmentListener(MainActivity mainActivity);

}
