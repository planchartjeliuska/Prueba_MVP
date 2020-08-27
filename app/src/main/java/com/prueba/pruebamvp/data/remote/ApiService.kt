package com.prueba.pruebamvp.data.remote

import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModels
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {


    @GET("faker/V1/productosfk.php")
    fun getItems(): Call<ResponseModels>
}