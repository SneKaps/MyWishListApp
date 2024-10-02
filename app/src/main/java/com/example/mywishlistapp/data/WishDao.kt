package com.example.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun addWish(wishEntity : Wish)

    @Query("Select * from 'wish_table'")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)       //adding a suspend keyword because both update and delete will happen in the background

    @Delete
    abstract suspend fun deleteAwish(wishEntity: Wish)

    @Query("Select * from 'wish_table' where id=:id")
    abstract fun getAWishById(id:Long): Flow<Wish>

}