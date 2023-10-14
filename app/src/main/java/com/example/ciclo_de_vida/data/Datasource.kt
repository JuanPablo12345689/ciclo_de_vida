package com.example.ciclo_de_vida.data
import com.example.ciclo_de_vida.R
import com.example.ciclo_de_vida.model.Dessert

object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.cupcake, price = 10, startProductionAmount = 0),
        Dessert(R.drawable.donut, price = 15, startProductionAmount = 5),
        Dessert(R.drawable.eclair, price = 18, startProductionAmount = 20),
        Dessert(R.drawable.froyo, price = 30, startProductionAmount = 50),
        Dessert(R.drawable.gingerbread, price = 50, startProductionAmount = 100),
        Dessert(R.drawable.honeycomb, price = 100, startProductionAmount = 200),
        Dessert(R.drawable.icecreamsandwich, price = 500, startProductionAmount = 500),
        Dessert(R.drawable.jellybean, price = 1000, startProductionAmount = 1000),
        Dessert(R.drawable.kitkat, price = 2000, startProductionAmount = 2000),
        Dessert(R.drawable.lollipop, price = 3000, startProductionAmount = 4000),
        Dessert(R.drawable.marshmallow, price = 4000, startProductionAmount = 8000),
        Dessert(R.drawable.nougat, price = 5000, startProductionAmount = 16000),
        Dessert(R.drawable.oreo, price = 6000, startProductionAmount = 20000),
    )
}