package com.gallardo.cyber_cartel.api.models

data class ProductsItem(
    val id: Int,
    val name: String,
//    val photo: Image,
    val price: String,
    val details: String,
    val category: String,
    val quantity: String,
)