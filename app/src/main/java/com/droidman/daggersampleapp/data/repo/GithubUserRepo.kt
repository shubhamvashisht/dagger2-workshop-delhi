package com.droidman.daggersampleapp.data.repo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.droidman.daggersampleapp.data.model.GithubUserModel
import com.droidman.daggersampleapp.data.network.GithubService
import com.droidman.daggersampleapp.di.component.DaggerGithubUserRepoComponent
import com.droidman.daggersampleapp.di.component.GithubUserRepoComponent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class GithubUserRepo () {

    @Inject
    lateinit var githubService: GithubService
    private lateinit var githubUserLiveData: MutableLiveData<GithubUserModel>

    init {
        githubUserLiveData = MutableLiveData()
       val component : GithubUserRepoComponent = DaggerGithubUserRepoComponent.builder().build();
        component.inject(this)
    }

    fun getUserDetails () : LiveData<GithubUserModel> {
        githubService.getUser().enqueue(object : Callback<GithubUserModel> {

            override fun onResponse(call: Call<GithubUserModel>?, response: Response<GithubUserModel>) {
               githubUserLiveData.value = response.body()
            }
            override fun onFailure(call: Call<GithubUserModel>?, t: Throwable?) {
            }
        })

        return githubUserLiveData
    }


}