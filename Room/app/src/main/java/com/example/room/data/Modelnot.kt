package com.example.room.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Modelnot(@PrimaryKey(autoGenerate = true) var not_id: Int, @ColumnInfo(name = "baslik") var baslik:String, @ColumnInfo(name = "icerik") var icerik:String ) {
}