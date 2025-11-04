package com.vilin.kotlin

fun main(){
    var score = 80
    if(score in 90 .. 100){
        println("优秀")
    }else if(score in 80 .. 89){
        println("良好")
    }else if(score in 70 .. 79){
        println("中等")
    }else if(score in 60 .. 69){
        println("合格")
    }else{
        println("不合格")
    }

    score = if(score > 50) 1 else 0
    println(score)

}