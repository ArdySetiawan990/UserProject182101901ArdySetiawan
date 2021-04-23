package com.ardysetiawan.a182101901_ardysetiawanuts22_4_2020.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/users";
    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory)
                    .build();
        }
        return retrofit;
    }
}
