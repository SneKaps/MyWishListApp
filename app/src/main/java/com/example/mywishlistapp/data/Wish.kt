package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish_title")
    val title: String = "",
    @ColumnInfo(name = "wish_desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Get a job",
            description = "I want to have a job this year"),
        Wish(title = "A Laptop",
            description = "I want to buy Macbook"),
        Wish(title = "Passion",
            description = "I want to become and IAS officer and help the underprivileged people")
    )

}
