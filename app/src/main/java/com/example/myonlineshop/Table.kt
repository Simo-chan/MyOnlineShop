package com.example.myonlineshop

class Table(
    name: String,
    price: Double,
    quantity: Int,
    private val material: String,
    private val color: String
) : Product(name, price, quantity) {
    override fun toString(): String {
        return "Name=$name,Price=$price,Amount left=$quantity"
    }
}