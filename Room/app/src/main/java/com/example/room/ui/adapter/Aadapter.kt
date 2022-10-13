package com.example.room.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.room.data.Modelnot
import com.example.room.R
import com.example.room.databinding.CardtasarimBinding
import com.example.room.ui.viewmodel.Anasayfaviewmodel
import com.google.android.material.snackbar.Snackbar

class Aadapter(var context: Context, var list:List<Modelnot>, var viewmodel: Anasayfaviewmodel): RecyclerView.Adapter<Aadapter.rowholder>() {
    inner class rowholder(var binding: CardtasarimBinding) : RecyclerView.ViewHolder(binding.root) {
        var bindinggg:CardtasarimBinding
        init {
            this.bindinggg=binding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rowholder {
        var binding= LayoutInflater.from(context)
        var bindingg=
            DataBindingUtil.inflate<CardtasarimBinding>(binding, R.layout.cardtasarim,parent,false)
        return rowholder(bindingg)
    }

    override fun onBindViewHolder(holder: rowholder, position: Int) {
        var not=list[position]
        val m=holder.binding
        m.modelll=not
        m.delete.setOnClickListener{
            Snackbar.make(it, "${not.baslik} silmek istediğinize emin misiniz? ",   Snackbar.LENGTH_LONG).setAction("Evet"){
                viewmodel.notsil(not.not_id)
            }.show()
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}