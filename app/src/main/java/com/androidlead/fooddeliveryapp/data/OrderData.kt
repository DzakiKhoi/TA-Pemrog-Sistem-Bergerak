package com.androidlead.fooddeliveryapp.data

data class OrderState(
    val amount: Int,
    val totalPrice: String
)

val OrderData = OrderState(
    amount = 5,
    totalPrice = "Rp20.000"
)