package com.example.room.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.room.data.Modelnot
import com.example.room.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Anasayfaviewmodel @Inject constructor(var repo: Repository): ViewModel() {
    var getdataa= MutableLiveData<List<Modelnot>>()

    init {

        getdataa=repo.getdatagotur()
    }

    fun repoyagit(){
        repo.getnot()

    }
    fun notsil(not_id:Int){
        repo.notsil(not_id)
    }
}