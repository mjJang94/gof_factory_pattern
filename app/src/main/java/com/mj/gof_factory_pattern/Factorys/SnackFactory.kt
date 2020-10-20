package com.mj.gof_factory_pattern.Factorys

import com.mj.gof_factory_pattern.Snacks.ChocolateSnack
import com.mj.gof_factory_pattern.Snacks.OnionSnack
import com.mj.gof_factory_pattern.Snacks.PhotatoSnack


class SnackFactory {

    fun makeSnack(snack: SnackType): Snack?{
        return when(snack){

            SnackType.POTATO_SNACK -> PhotatoSnack()

            SnackType.CHOCOLATE_SNACK -> ChocolateSnack()

            SnackType.ONION_SNACK -> OnionSnack()

        }
    }
}