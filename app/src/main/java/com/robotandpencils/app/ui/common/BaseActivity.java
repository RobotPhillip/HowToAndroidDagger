package com.robotandpencils.app.ui.common;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.IdRes;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

/**
 * Created by pwray on 2017-09-27.
 *
 * The class `BaseActivity` implements `HasFragmentInjector` to indicate that
 * fragments are to participate in `dagger.android` injection.
 */

public abstract class BaseActivity extends Activity implements HasFragmentInjector {

    /**
     * The fragment manager is injected, instead of calling `getFragmentManager()`,
     * to enable ease of mocking and verification in tests.
     *
     * @see `https://github.com/vestrel00/android-dagger-butterknife-mvp/pull/52`
     */
    @Inject
    @Named(BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER)
    protected FragmentManager fragmentManager;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public final AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }

    /**
     * Method `addFragment` exists to allow subclasses to add fragments.
     *
     * @param containerViewId
     * @param fragment
     */
    protected final void addFragment(@IdRes int containerViewId, Fragment fragment) {
        fragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit();
    }
}
