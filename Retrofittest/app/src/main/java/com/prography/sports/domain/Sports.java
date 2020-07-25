package com.prography.sports.domain;

import com.google.gson.annotations.SerializedName;

/**
 * 서버와 통신하기 위해 객체 작성
 * Response 값과 동일
 * 생성자와, getter / setter 생성
 */
public class Sports {

    @SerializedName("rank")
    private int rank;
    @SerializedName("url")
    private String url;
    @SerializedName("title")
    private String title;

    public Sports(int rank, String url, String title) {
        this.rank = rank;
        this.url = url;
        this.title = title;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
