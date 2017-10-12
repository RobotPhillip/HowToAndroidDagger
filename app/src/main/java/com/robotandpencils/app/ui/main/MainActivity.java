package com.robotandpencils.app.ui.main;

import android.content.Intent;
import android.os.Bundle;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseActivity;
import com.robotandpencils.app.ui.example_1.Example1Activity;
import com.robotandpencils.app.ui.example_2.Example2Activity;
import com.robotandpencils.app.ui.example_3.Example3Activity;

import javax.annotation.Nullable;

/**
 * Created by pwray on 2017-10-02.
 */

public final class MainActivity extends BaseActivity implements MainFragmentListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new MainFragment());
        }
    }

    @Override
    public void onExample1Clicked() {
        // TODO start example 1 activity
//        Toast.makeText(this, "Launch example 1", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Example1Activity.class);
        startActivity(intent);
    }

    @Override
    public void onExample2Clicked() {
        // TODO start example 2 activity
//        Toast.makeText(this, "Launch example 2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Example2Activity.class);
        startActivity(intent);
    }

    @Override
    public void onExample3Clicked() {
        // TODO start example 3 activity
//        Toast.makeText(this, "Launch example 3", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Example3Activity.class);
        startActivity(intent);
    }
}
