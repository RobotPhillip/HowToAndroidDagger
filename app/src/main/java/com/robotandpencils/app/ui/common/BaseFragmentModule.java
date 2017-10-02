package com.robotandpencils.app.ui.common;

import android.app.Fragment;
import android.app.FragmentManager;

import com.robotandpencils.app.inject.PerFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pwray on 2017-09-27.
 *
 * The class `BaseFragmentModule` provides the base fragment dependencies.
 * So far, that is only the child `FragmentManager` named `CHILD_FRAGMENT_MANAGER`.
 */

@Module
public abstract class BaseFragmentModule {

    public static final String FRAGMENT = "BaseFragmentModule.fragment";

    static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    static FragmentManager childFragmentManager(@Named(FRAGMENT)Fragment fragment) {
        return fragment.getChildFragmentManager();
    }
}
