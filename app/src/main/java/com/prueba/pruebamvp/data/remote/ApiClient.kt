package com.prueba.pruebamvp.data.remote

import com.prueba.pruebamvp.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {
    private var servicesApiInterface: ApiService? = null

    fun build(): ApiService? {
        val builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl(BuildConfig.API_URL)
            .addConverterFactory(GsonConverterFactory.create())

        val httpClient: OkHttpClient.Builder = OkHttpClient.Builder()
        httpClient.connectTimeout(200, TimeUnit.SECONDS)
        httpClient.readTimeout(200, TimeUnit.SECONDS)
        httpClient.writeTimeout(200, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG)
            httpClient.addInterceptor(interceptor())
        //httpClient.addInterceptor(  StethoInterceptor())

        val retrofit: Retrofit = builder.client(httpClient.build()).build()

        servicesApiInterface = retrofit.create(ApiService::class.java)

        return servicesApiInterface as ApiService
    }

    private fun interceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }
}