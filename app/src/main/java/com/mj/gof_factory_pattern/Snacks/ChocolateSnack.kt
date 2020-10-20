package com.mj.gof_factory_pattern.Snacks

import android.util.Log
import com.mj.gof_factory_pattern.Factorys.Snack

class ChocolateSnack : Snack{

    override val snackName: String
        get() = "초코 스낵 생성"

    override val printResult: Unit
        get() = resultOfProduction()

    private fun resultOfProduction() {
        Log.d("result: ", snackName)
    }
}