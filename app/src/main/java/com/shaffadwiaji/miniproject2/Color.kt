package com.shaffadwiaji.miniproject2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Color(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "hex_value") val hexValue: String?,
    @ColumnInfo(name = "name") val name: String?
)
