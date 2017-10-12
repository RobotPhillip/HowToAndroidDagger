package com.robotandpencils.app;

import com.robotandpencils.app.inject.PerActivity;
import com.robotandpencils.app.ui.example_1.Example1Activity;
import com.robotandpencils.app.ui.example_1.Example1ActivityModule;
import com.robotandpencils.app.ui.example_2.Example2Activity;
import com.robotandpencils.app.ui.example_2.Example2ActivityModule;
import com.robotandpencils.app.ui.example_3.Example3Activity;
import com.robotandpencils.app.ui.example_3.Example3ActivityModule;
import com.robotandpencils.app.ui.main.MainActivity;
import com.robotandpencils.app.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-09-27.
 * <p>
 * The app module includes bindings to ensure the usability of `dagger.android` framework classes.
 */

@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {

    /**
     * Provides the injector for the {@link MainActivity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

    /**
     * Provides the injector for the {@link Example1Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = Example1ActivityModule.class)
    abstract Example1Activity example1ActivityInjector();

    /**
     * Provides the injector for the {@link Example2Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = Example2ActivityModule.class)
    abstract Example2Activity example2ActivityInjector();

    /**
     * Provides the injector for the {@link Example3Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = Example3ActivityModule.class)
    abstract Example3Activity example3ActivityInjector();
}
