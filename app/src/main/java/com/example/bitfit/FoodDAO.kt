package com.example.bitfit
import androidx.room.*
    @Dao
    interface FoodDAO {
        @Query("SELECT * FROM food_table")
        fun getAll(): List<FoodEntity>

        @Insert
        fun insert(food: FoodEntity)

        @Query("DELETE FROM food_table")
        fun deleteAll()
    }

