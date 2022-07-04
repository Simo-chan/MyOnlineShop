package com.example.myonlineshop

class Computer(
    name: String,
    price: Double,
    quantity: Int,
    private val cpu: String,
    private val gpu: String
) : Product(name, price, quantity) {
    override fun toString(): String {
        return "Name=$name,Price=$price,Amount left=$quantity"
    }
}