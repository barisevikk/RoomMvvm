package com.example.room.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.room.ui.adapter.Aadapter
import com.example.room.R
import com.example.room.databinding.FragmentAnasayfaBinding
import com.example.room.ui.viewmodel.Anasayfaviewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {
    private lateinit var viemodelll: Anasayfaviewmodel
    private lateinit var bindingg: FragmentAnasayfaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewmodel: Anasayfaviewmodel by viewModels()
        viemodelll = viewmodel
        viewmodel.repoyagit()


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viemodelll.getdataa.observe(viewLifecycleOwner) {
            val adapter = Aadapter(requireContext(), it,viemodelll)
            bindingg.adapterr = adapter
            fab()
        }
        // Inflate the layout for this fragmenrt
        bindingg = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)
        return bindingg.root
    }

    fun fab() {
        bindingg.fab.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToKayitFragment()
            findNavController().navigate(gecis)
        }
    }
}



