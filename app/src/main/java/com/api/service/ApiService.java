package com.api.service;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by matias on 20/03/18.
 */

public interface ApiService {
    @GET("articles")
    Call<String> getArticles();

}
