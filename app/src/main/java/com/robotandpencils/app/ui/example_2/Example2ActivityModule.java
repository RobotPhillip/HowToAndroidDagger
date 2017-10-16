package com.robotandpencils.app.ui.example_2;

import android.app.Activity;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.example_2.fragment_a.view.Example2AFragment;
import com.robotandpencils.app.ui.example_2.fragment_a.view.Example2AFragmentModule;
import com.robotandpencils.app.ui.example_2.fragment_b.view.Example2BFragment;
import com.robotandpencils.app.ui.example_2.fragment_b.view.Example2BFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-10-04.
 *
 * Provides example 2 activity dependencies.
 */

@Module(includes = BaseActivityModule.class)
public abstract class Example2ActivityModule {

    /**
     * Provides the injector for the {@link Example2AFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example2AFragmentModule.class)
    abstract Example2AFragment example2AFragmentInjector();

    /**
     * Provides the injector for the {@link Example2BFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example2BFragmentModule.class)
    abstract Example2BFragment example2BFragmentInjector();

    /**
     * As per the contract specified in @{link BaseActivityModule}; "This must be included in all
     * activity modules, which must provide a concrete implementation of @{link Activity}."
     * <p>
     * This provides the activity required to inject the
     * @{link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * @{link com.robotsandpencils.app.ui.common.BaseActivity}.
     * @param example2Activity
     * @return
     */
    @Binds
    @PerActivity
    abstract Activity activity(Example2Activity example2Activity);

}
