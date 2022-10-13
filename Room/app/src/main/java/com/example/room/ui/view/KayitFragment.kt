package com.example.room.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.room.R
import com.example.room.databinding.FragmentKayitBinding
import com.example.room.ui.viewmodel.kayitviemodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KayitFragment : Fragment() {
    private lateinit var kviewmodel: kayitviemodel
    private lateinit var bindingggg: FragmentKayitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : kayitviemodel by viewModels()
        kviewmodel = tempViewModel
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        bindingggg= DataBindingUtil.inflate(inflater, R.layout.fragment_kayit, container, false)
        bindingggg.kfragment=this
        return bindingggg.root
    }


    fun kayit(baslik:String, icerik:String){
        kviewmodel.insert(baslik,icerik)
    }


}