package com.robotandpencils.app.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by pwray on 2017-09-27.
 * The lifespan of a dependency be the same as that of a Fragment.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}
