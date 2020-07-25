package com.prography.sports.service;

import com.prography.lib.RetrofitClient;
import com.prography.api.RetrofitTestApi;
import com.prography.sports.domain.Sports;
import com.prography.sports.dto.ResponseDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class SportServices {

    private RetrofitTestApi retrofitTestApi;

    public SportServices() {
        this.retrofitTestApi = RetrofitClient.getInstance();
    }

    /**
     * Client -> server
     * GET
     */
    public void retrieveSports(Callback<List<Sports>> callback){
        Call<List<Sports>> call = retrofitTestApi.getSportInfo();
        call.enqueue(callback);
    }
}
