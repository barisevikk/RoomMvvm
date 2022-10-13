package com.example.room.room

import androidx.room.*
import com.example.room.data.Modelnot

@Dao
interface Notdao {

    @Query("SELECT * FROM modelnot ")
    suspend fun getdata():List<Modelnot>

    @Insert
    suspend fun insertdata(  model: Modelnot)

    @Update
    suspend fun notGuncelle(modeol: Modelnot)

    @Delete
    suspend fun notSil(kisi: Modelnot)

}