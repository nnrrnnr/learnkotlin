package com.example.watanabear.learnkotlin

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.watanabear.learnkotlin.model.Article
import com.example.watanabear.learnkotlin.view.ArticleView

class ArticleActivity : AppCompatActivity() {

    companion object {
        private const val ARTICLE_EXTRA: String = "article"
        fun intent(context: Context, article: Article): Intent =
                Intent(context, ArticleActivity::class.java).putExtra(ARTICLE_EXTRA, article)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val a = findViewById(R.id.article_view) as ArticleView
        val w = findViewById(R.id.web_view) as WebView

        val article: Article = intent.getParcelableExtra(ARTICLE_EXTRA)
        a.setArticle(article)
        w.loadUrl(article.url)
    }
}
