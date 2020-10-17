package com.example.farmaapp.network

import com.example.farmaapp.model.pojo.PharmaApp
import com.example.farmaapp.model.pojo.PharmaAppitem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface PharmaAPI {


    @GET("getLocalesTurnos")
    fun fetchFromInternet() : Call<List<PharmaAppitem>>

    //B THIS IS WHITH COROUTINES

    @GET("getLocalesTurnos")
    suspend fun fetchDataFromInternetCoroutines()
    : Response<List<PharmaAppitem>>
}