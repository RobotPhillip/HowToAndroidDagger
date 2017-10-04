package com.robotandpencils.app.ui.example_1;

import android.app.Activity;
import android.app.Fragment;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.ui.common.BaseActivityModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by pwray on 2017-10-02.
 * <p>
 * Provides example 1 activity dependencies.
 */

@Module(includes = BaseActivityModule.class, subcomponents = Example1FragmentSubcomponent.class)
abstract class Example1ActivityModule {

    /**
     * Provides the injector for the {@link Example1Fragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     * <p>
     * TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
     */
    @Binds
    @IntoMap
    @FragmentKey(Example1Fragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example1FragmentInjectorFactory(Example1FragmentSubcomponent.Builder builder);

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
