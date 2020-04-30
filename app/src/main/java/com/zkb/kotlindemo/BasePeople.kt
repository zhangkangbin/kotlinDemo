package com.zkb.kotlindemo

class BasePeople(first: String) {

    val role: Int? = 1
    val name: String? = "no name"

    fun base() {

        println("---base---")
    }

    public fun role(): String {

        if (role == 1) return "11" else return "22"

    }
}