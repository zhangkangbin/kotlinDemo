package com.zkb.kotlindemo

class People (val name: String){

    fun println(){
        println("i am a people .")
    }

    fun  testObj(){

        var basePeople= BasePeople("first")
        basePeople.role()
    }
}