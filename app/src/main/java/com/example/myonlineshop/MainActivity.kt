package com.example.myonlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val searchForPhone: Button = findViewById(
            R.id.phoneButton
        )
        searchForPhone.setOnClickListener {
            val samsung = Phone("Galaxy", 999.99, 32, 10, 1080.0)
            val apple = Phone("Iphone", 1099.99, 54, 8, 4000.0)
            val huawei = Phone("Mate Pro", 899.90, 23, 12, 2040.0)
            val phoneList = ArrayList<Phone>()
            phoneList.add(samsung)
            phoneList.add(apple)
            phoneList.add(huawei)
            val cheapestPhone = getCheapestProduct(phoneList)
            Log.d("message", cheapestPhone.toString())
        }
        val searchForComputer: Button = findViewById((R.id.computerButton))
        searchForComputer.setOnClickListener {
            val hp = Computer("Model355", 1200.0, 88, "Intel core i7", "GeForce RTX3080")
            val huaweiPC =
                Computer("Matebook", 1299.90, 55, "Intel core i9", "GeForce RTX3090")
            val applePC = Computer("MacBook", 9999.99, 100, "M1", "Intel Pentium")
            val computerList = ArrayList<Computer>()
            computerList.add(hp)
            computerList.add(huaweiPC)
            computerList.add(applePC)
            val cheapestComputer = getCheapestProduct(computerList)
            Log.d("message", cheapestComputer.toString())
        }
        val searchForTable: Button = findViewById(R.id.tableButton)
        searchForTable.setOnClickListener {
            val ikea = Table("Grög", 98.0, 44, "Wood", "Beige")
            val ikea2 = Table("Linnmon", 40.0, 50, "Wood", "White")
            val ikea3 = Table("Malm", 189.0, 11, "Wood", "White")
            val tableList = ArrayList<Table>()
            tableList.add(ikea)
            tableList.add(ikea2)
            tableList.add(ikea3)
            val getTable = getCheapestProduct(tableList)
            Log.d("message", getTable.toString())
        }
    }
}

fun getCheapestProduct(productList: List<Product>): Product {
    if (productList.isEmpty()) {
        Log.d("message", "Array is empty")
        throw IllegalArgumentException("Array is empty")
    }
    var cheapestProduct = productList[0]
    for (element in productList) {
        if (cheapestProduct.price > element.price) {
            cheapestProduct = element
        }
    }
    return cheapestProduct
}
