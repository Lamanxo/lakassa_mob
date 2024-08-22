package com.waj.kassa_mobile.remote;

import android.database.Observable;

import com.waj.kassa_mobile.model.TblUser;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IMyApi {


    //auth
    //sign_up

    @POST("auth")
    Observable<String> loginUser (@Body TblUser user);

    @POST("sign_up")
    Observable<String> registerUser(@Body TblUser user);




}
