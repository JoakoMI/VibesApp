package com.joako.horoscopoapp.data.providers

import com.joako.horoscopoapp.domain.model.HoroscopeInfo
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Aquario
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Aries
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Cancer
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Capricornio
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Escorpio
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Geminis
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Leo
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Libra
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Piscis
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Sagitario
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Tauro
import com.joako.horoscopoapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject


class HoroscopeProvider @Inject constructor(){

    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Aquario,
            Cancer,
            Capricornio,
            Escorpio,
            Geminis,
            Leo,
            Libra,
            Piscis,
            Sagitario,
            Tauro,
            Virgo,
        )
    }
}