package com.robotandpencils.app;

import dagger.Module;
import dagger.android.AndroidInjectionModule;

/**
 * Created by pwray on 2017-09-27.
 *
 * The app module includes bindings to ensure the usability of `dagger.android` framework classes.
 */

@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {
}
