package com.mantum.mykotlinapp.superHeroApp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val response : String,
    @SerializedName("results-for") val resultsFor : String,
    @SerializedName("results") val superheroes : List<SuperHeroItemResponse>
) {}

data class SuperHeroItemResponse(
    @SerializedName("id") val superheroId : String,
    @SerializedName("name") val name : String,
    @SerializedName("image") val image : SuperHeroImagerUrlResponse
) {}

data class SuperHeroImagerUrlResponse(
    @SerializedName("url") val url : String
)