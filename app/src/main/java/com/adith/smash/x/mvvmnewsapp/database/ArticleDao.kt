package com.adith.smash.x.mvvmnewsapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.adith.smash.x.mvvmnewsapp.model.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}