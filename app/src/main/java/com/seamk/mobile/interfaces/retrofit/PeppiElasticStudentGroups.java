package com.seamk.mobile.interfaces.retrofit;

import com.seamk.mobile.elasticsearch.ElasticStudentGroups;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Juha Ala-Rantala on 26.2.2018.
 */

public interface PeppiElasticStudentGroups {
    @POST("/r1/search/peppireservation/reservation")
    Call<ElasticStudentGroups> getStudentGroups(@Body RequestBody body);
}
