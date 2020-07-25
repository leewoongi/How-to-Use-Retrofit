package com.prography.sports.retrofittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.prography.sports.domain.Sports;
import com.prography.sports.dto.ResponseDto;
import com.prography.sports.service.SportServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SPORTS_SERVICES";
    private SportServices services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Retrofit 객체 생성
         */
        services = new SportServices();
        services.retrieveSports(new Callback<List<Sports>>() {
            @Override
            public void onResponse(Call<List<Sports>> call, Response<List<Sports>> response) {
                if(response.isSuccessful() == false){
                    Log.d(TAG, "Failed to register");
                }

                for(Sports item : response.body()){
                    System.out.println("====>" + item.getTitle() + "" + item.getUrl() + "" + item.getRank());
                }
            }

            @Override
            public void onFailure(Call<List<Sports>> call, Throwable t) {
                Log.d(TAG, t.getMessage());
            }
        });
    }
}