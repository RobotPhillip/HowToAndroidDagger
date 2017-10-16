package com.robotandpencils.app.ui.common.presenter;

import android.os.Bundle;

import com.robotandpencils.app.ui.common.view.MVPView;

import javax.annotation.Nullable;

/**
 * Abstract {@link Presenter} for all presenters to extend.
 *
 * @param <T> the type of the {@link MVPView}.
 */
public abstract class BasePresenter<T extends MVPView> implements Presenter  {

    protected final T view;

    protected BasePresenter(T view) {
        this.view = view;
    }

    @Override
    public void onStart(@Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

    @Override
    public void onEnd() {
    }

}
