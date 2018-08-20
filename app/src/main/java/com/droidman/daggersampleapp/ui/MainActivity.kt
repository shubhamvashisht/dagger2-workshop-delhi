package com.droidman.daggersampleapp.ui

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.droidman.daggersampleapp.R
import com.droidman.daggersampleapp.data.model.GithubUserModel
import com.droidman.daggersampleapp.data.repo.GithubUserRepo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var githubUserRepo : GithubUserRepo = GithubUserRepo()

        githubUserRepo.getUserDetails().observe(this, Observer<GithubUserModel> {
            Toast.makeText(this,it.toString(),Toast.LENGTH_SHORT).show()
        })
    }
}
