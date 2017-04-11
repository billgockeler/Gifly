package com.gifly.view;

import com.gifly.network.GiphyService;
import com.gifly.model.Trending;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TrendingPresenter {

    private GiphyService mService;
    private TrendingView mView;


    public TrendingPresenter(GiphyService service, TrendingView trendingView){
        mService = service;
        mView = trendingView;
    }


    public void getTrending(int limit, long offset) {

        mView.showLoading();
        mView.hideError();

        Call<Trending> call = mService.getTrending(limit, offset);
        call.enqueue(new Callback<Trending>() {
            @Override
            public void onResponse(Call<Trending> call, Response<Trending> response) {
                mView.trendingSuccess(response.body());
                mView.hideLoading();
            }

            @Override
            public void onFailure(Call<Trending> call, Throwable t) {
                mView.trendingFailure(t.getMessage());
                mView.hideLoading();
                mView.showError();
            }
        });
    }






}
