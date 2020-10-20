package com.mj.gof_factory_pattern.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mj.gof_factory_pattern.R
import com.mj.gof_factory_pattern.Factorys.SnackFactory
import com.mj.gof_factory_pattern.Factorys.SnackType
import com.mj.gof_factory_pattern.Snacks.ChocolateSnack

class MainActivity : AppCompatActivity() {

    // 팩토리 패턴은 클래스 생성자를 대처하기 위해 사용된다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makeChocolateSnack = SnackFactory().makeSnack(SnackType.CHOCOLATE_SNACK)

        Log.d("In MainActivity : ", makeChocolateSnack!!.snackName )
        makeChocolateSnack.printResult

        val makeOnionSnack = SnackFactory().makeSnack(SnackType.ONION_SNACK)

        Log.d("In MainActivity : ", makeOnionSnack!!.snackName )
        makeOnionSnack.printResult

        val makePhotatoSnack = SnackFactory().makeSnack(SnackType.POTATO_SNACK)

        Log.d("In MainActivity : ", makePhotatoSnack!!.snackName )
        makePhotatoSnack.printResult
    }
}