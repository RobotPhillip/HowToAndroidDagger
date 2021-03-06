package com.robotandpencils.app.ui.example_1;

import android.app.Activity;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.example_1.fragment.view.Example1Fragment;
import com.robotandpencils.app.ui.example_1.fragment.view.Example1FragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Provides example 1 activity dependencies.
 */

@Module(includes = BaseActivityModule.class)
public abstract class Example1ActivityModule {

    /**
     * Provides the injector for the {@link Example1Fragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example1FragmentModule.class)
    abstract Example1Fragment example1FragmentInjector();

    /**
     * As per the contract specified in {@link BaseActivityModule}; "This must be included in all
     * activity modules, which must provide a concrete implementation of {@link Activity}."
     * <p>
     * This provides the activity required to inject the
     * {@link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * {@link com.robotandpencils.app.ui.common.BaseActivity}.
     *
     * @param example1Activity the example 1 activity
     * @return the activity
     */
    @Binds
    @PerActivity
    abstract Activity activity(Example1Activity example1Activity);

}
