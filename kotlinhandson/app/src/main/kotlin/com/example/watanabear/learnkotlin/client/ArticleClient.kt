package com.example.watanabear.learnkotlin.client

import com.example.watanabear.learnkotlin.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by ryo on 2017/05/22.
 */
interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
