package com.example.room.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.room.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class kayitviemodel @Inject constructor(var repo: Repository): ViewModel() {



    fun insert(baslik:String, icerik:String){
        repo.insert(baslik,icerik)
    }







}