package com.prography.api;

import com.prography.sports.domain.Sports;
import com.prography.sports.dto.ResponseDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 서버와 통신하기 위해 인터페이스 생성
 * 통신방식에는 GET / PUT / POST / DELETE ..
 */
public interface RetrofitTestApi {

    /**
     * Call 의 타입은 ResponseDto
     * Head, qurey, body 아무것도 없음
     */

    @GET("naversports")
    Call<List<Sports>> getSportInfo();

}
