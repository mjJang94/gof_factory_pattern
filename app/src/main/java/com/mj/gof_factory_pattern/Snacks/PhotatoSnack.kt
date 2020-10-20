package com.mj.gof_factory_pattern.Snacks

import android.util.Log
import com.mj.gof_factory_pattern.Factorys.Snack

class PhotatoSnack : Snack {

    override val snackName: String
        get() = "감자 스낵 생성"

    override val printResult: Unit
        get() = resultOfProduction()

    fun resultOfProduction() {
        Log.d("result: ", snackName)
    }
}