package com.ardysetiawan.a182101901_ardysetiawanuts22_4_2020.Service;

import com.ardysetiawan.a182101901_ardysetiawanuts22_4_2020.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUserList();
}
