package com.example.watanabear.learnkotlin.view

import android.content.Context
import android.databinding.BindingMethod
import android.databinding.BindingMethods
import android.databinding.DataBindingUtil
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.watanabear.learnkotlin.R
import com.example.watanabear.learnkotlin.bindView
import com.example.watanabear.learnkotlin.databinding.ViewArticleBinding
import com.example.watanabear.learnkotlin.model.Article

@BindingMethods(BindingMethod(type = Article::class,
        attribute = "bind:article",
        method = "setArticle"))
class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    val binding: ViewArticleBinding

    init {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_article, this, true)
    }

    private val profileImageView: ImageView by bindView(R.id.profile_image_view)

    private val titleTextView: TextView by  bindView(R.id.title_text_view)

    private val userNameTextView: TextView by bindView(R.id.user_name_text_view)

    fun setArticle(article: Article) {
        binding.article = article
    }
}