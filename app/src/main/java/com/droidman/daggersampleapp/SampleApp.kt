package com.droidman.daggersampleapp

import android.app.Application
import com.droidman.daggersampleapp.data.network.GithubService
import com.droidman.daggersampleapp.data.repo.GithubUserRepo

class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}