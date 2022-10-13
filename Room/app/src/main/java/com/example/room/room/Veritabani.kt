package com.example.room.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.room.data.Modelnot


@Database(entities = arrayOf(Modelnot::class), version = 13)
abstract class Veritabani: RoomDatabase() {
    abstract fun notdao():Notdao


}







