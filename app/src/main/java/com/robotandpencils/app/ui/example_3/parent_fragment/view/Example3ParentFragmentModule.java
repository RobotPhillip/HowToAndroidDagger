package com.robotandpencils.app.ui.example_3.parent_fragment.view;

import android.app.Fragment;

import com.robotandpencils.app.inject.PerChildFragment;
import com.robotandpencils.app.inject.PerFragment;
import com.robotandpencils.app.ui.common.view.BaseFragmentModule;
import com.robotandpencils.app.ui.example_3.child_fragment.view.Example3ChildFragment;
import com.robotandpencils.app.ui.example_3.child_fragment.view.Example3ChildFragmentModule;
import com.robotandpencils.app.ui.example_3.parent_fragment.presenter.Example3ParentPresenterModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-10-10.
 * <p>
 * Provides example 3 parent fragment dependencies.
 */
@Module(includes = {BaseFragmentModule.class, Example3ParentPresenterModule.class})
public abstract class Example3ParentFragmentModule {

    /**
     * Provides the injector for the {@link Example3ChildFragment}, which has access to the
     * dependencies provided by this fragment and activity and application instance
     * (singleton scoped objects)
     */
    @PerChildFragment
    @ContributesAndroidInjector(modules = Example3ChildFragmentModule.class)
    abstract Example3ChildFragment example3ChildFragmentInjector();

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}
     *
     * @param example3ParentFragment the example 3 parent fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example3ParentFragment example3ParentFragment);

    @Binds
    @PerFragment
    abstract Example3ParentView example3ParentView(Example3ParentFragment example3ParentFragment);

}
