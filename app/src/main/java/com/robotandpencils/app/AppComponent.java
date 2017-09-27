package com.robotandpencils.app;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pwray on 2017-09-27.
 *
 * The annotations read as such: this component's modules provide @Singleton scoped or unscoped dependencies.
 */

@Singleton
@Component(modules = AppModule.class)
interface AppComponent {
    void inject(App app);
}
