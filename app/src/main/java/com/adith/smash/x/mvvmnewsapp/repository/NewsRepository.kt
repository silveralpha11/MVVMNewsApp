package com.adith.smash.x.mvvmnewsapp.repository

import com.adith.smash.x.mvvmnewsapp.database.ArticleDatabase
import com.adith.smash.x.mvvmnewsapp.model.Article
import com.adith.smash.x.mvvmnewsapp.network.RetrofitInstance

class NewsRepository( val db: ArticleDatabase) {

    // get semua data untuk di tampilkan di fragment breaking news
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
            RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchNews(searchQuery, pageNumber)

    // membuat database baru di local database
    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    // untuk get semua data yang sudah di bookmark
    fun getSavedNews() = db.getArticleDao().getAllArticles()

    // delete database local
    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}