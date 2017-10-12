package com.robotandpencils.app.ui.example_3;

import android.app.Activity;
import android.app.Fragment;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.ui.common.BaseActivityModule;
import com.robotandpencils.app.ui.example_2.Example2Activity;
import com.robotandpencils.app.ui.example_2.fragment_a.Example2AFragment;
import com.robotandpencils.app.ui.example_2.fragment_a.Example2AFragmentSubcomponent;
import com.robotandpencils.app.ui.example_2.fragment_b.Example2BFragment;
import com.robotandpencils.app.ui.example_2.fragment_b.Example2BFragmentSubcomponent;
import com.robotandpencils.app.ui.example_3.parent_fragment.Example3ParentFragment;
import com.robotandpencils.app.ui.example_3.parent_fragment.Example3ParentFragmentSubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by pwray on 2017-10-04.
 *
 * Provides example 3 activity dependencies.
 */

@Module(includes = BaseActivityModule.class,
subcomponents = {
        Example3ParentFragmentSubcomponent.class,
})
abstract class Example3ActivityModule {

    /**
     * Provides the injector for the {@link Example3ParentFragment}, which has access to the
     * dependencies provided by this activity and application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example3ParentFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example3ParentFragmentInjectorFactory(Example3ParentFragmentSubcomponent.Builder builder);

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
