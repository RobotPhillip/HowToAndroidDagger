package com.robotandpencils.app;

import android.app.Activity;

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
 *
 * The app module includes bindings to ensure the usability of `dagger.android` framework classes.
 */

@Module(includes = AndroidInjectionModule.class,
subcomponents = MainActivitySubcomponent.class)
abstract class AppModule {

    // TODO (ContributesAndroidInjector) remove this in favour of @ContributesAndroidInjector.
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    mainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
}
