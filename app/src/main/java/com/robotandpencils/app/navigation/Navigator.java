package com.robotandpencils.app.navigation;

import android.content.Context;
import android.content.Intent;

import com.robotandpencils.app.ui.example_1.Example1Activity;
import com.robotandpencils.app.ui.example_2.Example2Activity;
import com.robotandpencils.app.ui.example_3.Example3Activity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by pwray on 2017-10-16.
 *
 * Provides methods to navigate to different activities in the application.
 */
@Singleton
public final class Navigator {

    @Inject
    Navigator() {
    }

    public void toExample1(Context context) {
        Intent intent = new Intent(context, Example1Activity.class);
        context.startActivity(intent);
    }

    public void toExample2(Context context) {
        Intent intent = new Intent(context, Example2Activity.class);
        context.startActivity(intent);
    }

    public void toExample3(Context context) {
        Intent intent = new Intent(context, Example3Activity.class);
        context.startActivity(intent);
    }
}
