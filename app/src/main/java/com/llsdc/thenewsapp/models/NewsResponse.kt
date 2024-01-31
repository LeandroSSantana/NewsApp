package com.llsdc.thenewsapp.models

import com.llsdc.thenewsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)