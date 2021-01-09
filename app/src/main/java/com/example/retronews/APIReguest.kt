package com.example.retronews

import api.NewsApiJSON
import retrofit2.http.GET

interface APIReguest {
    @GET("/v1/latest-news?language=ru&apiKey=fg-qs3dnstcBS4NaGn2pnHJnKvm12vWv6eVwdfrkm0SMtqiC")
    suspend fun getNews():NewsApiJSON
}