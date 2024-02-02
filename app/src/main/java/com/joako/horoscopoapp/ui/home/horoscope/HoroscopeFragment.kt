package com.joako.horoscopoapp.ui.home.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joako.horoscopoapp.R
import com.joako.horoscopoapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    private var _binding:FragmentHoroscopeBinding? = null
    private val  binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return _binding!!.root
    }

}