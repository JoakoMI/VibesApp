package com.joako.horoscopoapp.ui.home.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joako.horoscopoapp.R
import com.joako.horoscopoapp.databinding.FragmentLuckBinding


class LuckFragment : Fragment() {

    private var _binding: FragmentLuckBinding? =null
    private val binding get()=_binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return _binding!!.root
    }


}