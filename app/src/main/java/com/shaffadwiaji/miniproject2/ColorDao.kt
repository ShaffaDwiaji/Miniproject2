package com.shaffadwiaji.miniproject2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ColorDao {

    @Query("SELECT * FROM Color")
    fun getAll(): List<Color>

    @Insert
    fun insert(vararg colors: Color)

    @Update
    fun update(color: Color)

    @Delete
    fun delete(color: Color)

}