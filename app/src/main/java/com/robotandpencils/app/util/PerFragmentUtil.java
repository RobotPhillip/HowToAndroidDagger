package com.robotandpencils.app.util;

import android.app.Fragment;

import com.robotandpencils.app.ui.common.view.BaseFragmentModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by pwray on 2017-09-27.
 *
 * The instance of `Fragment` and all of its child fragments and their dependencies will share the same instance of this class.
 * However, different fragment instances will have their own instances.
 * This is not available at the Activity and Application level.
 */

public final class PerFragmentUtil {

    private final Fragment fragment;

    @Inject
    PerFragmentUtil(@Named(BaseFragmentModule.FRAGMENT) Fragment fragment) {
        this.fragment = fragment;
    }

    public String doSomething() {
        return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode();
    }
}
