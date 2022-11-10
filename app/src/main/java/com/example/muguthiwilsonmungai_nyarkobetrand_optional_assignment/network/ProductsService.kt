package com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProductsService
{
    private val retrofitBuilder = Retrofit
        .Builder()
        .baseUrl("https://dummyjson.com/products/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofit = retrofitBuilder.create(ProductsAPI::class.java)
}