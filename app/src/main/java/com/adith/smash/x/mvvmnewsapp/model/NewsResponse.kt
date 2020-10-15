package com.adith.smash.x.mvvmnewsapp.model

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)