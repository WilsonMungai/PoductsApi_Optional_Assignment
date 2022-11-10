package com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.network

import com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.model.ProductResponse
import retrofit2.http.GET

interface ProductsAPI
{
    @GET("11")
    suspend fun getProductOne(): ProductResponse
}