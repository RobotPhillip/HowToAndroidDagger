package com.robotandpencils.app.util;

import android.app.Activity;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.inject.PerFragment;

import javax.inject.Inject;

/**
 * Created by pwray on 2017-09-27.
 *
 * The `@PerActivity` annotation means that the activity, all of its fragments and child fragments
 * and their dependencies will share the same single instance of `PerActivityUtil`.
 * Different activity instances will have their own instance of `PerActivityUtil`.
 * This is not available at the application level.
 */

@PerActivity
public final class PerActivityUtil {

    private final Activity activity;

    @Inject
    PerActivityUtil(Activity activity) {
        this.activity = activity;
    }

    public String doSomething() {
        return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode();
    }
}
