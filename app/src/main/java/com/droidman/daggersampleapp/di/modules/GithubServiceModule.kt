package com.droidman.daggersampleapp.di.modules

import com.droidman.daggersampleapp.data.network.GithubService
import com.droidman.daggersampleapp.di.scope.SampleApplicationScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [NetworkModule::class])
class GithubServiceModule() {

    @SampleApplicationScope
    @Provides
    fun provideGithubService(retrofit: Retrofit) : GithubService {
        return retrofit.create(GithubService::class.java)
    }
}