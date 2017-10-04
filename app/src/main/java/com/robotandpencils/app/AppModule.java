package com.robotandpencils.app;

import android.app.Activity;

import com.robotandpencils.app.ui.example_1.Example1Activity;
import com.robotandpencils.app.ui.example_1.Example1ActivitySubcomponent;
import com.robotandpencils.app.ui.main.MainActivity;
import com.robotandpencils.app.ui.main.MainActivitySubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by pwray on 2017-09-27.
 * <p>
 * The app module includes bindings to ensure the usability of `dagger.android` framework classes.
 */

@Module(includes = AndroidInjectionModule.class,
        subcomponents = {
                MainActivitySubcomponent.class,
                Example1ActivitySubcomponent.class
        })
abstract class AppModule {

    /**
     * Provides the injector for the {@link MainActivity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector.
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    mainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);

    /**
     * Provides the injector for the {@link Example1Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector.
    @Binds
    @IntoMap
    @ActivityKey(Example1Activity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    example1ActivityInjectorFactory(Example1ActivitySubcomponent.Builder builder);
}
