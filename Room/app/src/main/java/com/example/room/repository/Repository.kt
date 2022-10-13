package com.example.room.repository

import androidx.lifecycle.MutableLiveData
import com.example.room.data.Modelnot
import com.example.room.room.Notdao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repository(var roomdao: Notdao) {
    var getdataana= MutableLiveData<List<Modelnot>>()

    fun getdatagotur(): MutableLiveData<List<Modelnot>> {
        return getdataana
    }






    fun insert( baslik:String, icerik:String){

        CoroutineScope(Dispatchers.Main).launch {
            val notmodel= Modelnot(0,baslik,icerik)
            roomdao.insertdata(notmodel)
        }
    }
    fun getnot(){
        CoroutineScope(Dispatchers.Main).launch {
            var livedataget=roomdao.getdata()
            getdataana.value=livedataget
        }
    }
    fun notsil(not_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            var modelnot= Modelnot(not_id, "", "")
            roomdao.notSil(modelnot)

        }
    }


}