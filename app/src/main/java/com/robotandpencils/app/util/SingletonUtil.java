package com.robotandpencils.app.util;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by pwray on 2017-09-27.
 *
 * The `@Singleton` annotation means that the application and all its activities, fragments and child fragments
 * and their dependencies will share the same single instance of `SingletonUtil`.
 */

@Singleton
public final class SingletonUtil {

    @Inject
    public SingletonUtil() {}

    public String doSomething() {
        return "SingletonUtil: " + hashCode();
    }
}
