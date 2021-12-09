package com.example.bookfilterwithroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true)
    val book_id:Int,
    val title:String,
    val author:String,
    val language:String,
    val year:Int,
    val pages:Int
)