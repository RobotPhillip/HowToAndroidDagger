package com.robotandpencils.app.util;

import android.app.Fragment;

import com.robotandpencils.app.inject.PerChildFragment;
import com.robotandpencils.app.ui.common.BaseChildFragmentModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by pwray on 2017-09-27.
 *
 * The child `Fragment` (a fragment inside a fragment that is added using `Fragment.getChildFragmentManager()`) and all
 * of its dependencies will share the same instance of this class.
 * However, different child fragments instances will have their own instances of this class.
 * This is not available at the (parent) `Fragment`, `Activity`, and `Application` level.
 */
@PerChildFragment
public final class PerChildFragmentUtil {

    private final Fragment childFragment;

    @Inject
    PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
        this.childFragment = childFragment;
    }

    public String doSomething() {
        return "PerChildFragmentUtil: " + hashCode() + ", child fragment: " + childFragment.hashCode();
    }
}
