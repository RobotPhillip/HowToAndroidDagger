package com.robotandpencils.app.ui.example_3;

import android.app.Activity;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.example_3.parent_fragment.view.Example3ParentFragment;
import com.robotandpencils.app.ui.example_3.parent_fragment.view.Example3ParentFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-10-04.
 *
 * Provides example 3 activity dependencies.
 */

@Module(includes = BaseActivityModule.class)
public abstract class Example3ActivityModule {

    /**
     * Provides the injector for the {@link Example3ParentFragment}, which has access to the
     * dependencies provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example3ParentFragmentModule.class)
    abstract Example3ParentFragment example3ParentFragmentInjector();

    /**
     * As per the contract specified in @{link BaseActivityModule}; "This must be included in all
     * activity modules, which must provide a concrete implementation of @{link Activity}."
     * <p>
     * This provides the activity required to inject the
     * @{link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * @{link com.robotsandpencils.app.ui.common.BaseActivity}.
     * @param example3Activity
     * @return the example 3 activity
     */
    @Binds
    @PerActivity
    abstract Activity activity(Example3Activity example3Activity);

}
