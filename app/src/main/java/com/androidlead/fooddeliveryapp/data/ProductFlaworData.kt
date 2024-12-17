package com.androidlead.fooddeliveryapp.data

import androidx.annotation.DrawableRes
import com.androidlead.fooddeliveryapp.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.img_cheese,
        name = "Keju Cheddar",
        price = "Rp3.000"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_bacon,
        name = "Daging",
        price = "Rp5.000"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_onion,
        name = "Bawang",
        price = "Rp1.000"
    )
)