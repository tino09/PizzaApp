package com.app.waleent.pizzaapp;

import com.app.waleent.pizzaapp.network.Token;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by wale on 9/27/17.
 */

public interface UserInterface {
    @POST("api-jwt-auth/{username}/{password}")
    Call<Token> authenticate(@Path("username") String username, @Path("password") String password);
}
