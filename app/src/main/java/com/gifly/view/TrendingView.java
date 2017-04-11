package com.gifly.view;

import com.gifly.model.Trending;


public interface TrendingView {
    void trendingSuccess(Trending trending);
    void trendingFailure(String errorMessage);
    void showLoading();
    void hideLoading();
    void showError();
    void hideError();
}
