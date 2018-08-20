package com.droidman.daggersampleapp.di.component

import com.droidman.daggersampleapp.data.network.GithubService
import com.droidman.daggersampleapp.data.repo.GithubUserRepo
import com.droidman.daggersampleapp.di.modules.GithubServiceModule
import com.droidman.daggersampleapp.di.modules.NetworkModule
import com.droidman.daggersampleapp.di.scope.SampleApplicationScope
import dagger.Component

@SampleApplicationScope
@Component(modules = [NetworkModule::class, GithubServiceModule::class])
interface GithubUserRepoComponent {

    fun getGithubService () : GithubService

    fun inject(githubUserRepo: GithubUserRepo)
}