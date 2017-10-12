package com.robotandpencils.app.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robotandpencils.app.R;
import com.robotandpencils.app.ui.common.BaseFragment;

import javax.annotation.Nullable;
import javax.inject.Inject;

/**
 * Created by pwray on 2017-09-27.
 */

public final class MainFragment extends BaseFragment implements View.OnClickListener {

    @Inject
    MainFragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // TODO (Butterknife) replace with butterknife view binding
        view.findViewById(R.id.example_1).setOnClickListener(this);
        view.findViewById(R.id.example_2).setOnClickListener(this);
        view.findViewById(R.id.example_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.example_1:
                onExample1Clicked();
                break;
            case R.id.example_2:
                onExample2Clicked();
                break;
            case R.id.example_3:
                onExample3Clicked();
                break;
            default:
                throw new IllegalArgumentException("Unhandled view " + view.getId());
        }
    }

    private void onExample1Clicked() {
        listener.onExample1Clicked();
    }

    private void onExample2Clicked() {
        listener.onExample2Clicked();
    }

    private void onExample3Clicked() {
        listener.onExample3Clicked();
    }
}
