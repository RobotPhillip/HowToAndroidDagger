package com.robotandpencils.app.ui.example_2;

import android.app.Activity;
import android.app.Fragment;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.example_2.fragment_a.Example2AFragment;
import com.robotandpencils.app.ui.example_2.fragment_a.Example2AFragmentSubcomponent;
import com.robotandpencils.app.ui.example_2.fragment_b.Example2BFragment;
import com.robotandpencils.app.ui.example_2.fragment_b.Example2BFragmentSubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by pwray on 2017-10-04.
 *
 * Provides example 2 activity dependencies.
 */

@Module(includes = BaseActivityModule.class,
subcomponents = {
        Example2AFragmentSubcomponent.class,
        Example2BFragmentSubcomponent.class
})
abstract class Example2ActivityModule {

    /**
     * Provides the injector for the {@link Example2AFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example2AFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example2AFragmentInjectorFactory(Example2AFragmentSubcomponent.Builder builder);

    /**
     * Provides the injector for the {@link Example2BFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example2BFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example2BFragmentInjectorFactory(Example2BFragmentSubcomponent.Builder builder);

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
