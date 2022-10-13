package com.example.room.di

import android.content.Context
import androidx.room.Room
import com.example.room.repository.Repository
import com.example.room.room.Notdao
import com.example.room.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class Appmodule {
    @Provides
    @Singleton
    fun provedirrepository(roomdao: Notdao): Repository {
        return Repository(roomdao)
    }
    @Provides
    @Singleton
    fun provediroomdao(@ApplicationContext context: Context):Notdao{
        var vt= Room.databaseBuilder(context, Veritabani::class.java, "notdefteri.sqlite").build()
        return vt.notdao()
    }

}




