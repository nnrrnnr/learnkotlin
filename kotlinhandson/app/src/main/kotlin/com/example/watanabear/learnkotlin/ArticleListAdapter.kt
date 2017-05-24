package com.example.watanabear.learnkotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.watanabear.learnkotlin.model.Article
import com.example.watanabear.learnkotlin.view.ArticleView

class ArticleListAdapter(context: Context) : ArrayAdapter<Article>(context, android.R.layout.simple_list_item_1) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View =
            ((convertView as? ArticleView) ?: ArticleView(context)).apply {
                setArticle(getItem(position))
            }
}