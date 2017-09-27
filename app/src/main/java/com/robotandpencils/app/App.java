package com.robotandpencils.app;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by pwray on 2017-09-27.
 */

public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    /**
     * The top-most level injection occurs in onCreate with `DaggerAppComponent.create().inject(this)`,
     * which is a class generated by Dagger during compile-time based on AppComponent.
     */
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);
    }
    @Override
    public AndroidInjector<Activity> activityInjector() {
            return activityInjector;
    }
}
