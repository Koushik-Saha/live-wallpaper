package com.example.varianttecnology.androidlivewallpaper.Remote;

import java.util.concurrent.TimeUnit;

import retrofit2.Retrofit;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofitClient;

    public static Retrofit getClient(String baseURL)
    {
        if (retrofitClient == null)
        {
            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .readTimeout(60, TimeUnit.SECONDS)
                    .connectTimeout(60,TimeUnit.SECONDS)
                    .build();
            retrofitClient = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofitClient;
    }
}
