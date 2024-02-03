package com.mantum.mykotlinapp.superHeroApp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface IApiService {


    @GET("/api/10160551525467773/search/{name}")
    suspend fun getSuperHero(@Path("name") superHeroName : String) : Response<SuperHeroDataResponse>

}