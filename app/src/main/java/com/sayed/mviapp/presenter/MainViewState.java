package com.sayed.mviapp.presenter;

public class MainViewState {


    public boolean loading;
    public boolean questionShown;
    public boolean answerShown;
    public String textToShow;
    public Throwable error;

    public MainViewState(boolean loading, boolean questionShown, boolean answerShown, String textToShow, Throwable error) {
        this.loading = loading;
        this.questionShown = questionShown;
        this.answerShown = answerShown;
        this.textToShow = textToShow;
        this.error = error;
    }
}
