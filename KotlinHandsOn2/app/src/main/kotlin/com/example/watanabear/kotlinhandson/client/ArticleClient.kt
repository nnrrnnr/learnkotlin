package com.example.watanabear.kotlinhandson.client

import com.example.watanabear.kotlinhandson.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
