package com.grog.daggerlib

class ClassAppC(var classAppA: ClassAppA) {
    fun result(): String{
        return "Result ClassAppC " + classAppA.result()
    }
}