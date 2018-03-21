package com.api.adapter;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by matias on 20/03/18.
 */

public class ApiAdapter {

    private static ApiAdapter API_SERVICE;

    public static ApiAdapter getApiService(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httClient = new OkHttpClient.Builder();

        httClient.addInterceptor(logging);

        String base_url = "http://diario.brickdiario.com/api/v1/";

        if (API_SERVICE == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httClient.build())
                    .build();
            API_SERVICE = retrofit.create(ApiAdapter.class);

        }

        return API_SERVICE;
    }
}
