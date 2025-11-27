package com.vilin.kotlin

// 看懂这个函数变量
var func: (Int) -> ((String) -> Double) = fun(param: Int) = fun(str: String) = 1.0


fun main(){
    // 表示一个接受String作为参数返回值为Int类型的函数类型
    var func: (String) -> Int

    test{
        println(it)
        100
    }

    val student: Student = Student().apply {
        name = "Vilin"
        age = 18
    }
}

class Student {
    var name: String = ""
    var age: Int = 0
}

var func1: (String) -> Int = {
    println(it)
    10
}

var func2: (String, String) -> Int = {
    a, b ->
    println(a)
    println(b)
    100
}


fun test(func: (String) -> Int) {
    println(func("Hello World"))
}

//inline fun test(func: (String) -> Unit){
//    println("这是一个内联函数")
//    func("Hello World")
//}