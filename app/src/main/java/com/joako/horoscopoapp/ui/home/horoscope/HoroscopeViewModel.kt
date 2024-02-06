package com.joako.horoscopoapp.ui.home.horoscope

import androidx.lifecycle.ViewModel
import com.joako.horoscopoapp.data.providers.HoroscopeProvider
import com.joako.horoscopoapp.domain.model.HoroscopeInfo
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value=horoscopeProvider.getHoroscopes()

    }
}
