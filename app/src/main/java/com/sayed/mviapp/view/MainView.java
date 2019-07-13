package com.sayed.mviapp.view;

import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.sayed.mviapp.presenter.MainViewState;

import io.reactivex.Observable;

public interface MainView extends MvpView {

    Observable<Integer> askQuestionIntent();

    Observable<Integer> getAnswerIntent();

    void render(MainViewState viewState);
}
