package com.robotandpencils.app.ui.main;

import android.app.Fragment;

import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.BaseFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-10-02.
 */

@Module(includes = BaseFragmentModule.class)
abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(MainFragment mainFragment);
}
