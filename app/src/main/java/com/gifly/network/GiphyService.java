package com.gifly.network;

import com.gifly.model.Trending;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GiphyService {

    String API_KEY = "dc6zaTOxFJmzC";
    String ENDPOINT = "http://api.giphy.com";
    Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl(ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @GET("/v1/gifs/trending?api_key=" + API_KEY)
    Call<Trending> getTrending(@Query("limit") int limit, @Query("offset") long offset);

}