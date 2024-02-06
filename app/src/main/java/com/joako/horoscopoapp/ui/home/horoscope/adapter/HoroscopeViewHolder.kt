package com.joako.horoscopoapp.ui.home.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.joako.horoscopoapp.databinding.ItemHoroscopeBinding
import com.joako.horoscopoapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {

        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscope.setText(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotation(binding.ivHoroscope, newLambda = {onItemSelected})
            onItemSelected(horoscopeInfo)
        }
    }

    private fun startRotation(view: View, newLambda: () -> Unit) {
        view.animate().apply {
            duration = 250
            interpolator=LinearInterpolator()
            rotationBy(360f)
            withEndAction {  }
            start()
        }

    }
}