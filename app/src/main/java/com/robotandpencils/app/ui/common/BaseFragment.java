package com.robotandpencils.app.ui.common;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

/**
 * Created by pwray on 2017-09-27.
 * <p>
 * BaseFragment implements `HasFragmentInjector` to indicate that
 * fragments are to participate in `dagger.android` injection.
 */

public abstract class BaseFragment extends Fragment implements HasFragmentInjector {

    @Nullable
    Unbinder viewUnbinder;

    /**
     * The activity `Context` is injected, instead of calling `getContext()`,
     * to enable ease of mocking and verification in tests.
     *
     * @see `https://github.com/vestrel00/android-dagger-butterknife-mvp/pull/52`
     */
    @Inject
    protected Context activityContext;

    /**
     * Note that this should not be used within a child fragment.
     * <p>
     * The child `FragmentManager` is injected, instead of calling `getChildFragmentManager()`,
     * to enable ease of mocking and verification in tests.
     *
     * @see `https://github.com/vestrel00/android-dagger-butterknife-mvp/pull/52`
     */
    @Inject
    @Named(BaseFragmentModule.CHILD_FRAGMENT_MANAGER)
    protected FragmentManager childFragmentManager;

    @Inject
    DispatchingAndroidInjector<Fragment> childFragmentInjector;

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // Perform injection here before M, L (API 22) and below because `onAttach(Context)`
            // is not available at L.
            AndroidInjection.inject(this);
        }
        super.onAttach(activity);
    }

    @Override
    public void onAttach(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Perform injection here for M (API 23) due to deprecation of `onAttach(Activity)`.
            AndroidInjection.inject(this);
        }
        super.onAttach(context);
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        // No need to check if getView() is null because this lifecycle method will
        // not get called if the view returned in onCreateView, if any, is null.
        viewUnbinder = ButterKnife.bind(this, getView());
    }

    @Override
    public void onDestroyView() {
        // This lifecycle method still gets called even if onCreateView returns a null view
        if (viewUnbinder != null) {
            viewUnbinder.unbind();
        }
        super.onDestroyView();
    }

    @Override
    public final AndroidInjector<Fragment> fragmentInjector() {
        return childFragmentInjector;
    }

    /**
     * Method `addChildFragment` exists to allow subclasses to add fragments.
     *
     * @param containerViewId
     * @param fragment
     */
    protected final void addChildFragment(@IdRes int containerViewId, Fragment fragment) {
        childFragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit();
    }
}
