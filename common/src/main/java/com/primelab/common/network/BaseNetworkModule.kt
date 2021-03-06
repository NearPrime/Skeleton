package com.primelab.common.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * Created by m.imran
 * Senior Software Engineer at
 * PrimeLab.io on 09/02/2022.
 */
interface BaseNetworkModule {
    fun getBaseUrl(): String
    fun getRetrofit(httpClient: OkHttpClient, suffix: String = ""): Retrofit
    fun getOkHttpClient(autInterceptor: Interceptor?): OkHttpClient
    fun <T> getAPi(retrofit: Retrofit, clazz: Class<T>): T
}