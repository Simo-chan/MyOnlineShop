package com.example.myonlineshop

class Phone(
    name: String,
    price: Double,
    quantity: Int,
    private val ramMemory: Int,
    private val screenResolution: Double
) : Product(name, price, quantity) {
    override fun toString(): String {
        return "Name=$name,Price=$price,Amount left=$quantity"
    }
}