package com.faircorp.Service

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://faircorp-adnane-mbarki.cleverapps.io/api/")
            .build()
            .create(WindowApiService::class.java)
    }

    val roomsApiService : RoomApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://faircorp-adnane-mbarki.cleverapps.io/api/")
            .build()
            .create(RoomApiService::class.java)
    }
}