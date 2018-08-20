package com.droidman.daggersampleapp.data.network

import android.arch.lifecycle.LiveData
import com.droidman.daggersampleapp.data.model.GithubUserModel
import retrofit2.Call
import retrofit2.http.GET

interface GithubService {
    @GET("https://api.github.com/users/shubhamvashisht")
    fun getUser(): Call<GithubUserModel>
}