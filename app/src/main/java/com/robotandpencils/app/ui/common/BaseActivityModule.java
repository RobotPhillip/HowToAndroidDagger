package com.robotandpencils.app.ui.common;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;

import com.robotandpencils.app.inject.PerActivity;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by pwray on 2017-09-27.
 *
 * Provides base activity dependencies.  This must be included in all activity modules,
 * which must provide a concrete implementation of @{link Activity}.
 */

@Module
public abstract class BaseActivityModule {

    static final String ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager";

    /**
     * The `@PerActivity` annotation is unnecessary since the activity will always be unique.
     * However, it makes the module easier to read.
     *
     * @param activity
     * @return
     */
    @Binds
    @PerActivity
    abstract Context activityContext(Activity activity);

    /**
     * The `@PerActivity` annotation is unnecessary since the activity will always be unique.
     * However, it makes the module easier to read.
     *
     * @param activity
     * @return
     */
    @Provides
    @Named(ACTIVITY_FRAGMENT_MANAGER)
    @PerActivity
    static FragmentManager activityFragmentManager(Activity activity) {
        return activity.getFragmentManager();
    }
}
