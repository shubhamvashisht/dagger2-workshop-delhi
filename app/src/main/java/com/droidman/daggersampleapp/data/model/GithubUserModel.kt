package com.droidman.daggersampleapp.data.model

import com.google.gson.annotations.SerializedName

data class GithubUserModel(
        @SerializedName("name")
        val name: String,
        @SerializedName("location")
        val location: String,
        @SerializedName("company")
        val company: String,
        @SerializedName("bio")
        val bio: String,
        @SerializedName("followers")
        val followers: String,
        @SerializedName("following")
        val following: String,
        @SerializedName("avatar_url")
        val avatarUrl: String)