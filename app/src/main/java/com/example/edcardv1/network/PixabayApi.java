package com.example.edcardv1.network;





import com.example.edcardv1.network.model.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayApi {
    @GET("/api")
    Call<PixabayResponse> getImages(@Query("key") String key, @Query("q") String keyWord);

}
