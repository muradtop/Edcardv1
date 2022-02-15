package com.example.edcardv1;

import android.app.Application;

import com.example.edcardv1.network.PixabayApi;
import com.example.edcardv1.network.RetrofitClient;


public class App extends Application {
    PixabayApi api;
    public static RetrofitClient retrofitClient;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api = retrofitClient.providePixabayApi();
    }
}
