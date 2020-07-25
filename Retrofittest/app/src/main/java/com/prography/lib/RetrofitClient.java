package com.prography.lib;

import com.prography.api.RetrofitTestApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *  Retrofit 객체 생성
 *  객체 생성시 싱글톤으로 생성
 *  GSON Convert 사용
 */
public class RetrofitClient {

    private static Retrofit service = null;
    private static final String baseUrl = "https://taxijjang-sports-api.herokuapp.com";

    private RetrofitClient() {}

    public static RetrofitTestApi getInstance(){

        if(service == null){
            service = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return service.create(RetrofitTestApi.class);
    }
}
