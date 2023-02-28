package com.example.daggerhiltcourse.data.repository

import android.app.Application
import com.example.daggerhiltcourse.R
import com.example.daggerhiltcourse.data.remote.MyApi
import com.example.daggerhiltcourse.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application,
    private val hello: String
) : MyRepository {
    init {
        val appName = appContext.getString(R.string.app_name)
        println("$hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}