package com.adith.smash.x.mvvmnewsapp.database

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.adith.smash.x.mvvmnewsapp.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}